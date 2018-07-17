package cucumberTest;


import org.apache.log4j.xml.DOMConfigurator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ExcelUtils;
import utility.Log;

public class CustomerLoginStepDefinition extends ExcelUtils{

	@Given("I have click on Sign-On button")
	public void click_Signon() {

		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("CustomerLoginStepDefinition");

		driver.findElement(PageObjects.signOn).click();
		Log.info("Clicked on Sign In");

	}

	@When("I Entered Username and password")
	public void login() {

		driver.findElement(PageObjects.userName).sendKeys(RegistrationStepDefiniton.sUserName);
		Log.info("Entered User Name");

		driver.findElement(PageObjects.password).sendKeys(RegistrationStepDefiniton.sPassword);
		Log.info("Entered Password");

		driver.findElement(PageObjects.login).click();
		Log.info("Clicked on Submit");
	}

	@Then("Successfully navigates to home page and Signout")
	public void homePageVerification() {

		try {

			driver.findElement(PageObjects.flightDetails).isDisplayed();
			Log.info("User Successfully navigates to Home Page");
			Log.info("User Verfifies the Home Page text for Flight Details");

			if(driver.findElement(PageObjects.profile).isDisplayed()) {

				Log.info("User Successfully verifies the Profile text in Home Page");

			}

			else {

				Log.error("User unable to navigate the Profile text in Home Page");				
				throw new Exception();				

			}

			if(driver.findElement(PageObjects.signOff).isDisplayed()) {

				Log.info("User Successfully verifies the SignOff text in Home Page");				
				driver.findElement(PageObjects.signOff).click();				
				Log.info("User Successfully Sign out from the New Mercury Tours");

			}

			else {

				Log.error("User unable to navigate the Profile text in Home Page");				
				throw new Exception();				

			}

			Log.endTestCase("Customer Sign In and Sign Out Process Completed");

			driver.quit();
		}

		catch (Exception e) {

			Log.error("User unable to navigate to Home Page");
			Log.error(e.toString());

		}

	}
}