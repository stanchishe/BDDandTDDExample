package org.example;

import io.cucumber.java.en.Given;

public class InitialSetup {

    public static int first, second;

    @Given("^the numbers (\\d+) and (\\d+)$")
    public void theAdditionIntegersAre(Integer firstInteger, Integer secondInteger) {
        first = firstInteger;
        second = secondInteger;
    }
}
