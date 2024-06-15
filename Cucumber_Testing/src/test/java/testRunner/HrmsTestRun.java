package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/AddEmpHrms.feature",
        glue = "stepDefinition",
        dryRun = false,
        plugin = {"pretty","html:target/html-report.html"},
        tags= "( @regression and @smoke )"
        
        )
public class HrmsTestRun {

}

