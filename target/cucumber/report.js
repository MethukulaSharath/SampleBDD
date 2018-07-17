$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CustomerRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Registration",
  "description": "",
  "id": "customer-registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register customer on NewTour Website",
  "description": "",
  "id": "customer-registration;register-customer-on-newtour-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I open NewTours Website",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Registration button should exits and Click on Registration button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Registered in Mercury Tours",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefiniton.openBrowser()"
});
formatter.result({
  "duration": 4111781045,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefiniton.goToNewTouts()"
});
formatter.result({
  "duration": 17832545998,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefiniton.registrationButton()"
});
formatter.result({
  "duration": 1222136105,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefiniton.register()"
});
formatter.result({
  "duration": 204742625453,
  "status": "passed"
});
formatter.uri("LoginCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Login",
  "description": "",
  "id": "customer-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login customer in NewTour Website and Signout as well",
  "description": "",
  "id": "customer-login;login-customer-in-newtour-website-and-signout-as-well",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have click on Sign-On button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Entered Username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Successfully navigates to home page and Signout",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerLoginStepDefinition.click_Signon()"
});
formatter.result({
  "duration": 858979236,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginStepDefinition.login()"
});
formatter.result({
  "duration": 264510445753,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginStepDefinition.homePageVerification()"
});
formatter.result({
  "duration": 1711019674,
  "status": "passed"
});
});