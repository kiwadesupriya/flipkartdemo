package org.example.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"}
        ,glue = {"org/example/StepDefinations"}
        ,tags = "@LoginPage"
        ,dryRun = false
)
public class TestRunner {

}
