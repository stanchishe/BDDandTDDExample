package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathTests {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("should add two numbers and return the result")
    public void addTwoNumbers() {
        int firstInteger = 5;
        int secondInteger = 10;

        Assertions.assertEquals(15, calculator.add(firstInteger, secondInteger), "The addition was wrong!!!");
    }

    @Test
    @DisplayName("should subtract two numbers and return the result")
    public void subtractTwoNumbers() {
        int firstInteger = 5;
        int secondInteger = 10;
        Assertions.assertEquals(-5, calculator.subtract(firstInteger, secondInteger), "The subtraction was wrong!!!");
    }
}
