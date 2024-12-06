package com.bdd.calc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.calc.Calculator;
import org.testng.Assert;

public class CalculatorStepDefinitions {
    private Calculator calculator;

    private int actualResult;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }
    @When("I have {int} and {int}")
    public void i_have_and(Integer x, Integer y) {
        actualResult = calculator.add(x, y);
    }
    @Then("I should get {int}")
    public void i_should_get(Integer expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

}
