package org.pom;

import org.openqa.selenium.By;
import org.pom.common.BasePage;

public class LoginPage extends BasePage
{
    private By usernameTextBox = By.xpath("//*[@id='user-name']");
    private By passwordTextBox = By.xpath("//*[@id='password']");
    private By errorMsg = By.xpath("//div[@class='error-message-container error']/h3");
    private By loginButton = By.xpath("//*[@id='login-button']");
    private By logo = By.xpath("//div[@class='login_logo']");
    public LoginPage(String url) {
        super();
        NavigateTo(url);
        }
    public void setUsername(String username) {
        clearText(usernameTextBox);
        setText(usernameTextBox, username);
    }

    public void setPassword(String password) {
        clearText(passwordTextBox);
        setText(passwordTextBox, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public boolean logoIsDisplayed() {
        return isDisplayed(logo);
    }

    public String getErrorMsg() {
        return getText(errorMsg);
    }

    public InventoryPage goToInventoryPage() {

        //log.debug("Passing driver to inventory page");
        return new InventoryPage();
    }

}

