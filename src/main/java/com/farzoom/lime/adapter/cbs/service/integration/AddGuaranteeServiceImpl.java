package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.*;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.AddGuaranteeRequest.BankSvcRq;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static com.farzoom.lime.adapter.cbs.utils.MoneyUtils.*;
import static org.apache.logging.log4j.util.Strings.isBlank;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

/**
 * Created by vladimir on 03.09.2018.
 */
@Service
public class AddGuaranteeServiceImpl implements IntegrationService<AddGuaranteeRequest> {
    private static final String FIN_SITUATION_TEMPLATE = "Предоставлена бух отчетность за %d. Чистая прибыль %s т.р. Выручка %s тыс. руб.";

    private static final String FOUNDER_REL_TYPE = "Учредитель";
    private static final String MAIN_REL_TYPE = "Руководитель";
    private static final String BEN_REL_TYPE = "Бенефициарный владелец";

    private final AddressRepository addressRepository;
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final CompanyRepository companyRepository;
    private final CompanyBuhRepository companyBuhRepository;
    private final GenParamService genParamService;
    private final ObjectFactory of;

    public AddGuaranteeServiceImpl(AppConfig config) {
        this.addressRepository = new AddressRepository(config.getElasticsearchBaseUrl());
        this.relationRepository = new RelationRepository(config.getElasticsearchBaseUrl());
        this.personRepository = new PersonRepository(config.getElasticsearchBaseUrl());
        this.companyRepository = new CompanyRepository(config.getElasticsearchBaseUrl());
        this.companyBuhRepository = new CompanyBuhRepository(config.getElasticsearchBaseUrl());
        this.genParamService = new GenParamServiceImpl(
                new AttributeRepository(config.getElasticsearchBaseUrl()),
                new GroupRepository(config.getElasticsearchBaseUrl()),
                new ParamRepository(config.getElasticsearchBaseUrl()),
                new RefServiceImpl(
                        new EsRepository(config.getElasticsearchBaseUrl())
                )
        );
        this.of = new ObjectFactory();
    }

    @Override
    public AddGuaranteeRequest createRequest(Order order, Company principal, Product product) {
        AddGuaranteeRequest request = of.createFDX();
        request.setBankSvcRq(fillBankSvcRq(order, principal, product));
        request.setServerInfo(fillServerInfo());
        return request;
    }

    private BankSvcRq fillBankSvcRq(Order order, Company principal, Product product) {
        BankSvcRq bankSvcRq = of.createFDXBankSvcRq();
        //ID сделки в МООСе необязательное поле
        bankSvcRq.setRequestId(order.getId());
        //Гуид Клиента в АБС заполняется не всегда
        bankSvcRq.setOrgId(null);
        //ИД Клиента в Фазуме необязательно поле
        bankSvcRq.setExtOrgId(order.getPrincipalCompanyId());
        bankSvcRq.setOrgInfo(fillOrgInfo(order, principal, product));
        bankSvcRq.setProdInfo(fillProdInfo(product));
        bankSvcRq.setOrg2OrgList(fillBeneficiary(product));
        return bankSvcRq;
    }

