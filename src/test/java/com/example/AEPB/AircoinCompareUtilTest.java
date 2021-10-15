package com.example.AEPB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircoinCompareUtilTest {

    @Test
    void should_return_true_when_compare_given_aircoinA_with_amount_1_and_aircoinB_with_amount_1() throws Exception {
        Aircoin aircoinA = new Aircoin(1);
        Aircoin aircoinB = new Aircoin(1);
        boolean compareResult = AircoinCompareUtil.compare(aircoinA, aircoinB);
        assertTrue(compareResult);
    }

    @Test
    void should_return_false_when_compare_given_aircoinA_with_amount_1_and_aircoinB_with_amount_2() throws Exception {
        Aircoin aircoinA = new Aircoin(1);
        Aircoin aircoinB = new Aircoin(2);
        boolean compareResult = AircoinCompareUtil.compare(aircoinA, aircoinB);
        assertFalse(compareResult);

    }

    @Test
    void should_throw_exception_when_compare_given_aircoinA_with_amount_less_0_and_aircoinB_with_amount_2() {
        Aircoin aircoinA = new Aircoin(-1);
        Aircoin aircoinB = new Aircoin(2);
        assertThrows(Exception.class, () -> AircoinCompareUtil.compare(aircoinA, aircoinB));
    }

    @Test
    void should_throw_exception_when_compare_given_aircoinA_with_amount_1000000001_and_aircoinB_with_amount_2() {
        Aircoin aircoinA = new Aircoin(1000000001);
        Aircoin aircoinB = new Aircoin(2);
        assertThrows(Exception.class, () -> AircoinCompareUtil.compare(aircoinA, aircoinB));
    }

    @Test
    void should_throw_exception_when_compare_given_aircoinA_is_null_and_aircoinB_with_amount_2() {
        Aircoin aircoinA = null;
        Aircoin aircoinB = new Aircoin(2);
        assertThrows(Exception.class, () -> AircoinCompareUtil.compare(aircoinA, aircoinB));
    }
}
