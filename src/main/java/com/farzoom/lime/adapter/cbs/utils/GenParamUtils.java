package com.farzoom.lime.adapter.cbs.utils;

import com.farzoom.common.business.genparam.GenParam;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GenParamUtils {
    public boolean hasValue(GenParam genParam) {
        return genParam != null && genParam.getValue() != null;
    }

    public boolean hasStringValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getStringValue() != null;
    }

    public boolean hasKeyValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getKeyValue() != null;
    }

    public boolean hasMoneyValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getMoneyValue() != null;
    }

    public boolean hasDateValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getMoneyValue() != null;
    }
}
