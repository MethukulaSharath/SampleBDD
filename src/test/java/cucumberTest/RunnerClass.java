package cucumberTest; 

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(

		monochrome = true,
		format={"pretty","html:target/Reports"},
		features = {"Feature_Files/CustomerRegistration.feature", "Feature_Files/LoginCustomer.feature"}

		)

public class RunnerClass {

}