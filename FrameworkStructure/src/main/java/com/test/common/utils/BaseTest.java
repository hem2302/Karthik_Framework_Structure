package com.test.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	Properties prop = new Properties();
	InputStream input = null;
	
	String env="stag";
	public static String url;
	public static String username;
	public static String password;
	
	@BeforeTest
	public void setup(){
		
		try {
			input=new FileInputStream("src\\main\\resources\\"+env+"\\testData.properties");
			prop.load(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	     url=(String) prop.get("URL");
		 username=(String) prop.get("USERNAME");
		 password=(String) prop.get("PASSWORD");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}

}
