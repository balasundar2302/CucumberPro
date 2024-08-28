package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\taggedHooks.feature",
glue = {"com.adactin.stepdefinition","TaggedHooks"},
tags = "@TaggedHooks")
public class Test_Runner_TaggedHooks {
	
	
//		@BeforeClass
//		public static void set_Up() {
//			propertySet("chrome");
//		}
//		@AfterClass
//		public static void tear_Down() {
//			close();
	//	
//		}
	
}
