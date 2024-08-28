package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Hooks.feature",
glue = {"com.adactin.stepdefinition","Hooks"},
tags = "@Hooks")
public class Test_Runner_Hooks {
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
