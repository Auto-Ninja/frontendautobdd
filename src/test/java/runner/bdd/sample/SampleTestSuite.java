package runner.bdd.sample;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( features = "classpath:features/sample", glue = "com.bdd.sample" )
public class SampleTestSuite extends AbstractTestNGCucumberTests{
}
