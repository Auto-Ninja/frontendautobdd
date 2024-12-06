package org.pom.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonActions {
    int WAIT_TIME = 30;
    static WebDriver webDriver;
    public static void highLightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].setAttribute('style', 'background: #89cff0; border: 2px solid red;');", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }
    }

    public void waitForVisibility(WebElement by) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(by));
    }
    public void clearText(By by) {
        var element = webDriver.findElement(by);
        waitForVisibility(element);
        highLightElement(element);
        element.clear();
    }
    public void click(By by) {
        var element = webDriver.findElement(by);
        waitForVisibility(element);
        highLightElement(element);
        element.click();
    }
    public void setText(By by, String text) {
        var element = webDriver.findElement(by);
        waitForVisibility(element);
        highLightElement(element);
        element.sendKeys(text);
    }
    public String getText(By by) {
        var element = webDriver.findElement(by);
        waitForVisibility(element);
        highLightElement(element);
        return element.getText();
    }

    public boolean isDisplayed(By by) {
        var element = webDriver.findElement(by);
        waitForVisibility(element);
        highLightElement(element);
        return element.isDisplayed();
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

}
