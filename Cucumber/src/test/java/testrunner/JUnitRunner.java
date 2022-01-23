package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/features",
				 glue="stepDefinitions",
				 //dryRun=true,
				 stepNotifications=true)
public class JUnitRunner {

}
