package org.example;

import gherkin.lexer.Ca;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    private static Calculator calculator;
    private int result;
    private int first, second;
    @Before
    public static void init() {
        calculator = new Calculator();
    }

    @Given("^the numbers (\\d+) and (\\d+)$")
    public void theAdditionIntegersAre(Integer firstInteger, Integer secondInteger) {
        first = firstInteger;
        second = secondInteger;
    }
    @When("I add the two integers")
    public void iAddTheIntegers() {
        result = calculator.add(first, second);
    }
    @Then("the result should be {int}")
    public void theAdditionResultIs(Integer expectedResult) {
        Assertions.assertEquals(expectedResult, result, "The addition was wrong!!!");
    }

//    @Given("^the numbers (\\d+) and (\\d+)$")
//    public void theSubtractionIntegersAre(Integer firstInteger, Integer secondInteger) {
//        first = firstInteger;
//        second = secondInteger;
//    }
//    @When("I subtract the two integers")
//    public void iSubtractTheIntegers() {
//        result = calculator.subtract(first, second);
//    }
//    @Then("the result should be {int}")
//    public void theSubtractionResultIs(Integer expectedResult) {
//        Assertions.assertEquals(expectedResult, result, "The subtraction was wrong!!!");
//    }
}
