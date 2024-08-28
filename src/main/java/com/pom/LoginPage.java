package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
		
	static WebDriver driver;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement user;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login;
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUser() {
		return user;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static WebDriver driver;
//	@FindBy(xpath = "//input[@type='text']")
//	private WebElement user;
//	
//	@FindBy (xpath = "//input[@type='password']")
//	private WebElement pass;
//	
//	@FindBy (xpath = "//input[@type='Submit']")
//	private WebElement loginbtn;
//
//	public LoginPage(WebDriver driver2) {
//		this.driver=driver2;                 
//		PageFactory.initElements(driver, this);       //this is for giving driver to mini from this class
//	}
//
//	public WebElement getLoginbtn() {
//		return loginbtn;
//	}
//
//	public WebElement getUser() {
//		return user;
//	}
//
//	public WebElement getPass() {
//		return pass;
//	}
//	
//	

}
