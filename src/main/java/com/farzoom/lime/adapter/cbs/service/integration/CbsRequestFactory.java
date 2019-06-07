package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.AddGuaranteeRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.request.SPRCustCheckRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.AgencyFeeAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request.CheckLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.BkiRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.CustCheckListRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest;

/**
 * Created by vladimir on 31.08.2018.
 */
public interface CbsRequestFactory {
    AddGuaranteeRequest addGuaranteeRequest(String orderId);

    StopFactorRequest stopRequest(String orderId);

    CloseLimitRequest closeRequest(String orderId);

    CheckLimitRequest checkLimitRequest(String orderId);

    StatusRequest statusRequest(String orderId);

    BkiRequest createBkiRequest(String orderId);

    BkiRequest createBkiHeadPersonRequest(String orderId);

    CommissionRequest createCommissionRequest(String orderId);

    CustCheckListRequest createCustCheckListRequest(String orderId);

    SPRCustCheckRequest createSPRCustCheckRequest(String orderId);

    AgencyFeeAddRequest createAgencyFeeAddRequest(String orderId);
}
