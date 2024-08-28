package com.adactin.stepdefinition;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Test_Runner;
import com.baseclass.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass1 {

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
//		 driver.get("https://adactinhotelapp.com/");
		launchUrl("https://adactinhotelapp.com/");

	}

	@When("^user Enter Their Username In Username Field$")
	public void user_Enter_Their_Username_In_Username_Field() throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		 user.sendKeys("Bala112233");
		userInput(user, "Bala112233");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("B953RN");
		userInput(pass, "0E2B6Q");
	}

	@Then("^user Click The Login Button And It Navigates Into Hotel Booking page$")
	public void user_Click_The_Login_Button_And_It_Navigates_Into_Hotel_Booking_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
//	 login.click();
		clickOnElement(login);
//	 dropDown(login, "by text", "hai");
	}
	@Then("^user Verify The Login Page By Giving Right Credentials$")
	public void user_Verify_The_Login_Page_By_Giving_Right_Credentials() throws Throwable {
	WebElement searchHotel = driver.findElement(By.xpath("//td[text()='Search Hotel ']"));
	assertTrue(searchHotel.isDisplayed());
	}
}
