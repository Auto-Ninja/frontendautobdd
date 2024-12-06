package runner.bdd.calc;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( features = "classpath:features/calc", glue = "com.bdd.calc" )
public class CalcTestSuite extends AbstractTestNGCucumberTests{
}
