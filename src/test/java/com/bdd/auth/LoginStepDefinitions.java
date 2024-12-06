package com.bdd.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NotFoundException;
import org.pom.LoginPage;
import org.testng.Assert;
import utility.ConfigLoader;
import utility.TextManager;

public class LoginStepDefinitions {
    ConfigLoader configLoader = new ConfigLoader();
    LoginPage loginPage = new LoginPage(configLoader.Get("LOGIN_URL"));
    TextManager textManager = new TextManager();


    @Given("The Application has been launched")
    public void application_is_launched() {
        Assert.assertEquals(loginPage.getPageTitle(), "Swag Labs");
        Assert.assertTrue(loginPage.logoIsDisplayed());
    }

    @And("I log in as standard user")
    public void login_as_valid_user() throws NotFoundException {
        loginPage.setUsername(configLoader.Get("_username"));
        loginPage.setPassword(textManager.DecodeText(configLoader.Get("_password")));
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.goToInventoryPage().getPageHeader(), "PRODUCTS");
    }

    @And("I log in as {string} user")
    public void login_as_any_user(String string) throws NotFoundException {
         loginPage.setUsername(string);
        loginPage.setPassword(textManager.DecodeText(configLoader.Get("_password")));
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.goToInventoryPage().getPageHeader(), "PRODUCTS");
    }

    @And("I enter {string} in Username text box")
    public void enter_username(String string) {
        loginPage.setUsername(string);
    }

    @And("I enter {string} in Password text box")
    public void enter_password(String password) throws NotFoundException {
        loginPage.setPassword(textManager.DecodeText(configLoader.Get(password)));
    }

    @And("I click on login button")
    public void click_login_button() {
        loginPage.clickLoginButton();
    }

    @And("System should display {string} Error Message")
    public void display_error_message(String errorMsg) {
        Assert.assertEquals(loginPage.getErrorMsg(), errorMsg);
    }

    @Then("System should display page header {string}")
    public void system_should_display_page_header(String page) {

        Assert.assertEquals(loginPage.getPageTitle(), "PRODUCTS");
    }
}
