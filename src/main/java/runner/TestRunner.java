package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/features/MobileTestRecords.feature",
                glue = {"stepdef"},
                monochrome = true,
                dryRun = false,
                plugin = { "pretty", "html:test-output"}
        )
public class TestRunner {

}
