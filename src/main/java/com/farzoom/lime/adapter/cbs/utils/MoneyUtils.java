package com.farzoom.lime.adapter.cbs.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by vladimir on 27.09.2018.
 */
public class MoneyUtils {
    public static final String RUB_CODE = "RUB";
    public static final String RUR_CODE = "RUR";

    private static final BigDecimal COINS = new BigDecimal(100);
    private static final BigDecimal ONE_HUNDRED_THOUSAND = new BigDecimal(100000);

    public static BigDecimal toMoney(Long amount) {
        if (amount == null || amount == 0) return BigDecimal.ZERO;
        return new BigDecimal(amount).divide(COINS, 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal toThousands(Long amount) {
        if (amount == null || amount == 0) return BigDecimal.ZERO;
        return new BigDecimal(amount).divide(ONE_HUNDRED_THOUSAND, 2, RoundingMode.HALF_UP);
    }
}
