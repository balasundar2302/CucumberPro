package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public Properties p;
	public ConfigurationReader() throws IOException {
	File f=new File("C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject\\src\\main\\java\\com\\property\\AdactinProperties");
	FileInputStream fi=new FileInputStream(f);
	
	 p=new Properties();
	p.load(fi);
	}
	
	public String  getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String property = p.getProperty("url");
		return property;
	}
	
	public String getUsername() {
		String user = p.getProperty("username");
		return user;
	}
	
	public String getPassword() {
		String pass = p.getProperty("password");
		return pass;
	}
	
	
	
	
//	public Properties p;
//	public  ConfigurationReader() throws IOException {
//		File f=new File("C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject\\src\\main\\java\\com\\property\\AdactinProperties");
//		FileInputStream fis=new FileInputStream(f);
//		 p=new Properties();
//		p.load(fis);
//		
//	}
//	public String getBrowser() {
//		String browser=p.getProperty("browser");
//		return browser;
//	}
//	public String getUrl() {
//		String url=p.getProperty("url");
//		return url;
//	}
//	public String getUserName() {
//		String user=p.getProperty("username");
//		return user;
//	}
//	public String getPassword() {
//		String pass=p.getProperty("password");
//		return pass;
//	}
//	
	
	

}
