package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactinBackground.feature",
glue = {"com.adactin.stepdefinition","BackgroundHooks"},
tags = "@BackgroundExample")
public class Test_Runner_Background {
//	@BeforeClass
//	public static void set_Up() {
//		propertySet("chrome");
//	}
//	@AfterClass
//	public static void tear_Down() {
//		close();
//	
//	}
}

