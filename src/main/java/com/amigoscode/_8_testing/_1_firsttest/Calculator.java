package com.amigoscode._8_testing._1_firsttest;

/**
 * A simple calculator class that students will write unit tests for.
 * This class is fully implemented - focus on writing tests in CalculatorTest.java.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