    private OrgInfoCType fillOrgInfo(Order order, Company principal, Product product) {
        Address legalAddress = loadAddress(principal.getLegalAddress());
        Address actualAddress = loadAddress(principal.getActualAddress());
        Address postalAddress = loadAddress(principal.getPostalAddress());
        if (postalAddress == null) postalAddress = actualAddress;
        Contact contact = !CollectionUtils.isEmpty(principal.getContacts()) ? principal.getContacts().iterator().next() : null;

        OrgInfoCType orgInfo = of.createOrgInfoCType();
        orgInfo.setLegalName(principal.getFullName());
        orgInfo.setName(principal.getDisplayName());
        orgInfo.setTaxId(principal.getINN());
        orgInfo.setTaxRegCode(principal.getKPP());
        orgInfo.setStateRegPrimeNum(principal.getOGRN());

        OrgInfoCType.PropertyForm propertyForm = fillPropertyForm(principal);
        orgInfo.setPropertyForm(propertyForm);

        OrgInfoCType.AddInfo addInfo = fillAddInfo(order, principal, product);
        orgInfo.setAddInfo(addInfo);

        OrgInfoCType.ClassifierList classifierList = of.createOrgInfoCTypeClassifierList();
        classifierList.getClassifierId().add(fillClassifierId("RUS.OKOPF", principal.getOKOPF()));
        classifierList.getClassifierId().add(fillClassifierId("RUS.OKATO", principal.getOKATO()));
        classifierList.getClassifierId().add(fillClassifierId("RUS.OKPO", principal.getOKPO()));
        classifierList.getClassifierId().add(fillClassifierId("RUS.OKGU", ""));
        if (legalAddress != null)
            classifierList.getClassifierId().add(fillClassifierId("RUS.OKTMO", legalAddress.getOktmo()));
        orgInfo.setClassifierList(classifierList);

        if (principal.getStatedCapital() != null && principal.getStatedCapital().getSum() != null) {
            CurrencyAmount statedCapCurrAmount = fillCurrencyAmount(principal.getStatedCapital().getSum(), RUB_CODE);
            orgInfo.setAuthCapCurAmt(statedCapCurrAmount);
        }

        GenParam pscaParam = genParamService.loadOne("company", principal.getId(), "company.paidStatedCapitalAmount");
        if (GenParamUtils.hasMoneyValue(pscaParam)) {
            CurrencyAmount statedPayedCapCurrAmount = fillCurrencyAmount(pscaParam.getValue().getMoneyValue().longValue(), RUB_CODE);
            orgInfo.setAuthCapPayCurAmt(statedPayedCapCurrAmount);
        }

        Citizenship citizenship = fillCitizenship();
        orgInfo.setCitizenship(citizenship);

        if (principal.getStaffInfo() != null && principal.getStaffInfo().getAverageNumber() != null)
            orgInfo.setEmplCount(principal.getStaffInfo().getAverageNumber().toString());
        orgInfo.setStateRegDt(fillDate(principal.getRegistrationDate()));
        orgInfo.setStateRegPlace(principal.getIFNS().getRegName());
        orgInfo.setTaxOfficeCode(principal.getIFNS().getRegCode());
        orgInfo.setTaxOfficeName(principal.getIFNS().getRegCode());

        OrgInfoCType.IndustId industId = of.createOrgInfoCTypeIndustId();
        GenParam indParam = genParamService.loadOne("company", principal.getId(), "company.industry");
        if (GenParamUtils.hasKeyValue(indParam)) {
            industId.setIndustCode(indParam.getValue().getKeyValue());
//            industId.setIndustName(); // only code
        }
        orgInfo.setIndustId(industId);
        orgInfo.setGovernmentDesc(fillGovernmentDesc(principal.getId()));
        /* start contacts */
        ContactList contactList = of.createContactList();
        ContactList.ContactRec fdxContact = of.createContactListContactRec();
        if (contact != null) {
            PhoneNums phoneNums = of.createPhoneNums();
            PhoneNum phoneNum = of.createPhoneNum();
            phoneNum.setPrimary(true);
            phoneNum.setPhone(contact.getPhone());
            phoneNums.getPhoneNum().add(phoneNum);
            fdxContact.setPhoneNums(phoneNums);

            EmailAddrs emailAddrs = of.createEmailAddrs();
            emailAddrs.getEmailAddr().add(contact.getEmail());
            fdxContact.setEmailAddrs(emailAddrs);
        }
        PostAddrs addrs = of.createPostAddrs();
        if (legalAddress != null) addrs.getPostAddr().add(fillAddress(legalAddress, "CORP"));
        if (actualAddress != null) addrs.getPostAddr().add(fillAddress(actualAddress, "FACT"));
        if (postalAddress != null) addrs.getPostAddr().add(fillAddress(postalAddress, "POST"));
        fdxContact.setPostAddrs(addrs);

        contactList.getContactRec().add(fdxContact);

        orgInfo.setContactList(contactList);
        /* end contacts */
        /* start okved */
        IdentityCards identityCards = fillOkveds(principal);
        orgInfo.setIdentityCards(identityCards);
        /* end okved */
        /* start licences */
        OrgInfoCType.LicenseList licenseList = fillLicences(principal);
        orgInfo.setLicenseList(licenseList);
        /* end licences */
        /* start relations */
        orgInfo.setRelPersons(fillRelPersons(principal));
        /* end relations */
        return orgInfo;
    }

