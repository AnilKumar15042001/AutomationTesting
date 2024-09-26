package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "features",
		glue = "stepdefinitions",
		dryRun = false,
		plugin = {"pretty","html:target/html-report.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
