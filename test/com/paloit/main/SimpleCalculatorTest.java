package com.paloit.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new SimpleCalculator();
    }

    @Test
    public void sum() {
    }

    @Test
    public void substract() {
    }

    @Test
    public void divide() throws DivisionByZeroException {
        assertEquals(3.333, calculator.divide(10, 3), 0.001);
    }

    @Test(expected = DivisionByZeroException.class)
    public void divideByZero() throws DivisionByZeroException {
        assertEquals(3.333, calculator.divide(10, 0), 0);
    }

    @Test()
    public void divisionByZeroMessage() {
        try {
            calculator.divide(10, 0);
            fail("Exception not thrown");
        } catch (DivisionByZeroException e) {
            assertEquals("Can't divide by zero", e.getMessage());
        }
    }

    @Test
    public void multiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }
}