    private OrgInfoCType.PropertyForm fillPropertyForm(Company company) {
        OrgInfoCType.PropertyForm propertyForm = of.createOrgInfoCTypePropertyForm();
        propertyForm.setPropertyCode(company.getOKFS());
        propertyForm.setPropertyName(company.getOPF());
        return propertyForm;
    }

    private OrgInfoCType.AddInfo fillAddInfo(Order order, Company company, Product product) {
        OrgInfoCType.AddInfo addInfo = of.createOrgInfoCTypeAddInfo();
        addInfo.setGoodwill("Негативной информации в открытых источниках не выявлено. Клиент участвует в государственных закупках");
        addInfo.setFinancialSituation(fillFinSituation(company.getId()));
        addInfo.setPurpose("Получение прибыли");
        addInfo.setBusinessRelations(String.format("Получение банковских гарантий на сумму %s руб. и иных банковских услуг", toMoney(product.getAmount()).toPlainString()));
        addInfo.setRelDt(fillRelDate(order));
        return addInfo;
    }

    private ClassifierId fillClassifierId(String type, String code) {
        ClassifierId classifierId = of.createClassifierId();
        classifierId.setClassifierType(type);
        classifierId.setClassifierCode(code);
        return classifierId;
    }

    private CurrencyAmount fillCurrencyAmount(Long amount, String code) {
        CurrencyAmount currencyAmount = of.createCurrencyAmount();
        currencyAmount.setAmt(toMoney(amount));
        currencyAmount.setCurCode(code);
        return currencyAmount;
    }

    private Citizenship fillCitizenship() {
        Citizenship citizenship = of.createCitizenship();
        citizenship.setCountry("643");
        citizenship.setCountryName("РОССИЯ");
        return citizenship;
    }

    private IdentityCards fillOkveds(Company company) {
        IdentityCards identityCards = of.createIdentityCards();

        IdentityCard primaryOkvedIc = of.createIdentityCard();
        primaryOkvedIc.setIdNum(company.getPrimaryOKVED());
        primaryOkvedIc.setIssueDt(fillDate(company.getPrimaryOKVEDdate()));
        identityCards.getIdentityCard().add(primaryOkvedIc);

        if (!CollectionUtils.isEmpty(company.getOKVED())) {
            company.getOKVED().forEach(o -> {
                IdentityCard ic = of.createIdentityCard();
                ic.setIdNum(o.getCode());
                ic.setIssueDt(fillDate(o.getDate()));
                identityCards.getIdentityCard().add(ic);
            });
        }

        return identityCards;
    }

    private OrgInfoCType.LicenseList fillLicences(Company company) {
        OrgInfoCType.LicenseList licenseList = of.createOrgInfoCTypeLicenseList();
        if (!CollectionUtils.isEmpty(company.getLicenses())) {
            company.getLicenses().forEach(l -> {
                LicenseInfoType licenseInfo = of.createLicenseInfoType();
                licenseInfo.setLicenseNum(l.getNumber());
                licenseInfo.setActivityType(l.getActivities());
                licenseInfo.setIssuedBy(l.getIssuingAuthority());
                licenseInfo.setStartDt(fillDate(l.getIssuedDate()));
                licenseInfo.setEndDt(fillDate(l.getExpiredDate()));
                if (l.getServices() != null) licenseInfo.setDesc(String.join(", ", l.getServices()));
            });
        }
        return licenseList;
    }

