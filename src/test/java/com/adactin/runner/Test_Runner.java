package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue = "com.adactin.stepdefinition",
//dryRun = true,
plugin = {"pretty","html:Report/Cucumber_Report.html","com.cucumber.listener.ExtentCucumberFormatter:Extent/File.html"})
public class Test_Runner extends BaseClass1{

	@BeforeClass
	public static void set_Up() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject\\D125\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		propertySet("chrome"); 
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://www.orangehrm.com/");
	}
	@AfterClass
	public static void tear_Down() {
//driver.close();
		close();
	
	}

}



//extends BaseClass1
//public static WebDriver driver;
//browserLaunch("chrome");
//close();