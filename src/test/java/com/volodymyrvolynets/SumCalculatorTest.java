package com.volodymyrvolynets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void sum() {
        assertEquals(calculator.sum(1), 1);
        assertEquals(calculator.sum(3), 6);
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}