    private BankSvcRq.Org2OrgList fillBeneficiary(Product product) {
        BankSvcRq.Org2OrgList orgList = of.createFDXBankSvcRqOrg2OrgList();
        BankSvcRq.Org2OrgList.Org2OrgRec orgRec = of.createFDXBankSvcRqOrg2OrgListOrg2OrgRec();
        OrgInfoCType orgInfo = of.createOrgInfoCType();

        if (product.getBankGuarantee() != null && !CollectionUtils.isEmpty(product.getBankGuarantee().getBeneficiaries())) {
            String benId = product.getBankGuarantee().getBeneficiaries().iterator().next().getCompanyId();
            Company ben = companyRepository.load(benId);
//            Общее
            orgInfo.setLegalName(ben.getFullName());
            orgInfo.setName(ben.getDisplayName());
            orgInfo.setTaxId(ben.getINN());
            orgInfo.setStateRegPrimeNum(ben.getOGRN());
            orgInfo.setStateRegDt(fillDate(ben.getRegistrationDate()));
            orgInfo.setTaxRegCode(ben.getKPP());
            orgInfo.setTaxOfficeCode(ben.getIFNS().getRegCode());
            orgInfo.setStateRegPlace(ben.getIFNS().getRegName());

            OrgInfoCType.PropertyForm propertyForm = fillPropertyForm(ben);
            orgInfo.setPropertyForm(propertyForm);

//            Адрес
            Address address = loadAddress(ben.getLegalAddress());
            ContactList contactList = of.createContactList();
            ContactList.ContactRec fdxContact = of.createContactListContactRec();
            PostAddrs postAddrs = of.createPostAddrs();
            if (address != null) postAddrs.getPostAddr().add(fillAddress(address, "CORP"));
            fdxContact.setPostAddrs(postAddrs);
            contactList.getContactRec().add(fdxContact);
            orgInfo.setContactList(contactList);
//            Классификаторы
            OrgInfoCType.ClassifierList classifierList = of.createOrgInfoCTypeClassifierList();
            classifierList.getClassifierId().add(fillClassifierId("RUS.OKOPF", ben.getOKOPF()));
            classifierList.getClassifierId().add(fillClassifierId("RUS.OKATO", ben.getOKATO()));
            if (address != null)
                classifierList.getClassifierId().add(fillClassifierId("RUS.OKTMO", address.getOktmo()));
            orgInfo.setClassifierList(classifierList);
        }
        orgRec.setOrgInfo(orgInfo);
        orgList.getOrg2OrgRec().add(orgRec);
        return orgList;
    }

    private BankSvcRq.ProdInfo fillProdInfo(com.farzoom.common.persistence.es.model.Product product) {
        BankSvcRq.ProdInfo prodInfo = of.createFDXBankSvcRqProdInfo();
        //Тип продукта у нас пока только BG
        prodInfo.setProdType("BG");
        //Тип гарантии
        if (product.getBankGuarantee() != null)
            prodInfo.setGuarantyType(product.getBankGuarantee().getBankGuaranteeTypeRefId());
        // Сумма договора формат 123456789.50
        CurrencyAmount productAmount = fillCurrencyAmount(product.getAmount(), RUR_CODE);
        prodInfo.setCurAmt(productAmount);
        // Дата начала договора формат 15.07.2018
        prodInfo.setStartDt(fillDate(product.getStartDate()));
        // Дата окончания договора формат 15.07.2018
        prodInfo.setEndDt(fillDate(product.getEndDate()));
        // Информация о комиссии
        Fee fee = of.createFee();
        if (product.getBankGuarantee() != null
                && product.getBankGuarantee().getBankCommission() != null
                && product.getBankGuarantee().getBankCommission().getAmount() != null) {
            CurrencyAmount feeAmount = fillCurrencyAmount(product.getBankGuarantee().getBankCommission().getAmount(), RUR_CODE);
            fee.setCurAmt(feeAmount);
        }
        prodInfo.setFee(fee);

        return prodInfo;
    }

