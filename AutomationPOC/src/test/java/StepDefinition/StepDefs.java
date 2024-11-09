package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import CucumberExecutor.TestRunner;


public class StepDefs {
	    WebDriver driver=TestRunner.driver;

	    @Given("user opens the browser")
	    public void userOpensTheBrowser() {
	    	
	    }

	    @When("user navigates to {string}")
	    public void userNavigatesToURL(String url) {
	        driver.get(url);
	    }

	    @Then("the page title should contain {string}")
	    public void thePageTitleShouldContain(String title) {
	        // Assert that the page title contains the expected string
	        Assert.assertTrue(driver.getTitle().contains(title));
	    }

	    // You may also want to add a method to close the browser after the test
	    @After
	    public void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
