package com.test.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.test.common.utils.BaseTest;
import com.test.pages.*;

public class LoginTest extends BaseTest {
	
	@Test
	public void validateValidCredential(){
		LoginPage LoginPageObj=new LoginPage(driver);
		DashboardPage dashboardPageObj=new DashboardPage(driver);
		
		LoginPageObj.login(username,password);
		dashboardPageObj.clicklogout();
		
	}
	

}
