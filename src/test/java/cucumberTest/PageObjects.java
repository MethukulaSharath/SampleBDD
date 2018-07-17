package cucumberTest;

import org.openqa.selenium.By;

public class PageObjects {

	/**
	 * Registration
	 */
	public static By registerLink=By.xpath("//*[text()='REGISTER']");

	public static By firstName=By.xpath("//*[@name='firstName']");

	public static By lastName=By.xpath("//*[@name='lastName']");

	public static By phone=By.xpath("//*[@name='phone']");

	public static By userName=By.xpath("//*[@name='userName']");

	public static By address1=By.xpath("//*[@name='address1']");

	public static By address2=By.xpath("//*[@name='address2']");

	public static By city=By.xpath("//*[@name='city']");

	public static By state=By.xpath("//*[@name='state']");

	public static By postalCode=By.xpath("//*[@name='postalCode']");

	public static By country=By.xpath("//*[@name='country']");

	public static By email=By.xpath("//*[@name='email']");

	public static By password=By.xpath("//*[@name='password']");

	public static By confirmPassword=By.xpath("//*[@name='confirmPassword']");

	public static By submit=By.xpath("//*[@name='register']");

	public static By signOff=By.xpath("//*[text()='SIGN-OFF']");

	/**
	 * Customer Sign in
	 */
	public static By signOn=By.xpath("//*[text()='SIGN-ON']");

	public static By login=By.xpath("//*[@name='login']");

	public static By flightDetails=By.xpath("//*[normalize-space(text())='Flight Details']");
	
	public static By profile=By.xpath("//*[text()='PROFILE']");
	


}
