$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("annotation/outline.feature");
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
  "location": "cucumberExample.openBrowser()"
});
formatter.result({
  "duration": 4104430740,
  "status": "passed"
});
formatter.match({
  "location": "cucumberExample.goToNewTouts()"
});
formatter.result({
  "duration": 2194104453,
  "status": "passed"
});
formatter.match({
  "location": "cucumberExample.registrationButton()"
});
formatter.result({
  "duration": 1217653989,
  "status": "passed"
});
formatter.match({
  "location": "cucumberExample.register()"
});
formatter.result({
  "duration": 1597332733,
  "status": "passed"
});
});