    private OrgInfoCType.RelPersons fillRelPersons(Company principal) {
        String query = String.format("relationTypeRefId:\"personFounder\" AND rightId:\"%s\"", principal.getId());
        List<Relation> founders = relationRepository.search(query, 10000, "");

        query = String.format("relationTypeRefId:\"employee\" AND employee.isMain:true AND rightId:\"%s\"", principal.getId());
        List<Relation> employees = relationRepository.search(query, 100, "");

        query = String.format("relationTypeRefId:\"personBeneficiary\" AND rightId:\"%s\" AND personBeneficiary.share.percent:>25", principal.getId());
        List<Relation> beneficiaries = relationRepository.search(query, 100, "");

        OrgInfoCType.RelPersons relPersons = of.createOrgInfoCTypeRelPersons();
        if (!CollectionUtils.isEmpty(founders))
            relPersons.getRelPerson().addAll(esRelations2RelPersons(founders, FOUNDER_REL_TYPE));
        if (!CollectionUtils.isEmpty(employees))
            relPersons.getRelPerson().addAll(esRelations2RelPersons(employees, MAIN_REL_TYPE));
        if (!CollectionUtils.isEmpty(beneficiaries))
            relPersons.getRelPerson().addAll(esRelations2RelPersons(beneficiaries, BEN_REL_TYPE));

        return relPersons;
    }

    private List<RelPersonCType> esRelations2RelPersons(List<Relation> relations, String personRelType) {
        return relations.stream().map(r -> {
            String employeeRelType = (r.getEmployee() != null && isBlank(r.getEmployee().getPosition()))
                    ? r.getEmployee().getPosition() : null;
            Person person = personRepository.load(r.getLeftId());

            IdentityDocument doc = !CollectionUtils.isEmpty(person.getIdentityDocuments()) ?
                    person.getIdentityDocuments().iterator().next() : null;
            Contact contact = !CollectionUtils.isEmpty(person.getContacts()) ?
                    person.getContacts().iterator().next() : null;
            Address address = addressRepository.load(person.getRegistrationAddressId());

            RelPersonCType relPerson = of.createRelPersonCType();
            relPerson.setRelType(isNotBlank(personRelType) ? personRelType : employeeRelType);
            if (personRelType.equals(MAIN_REL_TYPE)) {
                GenParam authStartDateParam = genParamService.loadOne("relation", r.getId(), "relation.authorizationStartDate");
                GenParam authEndDateParam = genParamService.loadOne("relation", r.getId(), "relation.authorizationExpirationDate");

                if (GenParamUtils.hasDateValue(authStartDateParam)) {
                    relPerson.setStartDt(fillDate(authStartDateParam.getValue().getDateValue()));
                }
                if (GenParamUtils.hasDateValue(authEndDateParam)) {
                    relPerson.setEndDt(fillDate(authEndDateParam.getValue().getDateValue()));
                }
            } else {
                relPerson.setStartDt(null);
                relPerson.setEndDt(null);
            }

            PersonInfo personInfo = of.createPersonInfo();

            PersonNameType personName = new PersonNameType();
            personName.setFirstName(person.getFirstName());
            personName.setMiddleName(person.getSecondName());
            personName.setLastName(person.getLastName());
            personInfo.setPersonName(personName);
            personInfo.setFullName(person.getDisplayName());

            personInfo.setBirthday(fillDate(person.getBirthDate()));
            personInfo.setBirthPlace(person.getBirthPlace());
            personInfo.setTaxId(person.getINN());

            IdentityCard identityCard = of.createIdentityCard();
            if (doc != null) {
                identityCard.setIdType("Паспорт РФ");
                identityCard.setIdSeries(doc.getSeries());
                identityCard.setIdNum(doc.getNumber());
                identityCard.setIssuedBy(doc.getIssuingAuthority());
                identityCard.setIssuedByCode(doc.getIssuingAuthorityCode());
                identityCard.setIssueDt(fillDate(doc.getIssuedDate()));
                identityCard.setExpDt(calcExpirationDate(person.getBirthDate(), doc.getIssuedDate()));
            }
            personInfo.setIdentityCard(identityCard);
            relPerson.setPersonInfo(personInfo);

            GenParam ipdlParam = genParamService.loadOne("person", person.getId(), "person.isIpdl");
            if (GenParamUtils.hasValue(ipdlParam) && ipdlParam.getValue().getBooleanValue() != null) {
                relPerson.setIPDLStatus(ipdlParam.getValue().getBooleanValue() ? "Да" : "Нет");
            } else {
                relPerson.setIPDLStatus("Нет");
            }

            ContactInfo contactInfo = of.createContactInfo();
            if (contact != null) {
                PhoneNums phoneNums = of.createPhoneNums();
                PhoneNum phoneNum = of.createPhoneNum();
                phoneNum.setPrimary(true);
                phoneNum.setPhone(contact.getPhone());
                phoneNums.getPhoneNum().add(phoneNum);
                contactInfo.setPhoneNums(phoneNums);

                EmailAddrs emailAddrs = of.createEmailAddrs();
                emailAddrs.getEmailAddr().add(contact.getEmail());
                contactInfo.setEmailAddrs(emailAddrs);
            }

            PostAddrs addrs = of.createPostAddrs();
            if (address != null) addrs.getPostAddr().add(fillAddress(address, "REGISTRATION"));
            contactInfo.setPostAddrs(addrs);

            personInfo.setContactInfo(contactInfo);

            relPerson.setPersonInfo(personInfo);
            return relPerson;
        }).collect(Collectors.toList());
    }

