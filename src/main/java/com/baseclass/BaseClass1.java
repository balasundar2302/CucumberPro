package com.baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BaseClass1 {
	public static WebDriver driver;
public static void userInput(WebElement element,String value) {
	element.sendKeys(value);
}

public static void clickOnElement(WebElement element) {
	element.click();
}

public static WebDriver propertySet(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject\\D125\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty(browser, browser);
	}
	else {
		System.out.println("Invalid browser");
	}
	driver.manage().window().maximize();
	return driver;
	
}
public static void launchUrl(String url) {
	driver.get(url);
}

public static void close() {
	driver.close();
}

public static void dropDown(WebElement element,String method,String value) {
Select s= new Select(element);
if (method.equalsIgnoreCase("by text")) {
	s.selectByVisibleText(value);
}
else if (method.equalsIgnoreCase("by index")) {
	int int1 = Integer.parseInt(value);
	s.selectByIndex(int1);
	
}
else if (method.equalsIgnoreCase("by value")) {
	s.selectByValue(value);
}
else {
System.out.println("select the method");
}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		public static WebDriver driver;
//		public static void userInput(WebElement element,String value) {
//			element.sendKeys(value);
//		}
//		public static void clickOnElement(WebElement element) {
//			element.click();
//		}
//		public static void printText(WebElement element) {
//		String s=	element.getText();
//		System.out.println(s);
//		}
//		public static void sleep() throws InterruptedException {
//			Thread.sleep(100);
//		}
//		public static WebDriver browserLaunch(String browser) {
//			if (browser.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject\\Driver\\chromedriver.exe");
//				driver= new ChromeDriver();
//			}
//			else if (browser.equalsIgnoreCase("edge")) {
//				driver=new EdgeDriver();
//				
//			}
//			else if (browser.equalsIgnoreCase("gecko")) {
//				driver=new FirefoxDriver();
//			}
//			else {
//				System.out.println("Invalid Browser");
//			}
//			driver.manage().window().maximize();
//			return driver;
//		}
//		
//		public static void launchUrl(String url) {
//			driver.get(url);
//		}
//		public static  void close() {
//			driver.close();
//		}
//		public static void quit() {
//			driver.quit();
//		}
//		public static void selectDropDown(WebElement element,String selectType,String value) {
//			Select s=new Select(element);
//			if (selectType.equalsIgnoreCase("By Value")) {
//				s.selectByValue(value);
//			}
//			else if (selectType.equalsIgnoreCase("By Text")) {
//				s.selectByVisibleText(value);
//			}
//			else if (selectType.equalsIgnoreCase("By Index")) {
//			int num=Integer.parseInt(value);
//			s.selectByIndex(num);
//			}
//			else {
//				System.out.println("invalid select");
//			}
//		}
//		
//		public static void alertt(String alertType) {
//			Alert a=driver.switchTo().alert();
//			if (alertType.equals("accept")) {
//				a.accept();
//			}
//		}
		
			}}





