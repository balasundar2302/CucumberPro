package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionExampleKeyword extends BaseClass1{
	@Given("^user Launch The Browser$")
	public void user_Launch_The_Browser() throws Throwable {
		launchUrl("https://adactinhotelapp.com/");

	}

	@When("^user Enter The \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_The_and(String username, String password) throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		userInput(user, username);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		userInput(pass, password);
	}

	@When("^user Click The Button Of Login And Navigated To The Home page$")
	public void user_Click_The_Button_Of_Login_And_Navigated_To_The_Home_page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		clickOnElement(login);
	}

}
