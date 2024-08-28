package com.MavenProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass1;
import com.pom.LoginPage;
import com.pom.SingleTonDesignPattern;
import com.property.ConfigurationHelper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mini extends BaseClass1  {
	public static void main(String[] args) throws IOException {
		
		propertySet("chrome");
		
		propertySet(ConfigurationHelper.getInstance().getBrowser());
//		
////		launchUrl("https://adactinhotelapp.com/");
		launchUrl(ConfigurationHelper.getInstance().getUrl());
//		
		SingleTonDesignPattern sdp=new SingleTonDesignPattern(driver);
//		
//		
		userInput(sdp.loginPage().getUser(), ConfigurationHelper.getInstance().getUsername());
		userInput(sdp.loginPage().getPassword(), ConfigurationHelper.getInstance().getPassword());
		clickOnElement(sdp.loginPage().getLogin());
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////		ConfigurationHelper ch=new ConfigurationHelper();
//	
////		propertySet("chrome");
//		String browser = ConfigurationHelper.getInstance().getBrowser();
//		propertySet(browser);
//		
////		launchUrl("https://adactinhotelapp.com/");
//		launchUrl(ConfigurationHelper.getInstance().getUrl());
//		
////		LoginPage lp=new LoginPage(driver);
//		
//		SingleTonDesignPattern sdp=new SingleTonDesignPattern(driver);
//		
////		userInput(lp.getUser(), "Bala112233");
////		userInput(sdp.getLoginPage().getUser(), "Bala112233");
//		userInput(sdp.getLoginPage().getUser(),ConfigurationHelper.getInstance().getUserName());
//		
////		userInput(lp.getPassword(), "B953RN");
////		userInput(sdp.getLoginPage().getPassword(), "B953RN");
//		userInput(sdp.getLoginPage().getPassword(), ConfigurationHelper.getInstance().getPassword());
//		
////		clickOnElement(lp.getLogin());
////		clickOnElement(sdp.getLoginPage().getLogin());
//		clickOnElement(sdp.getLoginPage().getLogin());
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		System.setProperty("webdriver.chrome.driver",
////				"C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject\\Driver\\chromedriver.exe");
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
//		propertySet("chrome");
//
//		LoginPage lp=new LoginPage(driver);
////		driver.get("https://adactinhotelapp.com/");
//		launchUrl("https://adactinhotelapp.com/");
////		driver.manage().window().maximize();
//		
////		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
////		user.sendKeys("Bala112233");
////		userInput(user, "Bala112233");
//		userInput(lp.getUser(), "Bala112233");
//		
////		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
////		pass.sendKeys("B953RN");
////		userInput(pass, "B953RN");
//		userInput(lp.getPass(), "B953RN");
//		
////		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
////		login.click();
////		clickOnElement(login);
//		clickOnElement(lp.getLoginbtn());
//	}

}}
