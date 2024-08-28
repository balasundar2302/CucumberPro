package com.adactin.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionForHooks {

@Given("^user Must Learn One Programming Launguage To Work With Automation Tool$")
public void user_Must_Learn_One_Programming_Launguage_To_Work_With_Automation_Tool() throws Throwable {
System.out.println("JAVA");
}

@When("^user Learn Automation Tool$")
public void user_Learn_Automation_Tool() throws Throwable {
	System.out.println("SELENIUM");
}

@When("^user Learn Maven Project To Give Proper Structure For Our Project$")
public void user_Learn_Maven_Project_To_Give_Proper_Structure_For_Our_Project() throws Throwable {
System.out.println("CUCUMBER");
}
}
