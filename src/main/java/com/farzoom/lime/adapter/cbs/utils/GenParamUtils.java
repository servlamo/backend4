package com.farzoom.lime.adapter.cbs.utils;

import com.farzoom.common.business.genparam.GenParam;

public class GenParamUtils {
    public static boolean hasValue(GenParam genParam) {
        return genParam != null && genParam.getValue() != null;
    }

    public static boolean hasStringValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getStringValue() != null;
    }

    public static boolean hasKeyValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getKeyValue() != null;
    }

    public static boolean hasMoneyValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getMoneyValue() != null;
    }

    public static boolean hasDateValue(GenParam genParam) {
        return hasValue(genParam) && genParam.getValue().getMoneyValue() != null;
    }
}
