package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.AddressRepository;
import com.farzoom.common.persistence.es.repositories.PersonRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static com.farzoom.lime.adapter.cbs.utils.MoneyUtils.RUB_CODE;
import static com.farzoom.lime.adapter.cbs.utils.MoneyUtils.toMoney;
import static org.apache.logging.log4j.util.Strings.isNotBlank;
import static org.apache.logging.log4j.util.Strings.isNotEmpty;

@Slf4j
@Service
@AllArgsConstructor
public class BkiServiceImpl implements IntegrationService<BkiRequest> {
    public static final String LEGAL_ADDRESS_TYPE_1 = "ADDRESS.TYPE.1";
    public static final String ACTUAL_ADDRESS_TYPE_2 = "ADDRESS.TYPE.2";
    public static final String PHONE_CONTACT_TYPE_3 = "CONTACT.TYPE.3";
    public static final String DEFAULT_PHONE_VALUE = "0";

    private final AddressRepository addressRepository;
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;

    @Override
    public BkiRequest createRequest(Order order, Company principal, Product product) {
        java.util.Date bkiPermissionDate = principal.getPermissionsInfo().getCreditHistoryPermission().getActiveTill();
        if (bkiPermissionDate == null) bkiPermissionDate = new java.util.Date();
        LocalDate consentEndDate = bkiPermissionDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime dt = LocalDateTime.now();

        java.util.Date bkiPermissionTillDate = principal.getPermissionsInfo().getCreditHistoryPermission().getActiveFrom();
        if (bkiPermissionTillDate == null) bkiPermissionTillDate = new java.util.Date();
        LocalDate consentToDate = bkiPermissionTillDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return new BkiRequest() {{
            setServerInfo(new ServerInfoType() {{
                setMsgUID(UUID.randomUUID().toString());
                setRqUID(CORRELATION_ID_PLACEHOLDER);
                setSPName("FARZOOM");
                setMsgReceiver("CR");
                setServerDt(getNow());
                setMsgType("SPRExtCheckInqRq");
//                setExtMsgType();//Расширенный тип сообщения
//                setBpId();//Идентификатор БП в РБО
            }});


            setBankSvcRq(new BankSvcRq() {{
                setSPRInfo(new SPRInfo() {{
//                    setProcessCode("MTS.MONEY.CODE.PROCESS");
//                    setParms(); //Параметр
//                    setReason("CREDIT.DECISIONSPR2");
//                    setSPRStatus(); //Статус по заявке
                    setUpDt(new com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.Date() {{
                        setYear(dt.getYear());
                        setMonth(dt.getMonthValue());
                        setDay(dt.getDayOfMonth());
                    }});
                    setConsentEndDt(new com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.Date() {{
                        setYear(consentEndDate.getYear());
                        setMonth(consentEndDate.getMonthValue());
                        setDay(consentEndDate.getDayOfMonth());
                    }});
                    setConsentDt(new com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.Date() {{
                        setYear(consentToDate.getYear());
                        setMonth(consentToDate.getMonthValue());
                        setDay(consentToDate.getDayOfMonth());
                    }});
                    setConsentPurposeCode("1");
//                    setConsentPurposeDesc();//Другая цель согласия
                    setConsentUser("ПАО \"МТС-БАНК\"");
//                    setConsentFlag();
//                    setVerificationType();//Глубина проверки
                    setCacheUse("-1");

                    ConnectorList connectorList = new ConnectorList();

                    ConnectorList.ConnectorRec connectorRec0 = new ConnectorList.ConnectorRec();
                    connectorRec0.setConnectorCode("0");
                    connectorList.getConnectorRec().add(connectorRec0);

                    ConnectorList.ConnectorRec connectorRec3 = new ConnectorList.ConnectorRec();
                    connectorRec3.setConnectorCode("3");
                    connectorList.getConnectorRec().add(connectorRec3);

                    ConnectorList.ConnectorRec connectorRec6 = new ConnectorList.ConnectorRec();
                    connectorRec6.setConnectorCode("6");
                    connectorList.getConnectorRec().add(connectorRec6);

                    setConnectorList(connectorList);
                }});
//                setCustInfo(new CRECustInfoType() {{
//                    setCustId();
//                    setPersonInfo(buildPersonInfo(principal));
//                    setFlags();
//                    setIncomeList();
//                    setCust2CustList();
//                    setWorkChng();
//                    setCalcInfo();
//                }});

                setOrgInfo(new OrgInfo() {{
                    setName(principal.getDisplayName());
                    setLegalName(principal.getFullName());
                    setStateRegPrimeNum(principal.getOGRN());
                    setTaxId(principal.getINN());

                    setCitizenship(new Citizenship() {{
                        setCountry("RU");
                    }});

                    setContactInfo(new ContactInfo() {{
                        setPhoneNums(new PhoneNums() {{
                            getPhoneNum().add(new PhoneNum() {{
                                setPhone(DEFAULT_PHONE_VALUE);
                                setPhoneType(PHONE_CONTACT_TYPE_3);
                            }});
                        }});

                        setPostAddrs(new PostAddrs() {{
                            Address legalAddress = loadAddress(principal.getLegalAddress());
                            if (legalAddress != null)
                                getPostAddr().add(toAddrType(legalAddress, LEGAL_ADDRESS_TYPE_1));

                            Address actualAddress = getActualAddress(principal);
                            if (actualAddress != null)
                                getPostAddr().add(toAddrType(legalAddress, ACTUAL_ADDRESS_TYPE_2));
                        }});
                    }});
                }});

                setRequestInfo(new RequestInfo() {{
                    setProdInfo(new ProdInfo() {{
//                        LocalDateTime now = LocalDateTime.now();
//                        setOrigDt(new DateTime() {{
//                            setYear(now.getYear());
//                            setMonth(now.getMonthValue());
//                            setDay(now.getDayOfMonth());
//                            setHour(now.getHour());
//                            setMinute(now.getMinute());
//                            setSecond(now.getSecond());
//                        }});
//                        setProdType("CREDITTYPE.4");
//                        setProdCode("MTS.WEEKEND.CC");
//                        setProdType("CREDITTYPE.4");
//                        setProdCode("MTS.WEEKEND.CC");
                        setTerm(new TermType() {{
                            setCount(product.getDurationDays());
                        }});
//                        setOrigCurAmt();//сумма кредита
                        setAcctCur(RUB_CODE);
                        setRequestAmt(new CurrencyAmount() {{
//                            setCurCode(RUB_CODE);
                            if (product.getAmount() != null && product.getAmount() != 0)
                                setAmt(toMoney(product.getAmount()));
                        }});
//                        setRate();
//                        setDocList();
                    }});
                }});
                setEmplInfo(new EmplInfoType() {{
                    setBankInfo(new BankInfo() {{
                        setAgencyId("999");
                    }});
                }});
            }});
        }};
    }

