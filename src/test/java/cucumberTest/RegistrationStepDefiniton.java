package cucumberTest; 

import java.util.Random;

import org.apache.log4j.xml.DOMConfigurator;

//import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log; 

public class RegistrationStepDefiniton extends ExcelUtils{
	public static String sUserName;
	public static String sPassword;

	@Given("I have open the browser") 
	public void openBrowser() throws Throwable {

		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("RegistrationStepDefiniton");

		driver = new ChromeDriver(); 

		Log.info("New driver instantiated");

		//Read an excel file
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Registration");
		Log.info("Read Excel sheet");

	} 

	@When("I open NewTours Website") 
	public void goToNewTouts() { 

		driver.navigate().to(Constant.URL); 
		Log.info("Web application launched successfully");

	} 

	@And("Registration button should exits and Click on Registration button") 
	public void registrationButton() {

		if(driver.findElement(PageObjects.registerLink).isEnabled()) { 
			driver.findElement(PageObjects.registerLink).click();
			Log.info("Registration button enabled");

			Log.info("Registration button Clicked");
		} else { 
			Log.info("Registration button not enabled"); 
		} 

	} 

	@Then("I Registered in Mercury Tours") 
	public void register() throws Exception {

		Log.info("Call Random Integer function to give row number");
		int rowNumber=randomInteger(3);
		System.out.println("Row Number: "+rowNumber);

		String sFirstName = ExcelUtils.getCellData(rowNumber, Constant.Col_firstName);

		driver.findElement(PageObjects.firstName).sendKeys(sFirstName);

		Log.info("Entered First Name");

		String sLastName = ExcelUtils.getCellData(rowNumber, Constant.Col_lastName);

		driver.findElement(PageObjects.lastName).sendKeys(sLastName);

		Log.info("Entered Last Name");

		String sPhoneNumber = ExcelUtils.getCellData(rowNumber, Constant.Col_phone);

		driver.findElement(PageObjects.phone).sendKeys(sPhoneNumber);

		Log.info("Entered Phone Number");

		String sUserMail = ExcelUtils.getCellData(rowNumber, Constant.Col_userMail);

		driver.findElement(PageObjects.userName).sendKeys(sUserMail);

		Log.info("Entered User Mail");

		String sAddress1 = ExcelUtils.getCellData(rowNumber, Constant.Col_address1);

		driver.findElement(PageObjects.address1).sendKeys(sAddress1);

		Log.info("Entered Address");

		String sAddress2 = ExcelUtils.getCellData(rowNumber, Constant.Col_address2);

		driver.findElement(PageObjects.address2).sendKeys(sAddress2);

		Log.info("Entered Address2");

		String sCity = ExcelUtils.getCellData(rowNumber, Constant.Col_city);

		driver.findElement(PageObjects.city).sendKeys(sCity);

		Log.info("Entered City");

		String sState = ExcelUtils.getCellData(rowNumber, Constant.Col_state);

		driver.findElement(PageObjects.state).sendKeys(sState);

		Log.info("Entered State");

		String sPostalCode = ExcelUtils.getCellData(rowNumber, Constant.Col_postalCode);

		driver.findElement(PageObjects.postalCode).sendKeys(sPostalCode);

		Log.info("Entered Postal Code");

		Select dropdown = new Select(driver.findElement(PageObjects.country));

		String sCountry = ExcelUtils.getCellData(rowNumber, Constant.Col_country);

		dropdown.selectByVisibleText(sCountry);

		Log.info("Select Country");

		Log.info("Call Random Integer function to give random number for Username");
		int usernumber=randomInteger(123456);

		sUserName = ExcelUtils.getCellData(rowNumber, Constant.Col_userName)+usernumber;

		System.out.println("Unique User Name: "+sUserName);

		driver.findElement(PageObjects.email).sendKeys(sUserName);

		Log.info("Entered User name");

		sPassword = ExcelUtils.getCellData(rowNumber, Constant.Col_password);

		driver.findElement(PageObjects.password).sendKeys(sPassword);

		Log.info("Entered Password");

		String sConfirmpassword = ExcelUtils.getCellData(rowNumber, Constant.Col_confirmPassword);

		driver.findElement(PageObjects.confirmPassword).sendKeys(sConfirmpassword);

		Log.info("Entered Confirm password");

		driver.findElement(PageObjects.submit).click();

		Log.info("Clicked on Submit for Registration");

		driver.findElement(PageObjects.signOff).click();

		Log.info("Clicked on SignOff in Home Page");

 		Log.endTestCase("Registration Process Completed");

	}


	///To give random number based on input size or length
	public int randomInteger(int n) {
		Random r = new Random();
		int sample=r.nextInt(n)+1;		
		return sample;
	}


}