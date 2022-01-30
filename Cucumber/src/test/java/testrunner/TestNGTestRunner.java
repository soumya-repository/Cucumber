package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="./src/test/resources/features",
        glue="stepDefinitions",
        monochrome = true,
        dryRun = false)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
