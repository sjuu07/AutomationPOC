package CucumberExecutor;

import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/Features",    // Path to your feature files
    glue = "StepDefinition",                  // Path to your step definition package
    plugin = {
        "pretty",                                // Prints the Gherkin steps in the console
        "html:target/cucumber-reports/cucumber.html", // Generates an HTML report
        "json:target/cucumber-reports/cucumber.json", // Generates a JSON report
        "junit:target/cucumber-reports/cucumber.xml"  // Generates a JUnit report
    },
    monochrome = true,                            // Makes the console output more readable
    dryRun= false,
   tags = "@smoke"                               // Tags to run specific scenarios (optional)
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().driverVersion("129.0.6668.101").setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
}