    private FIASAddrType fillAddress(Address address, String type) {
        FIASAddrType fiasAddr = of.createFIASAddrType();

        fiasAddr.setAddrType(type);
        fiasAddr.setCountry(address.getCountry());
        fiasAddr.setCountryCode(address.getCompanyId());
        fiasAddr.setRegion(address.getRegion());
        fiasAddr.setRegionCode(address.getRegion_type());
        fiasAddr.setDistrict(address.getArea());
        fiasAddr.setDistrictCode(address.getArea_type());
        fiasAddr.setCity(address.getCity());
        fiasAddr.setCityCode(address.getCity_type());
        fiasAddr.setStateProv(address.getSettlement());
        fiasAddr.setStateProvCode(address.getSettlement_type());
        fiasAddr.setStreet(address.getStreet());
        fiasAddr.setStreetCode(address.getStreet_type());
        fiasAddr.setHouseNum(address.getHouse());
        fiasAddr.setHouseBlock(address.getBlock());
        fiasAddr.setUnit(address.getFlat_type());
        fiasAddr.setUnitNum(address.getFlat());
        fiasAddr.setPostalCode(address.getPostal_code());
        fiasAddr.setKladrCode(address.getKladr_id());
        fiasAddr.setOKATOCode(address.getOkato());
        fiasAddr.setOKTMOCode(address.getOktmo());
        fiasAddr.setAddr(address.getResult());

        return fiasAddr;
    }

    private ServerInfoType fillServerInfo() {
        ServerInfoType serverInfoType = of.createServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("GuarantyAddRq");
        serverInfoType.setBpId("MTS_ADD_GARANT");
        return serverInfoType;
    }

    private Address loadAddress(Company.AddressInfo address) {
        if (address != null && isNotBlank(address.getAddressId()))
            return addressRepository.load(address.getAddressId());
        return null;
    }

    private Date fillDate(java.util.Date date) {
        if (date == null) return null;
        LocalDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Date fdxDate = of.createDate();
        fdxDate.setYear(zdt.getYear());
        fdxDate.setMonth(zdt.getMonthValue());
        fdxDate.setDay(zdt.getDayOfMonth());
        return fdxDate;
    }

