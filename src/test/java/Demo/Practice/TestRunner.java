package Demo.Practice;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
		,features="src/test/resources/features"
		, glue= {"stepDefinitions"}
		//, tags= {"@Smoke" }
		, monochrome = true
		//, dryRun= true
		)
public class TestRunner {
	
}
