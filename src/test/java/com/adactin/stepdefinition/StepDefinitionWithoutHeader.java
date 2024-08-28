package com.adactin.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Test_Runner;
import com.baseclass.BaseClass1;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionWithoutHeader extends BaseClass1 {
	static WebDriver driver = Test_Runner.driver;
	@Given("^user Launch This Application$")
	public void user_Launch_The_Application() throws Throwable {
		launchUrl("https://adactinhotelapp.com/");

	}

	@When("^user Enter Their Username and Password In Username and Password Fields Respectively$")
	public void user_Enter_Their_Username_and_Password_In_Username_and_Password_Fields(DataTable arg1) throws Throwable {
		List<String> asList = arg1.asList(String.class);
		String un = asList.get(0);
		String pa = asList.get(1);
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		userInput(user, un);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		userInput(pass, pa);
	}

	@Then("^user Click This Login Button And It Navigates to Hotel Booking page$")
	public void user_Click_The_Login_Button_And_It_Navigates_Into_Hotel_Booking_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		clickOnElement(login);

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("^user Launch The Application$")
//	public void user_Launch_The_Application() throws Throwable {
////		 driver.get("https://adactinhotelapp.com/");
//		launchUrl("https://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//
//	}
//
//
//	@When("^user Enter Their Username and Password In Username and Password Fields$")
//	public void user_Enter_Their_Username_and_Password_In_Username_Field(DataTable arg1) throws Throwable {
//		List<String> asList = arg1.asList(String.class);
//		String un = asList.get(0);
//		String pa = asList.get(1);
//		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		userInput(user, un);
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		userInput(pass, pa);
//	}
//
//	@Then("^user Click The Login Button And It Navigates Into Hotel Booking page$")
//	public void user_Click_The_Login_Button_And_It_Navigates_Into_Hotel_Booking_page() throws Throwable {
//		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
////	 login.click();
//		clickOnElement(login);
////	 dropDown(login, "by text", "hai");
//	}

}
