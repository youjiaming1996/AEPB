package com.example.AEPB;

import java.util.Objects;

public class AircoinCompareUtil {
    final static Integer MAX_AMOUNT = 1000000000;
    final static Integer MIN_AMOUNT = 0;

    public static boolean compare(Aircoin aircoinA, Aircoin aircoinB) throws Exception {
        if (!isAmountValid(aircoinA) || !isAmountValid(aircoinB)) {
            throw new Exception("aircoin amount not valid");
        }
        return Objects.equals(aircoinA.getAmount(), aircoinB.getAmount());
    }

    private static boolean isAmountValid(Aircoin aircoin) {

        return aircoin!= null && aircoin.getAmount() <= MAX_AMOUNT && aircoin.getAmount() >= MIN_AMOUNT;
    }
}
