package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionExpressions extends BaseClass1 {
	@Given("^user Launch Application$")
	public void user_Launch_The_Application() throws Throwable {
		launchUrl("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username as \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_Username_as_In_Username_Field(String userName) throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		 user.sendKeys("Bala112233");
		userInput(user, userName);
	}

	@When("^user Enter The Password as \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_Password_as_In_Password_Field(String passWord) throws Throwable {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("B953RN");
		userInput(pass, passWord);
	}

	@Then("^user Click The Login Button Then It Navigates Into Hotel Booking page$")
	public void user_Click_The_Login_Button_And_It_Navigates_Into_Hotel_Booking_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
//		 login.click();
			clickOnElement(login);
	}

}
