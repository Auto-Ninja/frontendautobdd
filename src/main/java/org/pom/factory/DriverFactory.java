package org.pom.factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
    public static RemoteWebDriver GetDriver(ApplicationBrowser browser)  {
        RemoteWebDriver driver = null;
        switch (browser)
        {
            case Chrome:
                driver = new ChromeDriver(GetChromeOptions());
                break;
            case Edge:
            case Firefox:
                System.out.println("Browser is not supported for this application");
                break;
            default:
                System.out.println("Chrome is the only supported browser for this application");
        }
        return driver;
    }

    private static ChromeOptions GetChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        return options;
    }
}

