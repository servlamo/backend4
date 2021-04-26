package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.model.ProductBankGuarantee;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest.BankSvcRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CurrencyAmount;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.Date;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.ServerInfoType;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static com.farzoom.lime.adapter.cbs.utils.MoneyUtils.RUR_CODE;
import static com.farzoom.lime.adapter.cbs.utils.MoneyUtils.toMoney;


@Service
public class CloseLimitServiceImpl implements IntegrationService<CloseLimitRequest> {
    private static final BigDecimal COINS = new BigDecimal(100);

    @Override
    public CloseLimitRequest createRequest(Order order, Company principal, Product product) {
        return new CloseLimitRequest() {{
            setBankSvcRq(fillBankSvcRq(order, principal, product));
            setServerInfo(fillServerInfo());
        }};
    }

    private static BankSvcRq fillBankSvcRq(Order order, Company principal, Product product) {
        return new BankSvcRq() {{
            //ID сделки в МООСе необязательное поле
            setRequestId(order.getId());
            //Гуид Клиента в АБС заполняется не всегда
            setOrgId(null);
            //ИД Клиента в Фазуме необязательно поле
            setExtOrgId(order.getPrincipalCompanyId());
            setOrgInfo(fillOrgInfo(principal));
            setProdInfo(fillProdInfo(product));
            setOrg2OrgList(fillOrg2OrgList(product));
        }};
    }

    private static BankSvcRq.Org2OrgList fillOrg2OrgList(Product product) {
        return new BankSvcRq.Org2OrgList() {{
            getOrg2OrgRec().add(new Org2OrgRec() {{
//                setLinkType();
                //Гуид Бенефициара в АБС заполняется  не всегда
//                setOrgId();
                if (product.getBankGuarantee() != null &&
                        !CollectionUtils.isEmpty(product.getBankGuarantee().getBeneficiaries())) {
                    ProductBankGuarantee.Beneficiary ben = product.getBankGuarantee().getBeneficiaries().iterator().next();
                    setOrgInfo(new OrgInfo() {{
                        //ИНН Бенефициара
                        setTaxId(ben.getINN());
                        //КПП Бенефициара
//                        setTaxRegCode(ben.getKPP());
                        //Наименование Бенефициара
                        setName(ben.getDisplayName());
                        //ОГРН Бенефициара
//                        setStateRegPrimeNum(ben.getOGRN());
                    }});
                }
            }});
        }};
    }

    private static BankSvcRq.ProdInfo fillProdInfo(Product product) {
        return new BankSvcRq.ProdInfo() {{
            //Тип продукта у нас пока только BG
            setProdType("BG");
            //Тип гарантии
            if (product.getBankGuarantee() != null)
                setGuaranteeType(product.getBankGuarantee().getBankGuaranteeTypeRefId());

            // Сумма договора формат 123456789.50
            setCurAmt(new CurrencyAmount() {{
                setCurCode(RUR_CODE);
                if (product.getAmount() != null && product.getAmount() != 0)
                    setAmt(toMoney(product.getAmount()));
            }});
            // Дата начала договора формат 15.07.2018
            if (product.getStartDate() != null) {
                setStartDt(fillDate(product.getStartDate()));
            }
            // Дата окончания договора формат 15.07.2018
            if (product.getEndDate() != null) {
                setEndDt(fillDate(product.getEndDate()));
            }
        }};
    }

    private static Date fillDate(java.util.Date date) {
        LocalDate sd = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return new Date() {{
            setDay(sd.getDayOfMonth());
            setMonth(sd.getMonthValue());
            setYear(sd.getYear());
        }};
    }

    private static BankSvcRq.OrgInfo fillOrgInfo(Company principal) {
        return new BankSvcRq.OrgInfo() {{
            // Наименование клиента заполняется всегда
            setName(principal.getDisplayName());
            // ИНН Клиента заполняется всегда
            setTaxId(principal.getINN());
            // КПП Клиента заполняется не всегда у ИП его может не быть
            setTaxRegCode(principal.getKPP());
            // ОГРН Клиента
            setStateRegPrimeNum(principal.getOGRN());
        }};
    }

    private static ServerInfoType fillServerInfo() {
        return new ServerInfoType() {{
            setRqUID(CORRELATION_ID_PLACEHOLDER);
            setMsgUID(UUID.randomUUID().toString());
            setSPName("FARZOOM");
            setMsgReceiver("IBSO");
            setServerDt(getNow());
            setMsgType("OrgLimitModRq");
            setBpId("MTS_CLOSE_LIMIT");
        }};
    }
}
