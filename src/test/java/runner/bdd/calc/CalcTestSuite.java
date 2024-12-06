package runner.bdd.calc;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "classpath:features/calc", glue = "com.bdd.calc",plugin = {"pretty:target/cucumber/cucumber.txt",
        "html:target/cucumber/cucumber-html-report",
        "json:target/cucumber/cucumber.json"
})
public class CalcTestSuite extends AbstractTestNGCucumberTests{
}
