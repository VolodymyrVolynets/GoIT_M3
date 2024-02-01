package com.volodymyrvolynets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumWithInputOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumWithInputThree() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumWithInputZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