    private AddrType toAddrType(Address address, String type) {
        return new AddrType() {{
            setCity(isNotBlank(address.getCity()) ? address.getCity() : address.getRegion());
            setAddrType(type);
            setHouseNum(toBigInteger(address.getHouse()));
            setRegionCode(toRegionCode(address.getRegion_kladr_id()));
            setStreet(address.getStreet());
        }};
    }

    private Address getActualAddress(Company principal) {
        if (principal.getActualAddress().getEqualsLegalAddress() != null && principal.getActualAddress().getEqualsLegalAddress())
            return loadAddress(principal.getLegalAddress());
        return loadAddress(principal.getActualAddress());
    }

    private CRECustInfoType.PersonInfo buildPersonInfo(Company principal) {
        return new CRECustInfoType.PersonInfo() {{
            setTaxId(principal.getINN());
            setContactInfo(buildContactInfo(principal));
            if ("individual".equalsIgnoreCase(principal.getCompanyTypeRefId())) {
                String query = String.format("rightId:%s AND employee.isMain:true", principal.getId());
                List<Relation> relations = relationRepository.search(query, 1, "");
                if (!CollectionUtils.isEmpty(relations)) {
                    Person person = personRepository.load(relations.iterator().next().getLeftId());
                    setBirthPlace(person.getBirthPlace());
                    if (person.getBirthDate() != null) {
                        LocalDate birthDate = person.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        setBirthday(new com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.Date() {{
                            setYear(birthDate.getYear());
                            setMonth(birthDate.getMonthValue());
                            setDay(birthDate.getDayOfMonth());
                        }});
                    }
                    setPersonName(new PersonNameType() {{
                        setLastName(person.getLastName());
                        setFirstName(person.getFirstName());
                        setMiddleName(person.getSecondName());
                    }});
                    setCitizenship(new Citizenship() {{
                        setCountry("RU");
                        setCountryName("Российская Федерация");
                    }});
                    Optional.ofNullable(person)
                            .ifPresent(p -> {
                                        if (!CollectionUtils.isEmpty(person.getIdentityDocuments())) {
                                            IdentityDocument doc = person.getIdentityDocuments().iterator().next();
                                            setIdentityCards(new IdentityCards() {{
                                                setIdentityCard(new IdentityCard() {{
                                                    setIdType("21");
                                                    setIdSeries(doc.getSeries());
                                                    setIdNum(doc.getNumber());
                                                    setIssuedBy(doc.getIssuingAuthority());
                                                    setIssuedByCode(doc.getIssuingAuthorityCode());
                                                    if (doc.getIssuedDate() != null) {
                                                        LocalDate issuedDate = doc.getIssuedDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                                        setIssueDt(new com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.Date() {{
                                                            setDay(issuedDate.getDayOfMonth());
                                                            setMonth(issuedDate.getMonthValue());
                                                            setYear(issuedDate.getYear());
                                                        }});
                                                    }
                                                    setPrimary(true);
                                                    setActive(true);
                                                }});
                                            }});
                                        }
                                    }
                            );
                }
            }
        }};
    }