    private Date calcExpirationDate(java.util.Date birthDate, java.util.Date docDate) {
        if (birthDate == null) return null;

        LocalDate now = LocalDate.now();
        LocalDate bDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate doc = docDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date for20 = fillDate(java.util.Date.from(bDate.plusYears(20).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Date for45 = fillDate(java.util.Date.from(bDate.plusYears(45).atStartOfDay(ZoneId.systemDefault()).toInstant()));

        Period period = Period.between(bDate, now);
        int fullYears = period.getYears();
        if (fullYears <= 20)
            if (doc.isAfter(bDate.plusYears(20))) // уже выдали новый документ
                return for45;
            else
                return for20;
        if (fullYears <= 45)
            if (doc.isAfter(bDate.plusYears(45))) // уже выдали новый документ
                return null;
            else
                return for45;
        return null;
    }

    private Date fillRelDate(Order order) {
        java.util.Date date = null;
        if (!CollectionUtils.isEmpty(order.getPhase())) {
            List<Order.Phase> aoPhases = order.getPhase()
                    .stream()
                    .filter(p -> p.getPhaseId().equals("bg-pa-approve-order"))
                    .collect(Collectors.toList());
            for (Order.Phase p : aoPhases) {
                date = p.getStartDateTime();
            }
        }
        return fillDate(date);
    }

    private String fillFinSituation(String companyId) {
        String query = String.format("companyId:%s", companyId);
        List<CompanyBuh> companyBuhs = companyBuhRepository.search(query, 10, "dateMonth:desc");
        if (!CollectionUtils.isEmpty(companyBuhs)) {
            CompanyBuh latestCompanyBuh = companyBuhs.get(0);
            YearMonth latestBuhPeriod = YearMonth.parse(latestCompanyBuh.getDateMonth());

            if (latestBuhPeriod.getMonthValue() == 12) {
                long code2110 = 0;
                long code2400 = 0;
                for (CompanyBuh.Form f : latestCompanyBuh.getForm2()) {
                    if (f.getCode() == 2110) code2110 = f.getEndValue();
                    if (f.getCode() == 2400) code2400 = f.getEndValue();
                }

                return String.format(
                        FIN_SITUATION_TEMPLATE,
                        latestBuhPeriod.getYear(),
                        toThousands(code2110),
                        toThousands(code2400)
                );
            } else {
                CompanyBuh companyBuh = companyBuhs.stream()
                        .sorted(Comparator.comparing(CompanyBuh::getYear).reversed())
                        .filter(cb -> {
                            YearMonth period = YearMonth.parse(cb.getDateMonth());
                            return period.getMonthValue() == 12;
                        })
                        .findFirst()
                        .orElse(null);
                if (companyBuh != null) {
                    long code2110 = 0;
                    long code2400 = 0;
                    for (CompanyBuh.Form f : latestCompanyBuh.getForm2()) {
                        if (f.getCode() == 2110) code2110 = f.getEndValue();
                        if (f.getCode() == 2400) code2400 = f.getEndValue();
                    }

                    return String.format(
                            FIN_SITUATION_TEMPLATE,
                            companyBuh.getYear(),
                            toThousands(code2400),
                            toThousands(code2110)
                    );
                }
            }
        }
        return String.format(FIN_SITUATION_TEMPLATE, 0, 0., 0.);
    }

    private String fillGovernmentDesc(String companyId) {
        List<String> govList = new ArrayList<>();

        GenParam sgbParam = genParamService.loadOne("company", companyId, "company.supremeGoverningBody");
        if (GenParamUtils.hasStringValue(sgbParam)) {
            govList.add(sgbParam.getValue().getStringValue());
        }
        GenParam sebParam = genParamService.loadOne("company", companyId, "company.soleExecutiveBodyRefId");
        if (GenParamUtils.hasKeyValue(sebParam)) {
            String key = sebParam.getValue().getKeyValue();
            sebParam.getRef().forEach(rv -> {
                if (rv.getValue().equals(key)) govList.add(rv.getName());
            });
        }
        GenParam sbnParam = genParamService.loadOne("company", companyId, "company.supervisoryBoardName");
        if (GenParamUtils.hasStringValue(sbnParam)) {
            govList.add(sbnParam.getValue().getStringValue());
        }
        GenParam cebnParam = genParamService.loadOne("company", companyId, "company.collegialExecutiveBodyName");
        if (GenParamUtils.hasStringValue(cebnParam)) {
            govList.add(cebnParam.getValue().getStringValue());
        }

        return String.join(", ", govList);
    }
}
