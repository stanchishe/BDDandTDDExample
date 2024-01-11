package org.example;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    private static Calculator calculator;
    private int result;
    @Before
    public static void init() {
        calculator = new Calculator();
    }

    @When("I add the two integers")
    public void iAddTheIntegers() {
        result = calculator.add(InitialSetup.first, InitialSetup.second);
    }
    @Then("the sum result should be {int}")
    public void theAdditionResultIs(Integer expectedResult) {
        Assertions.assertEquals(expectedResult, result, "The addition was wrong!!!");
    }

    @When("I subtract the two integers")
    public void iSubtractTheIntegers() {
        result = calculator.subtract(InitialSetup.first, InitialSetup.second);
    }
    @Then("the subtract result should be {int}")
    public void theSubtractionResultIs(Integer expectedResult) {
        Assertions.assertEquals(expectedResult, result, "The subtraction was wrong!!!");
    }
}
