package runner.bdd.sample;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "classpath:features/sample", glue = "com.bdd.sample",plugin = {"pretty:target/cucumber/cucumber.txt",
        "html:target/cucumber/cucumber-html-report",
        "json:target/cucumber/cucumber.json"
} )
public class SampleTestSuite extends AbstractTestNGCucumberTests{
}
