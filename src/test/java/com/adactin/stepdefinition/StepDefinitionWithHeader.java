package com.adactin.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass1;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionWithHeader extends BaseClass1 {
	@Given("^user Launch This Adactin Application$")
	public void user_Launch_This_Adactin_Application() throws Throwable {
		launchUrl("https://adactinhotelapp.com/");

	}

	@When("^user Enter Their Username and Password In Username and Password Fields Respectively By From Below Credentials$")
	public void user_Enter_Their_Username_and_Password_In_Username_and_Password_Fields_Respectively_By_From_Below_Credentials(DataTable dataTable) throws Throwable {
	List<Map<String, String>> values = dataTable.asMaps(String.class, String.class);
	String username = values.get(0).get("username");
	String passord  = values.get(0).get("password");
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	userInput(user, username);
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	userInput(pass, passord);
	
	}

	@Then("^user Clicks Login Button And It Navigates to Hotel Booking page$")
	public void user_Clicks_Login_Button_And_It_Navigates_to_Hotel_Booking_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		clickOnElement(login);
		}


}
