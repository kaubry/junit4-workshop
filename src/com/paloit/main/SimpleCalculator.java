package com.paloit.main;

/*
This calculator only works with integer
It doesn't take into account the max and min int scenarios.
 */

public class SimpleCalculator {

    public int sum(int first, int second) {
        return first + second;
    }

    public int substract(int first, int second) {
        return first - second;
    }

    public double divide(int first, int second) throws DivisionByZeroException {
        if(second == 0) {
            throw new DivisionByZeroException("Can't divide by zero");
        }
        return (double)first / (double)second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }
}