    private ContactInfo buildContactInfo(Company principal) {
        return new ContactInfo() {{
            if (!CollectionUtils.isEmpty(principal.getContacts())) {
                Contact contact = principal.getContacts().iterator().next();
                if (isNotBlank(contact.getPhone())) {
                    setPhoneNums(new PhoneNums() {{
                        getPhoneNum().add(new PhoneNum() {{
                            setPrimary(true);
                            setPhone(contact.getPhone());
                        }});
                    }});
                }

                if (isNotBlank(contact.getEmail())) {
                    setEmailAddrs(new EmailAddrs() {{
                        getEmailAddr().add(contact.getEmail());
                    }});
                }
            }
            com.farzoom.common.persistence.es.model.Address legalAddress = loadAddress(principal.getLegalAddress());
            Optional.ofNullable(legalAddress)
                    .ifPresent(address -> setPostAddrs(new PostAddrs() {{
                        getPostAddr().add(new AddrType() {{
                            setAddrType("REGISTRATION");
                            setCountry(address.getCountry());
                            setCountryCode(address.getCompanyId());
                            setRegion(address.getRegion());
                            setRegionCode(address.getRegion_type());
                            setDistrict(address.getArea());
                            setDistrictCode(address.getArea_type());
                            setCity(address.getCity());
                            setCityCode(address.getCity_type());
                            setStreet(address.getStreet());
                            setStreetCode(address.getStreet_type());
                            if (isNotBlank(address.getHouse())
                                    && isNotBlank(address.getHouse().replaceAll("[^\\d]", "")))
                                setHouseNum(new BigInteger(address.getHouse().replaceAll("[^\\d]", "")));
                            setHouseBlock(address.getBlock());
                            setHouseExt(address.getSettlement());
                            setUnit(address.getFlat_type());
                            if (isNotBlank(address.getFlat()) && isNotBlank(address.getFlat().replaceAll("[^\\d]", "")))
                                setUnitNum(new BigInteger(address.getFlat().replaceAll("[^\\d]", "")));
                            setPostalCode(address.getPostal_code());
                            setKladrCode(address.getKladr_id());
//                    setRegDt();
                        }});
                    }}));
        }};
    }

    private Address loadAddress(Company.AddressInfo address) {
        if (address != null && isNotBlank(address.getAddressId()))
            return addressRepository.load(address.getAddressId());
        return null;
    }

    private BigInteger toBigInteger(String str) {
        try {
            return new BigInteger(str);
        } catch (Exception e) {
            log.warn("Cannot parse str: {} to big int", str);
            return null;
        }
    }

    private String toRegionCode(String kladr) {
        return isNotEmpty(kladr) && kladr.length() > 2 ? kladr.substring(0, 2) : "";
    }
}
