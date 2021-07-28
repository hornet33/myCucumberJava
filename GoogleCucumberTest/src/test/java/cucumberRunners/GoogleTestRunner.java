package cucumberRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"cucumberGlue"},
		plugin = {"pretty","html:target/HTMLReports/Junit-Report.html"}
		)
public class GoogleTestRunner {
}
