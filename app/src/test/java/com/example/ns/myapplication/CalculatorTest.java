package com.example.ns.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ns on 17/3/22.
 */
public class CalculatorTest {
    private Calculator mCalculator;
    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        //expected: 6, sum of 1 and 5
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(1d, mCalculator.substract(5d, 4d), 0);

    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, mCalculator.divide(20d, 0d), 0);

    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(10d, mCalculator.multiply(2d, 5d), 0);

    }
}