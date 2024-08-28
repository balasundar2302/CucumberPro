package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//adactinDataTableWithoutHeader.feature",
glue = "com.adactin.stepdefinition",
plugin = {"pretty","html:Report/Cucumber_Report.html","com.cucumber.listener.ExtentCucumberFormatter:Extent/File.html"})

public class Test_Runner_WithoutHeader extends BaseClass1 {
	@BeforeClass
	public static void set_Up() {
		
		propertySet("chrome"); 
		
		
	}
	@AfterClass
	public static void tear_Down() {
		close();
	
	}
}
