$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Book A Hotel Using Adactin Application",
  "description": "",
  "id": "book-a-hotel-using-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login Into This Application",
  "description": "",
  "id": "book-a-hotel-using-adactin-application;user-login-into-this-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter Their Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates Into Hotel Booking page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Verify The Login Page By Giving Right Credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6200846800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Their_Username_In_Username_Field()"
});
formatter.result({
  "duration": 200597500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 106982900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_Into_Hotel_Booking_page()"
});
formatter.result({
  "duration": 655818400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Verify_The_Login_Page_By_Giving_Right_Credentials()"
});
formatter.result({
  "duration": 130049400,
  "status": "passed"
});
});