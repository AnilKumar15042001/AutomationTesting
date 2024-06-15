package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/Register.feature",
		glue = "stepDefinition",
        dryRun = false,
        plugin = {"pretty","html:target/html-report.html"},
        tags= "( @tag1 )"
		)

public class NopCommerceRun {

}
