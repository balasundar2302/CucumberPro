package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginPage;

public class SingleTonDesignPattern {

	public WebDriver driver;
	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public LoginPage loginPage() {
		LoginPage lp=new LoginPage(driver);
		return lp;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
