package org.finSecure.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",                        // Path to .feature files
        glue = {"org.finSecure.stepDefinitions", "org.finSecure.hooks"}, // Step defs and hooks
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true,
        dryRun = false
//        tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // Enables parallel execution if needed
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
