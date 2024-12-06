package com.bdd.sample;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SampleStepDefinitions {
    @Given("I have a sample step")
    public void i_have_a_sample_step() {
        System.out.println("Given step");
    }

    @When("I do something")
    public void i_do_something() {
        System.out.println("When step");
    }

    @Then("I verify the outcome")
    public void i_verify_the_outcome() {
        System.out.println("Then step");
    }
}
