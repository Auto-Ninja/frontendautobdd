package org.pom.common;

import org.pom.factory.ApplicationBrowser;
import org.pom.factory.DriverFactory;

import java.time.Duration;

public class BasePage  extends CommonActions {
    public BasePage() {
        webDriver = DriverFactory.GetDriver(ApplicationBrowser.Chrome);
    }
    public void NavigateTo(String url)
    {
        webDriver.navigate().to(url);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
