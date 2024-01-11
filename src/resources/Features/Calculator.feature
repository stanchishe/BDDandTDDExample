Feature: Simple calculator
  As a Student
  I want to be able to do simple math
  To pass my tests

  Scenario: 1. Add two integers
    Given the numbers 5 and 10
    When I add the two integers
    Then the sum result should be 15

  Scenario: 2. Subtract two integers
    Given the numbers 5 and 10
    When I subtract the two integers
    Then the subtract result should be -5
