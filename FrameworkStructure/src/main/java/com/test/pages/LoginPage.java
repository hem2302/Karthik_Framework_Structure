package com.test.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.test.planning.pages.DesigningLoginPage;

public class LoginPage implements DesigningLoginPage{
	
	WebDriver driver;
	
	@FindBy(id="txtusername")
	WebElement username;
	
	@FindBy(id="txtpassword")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submit;
	
	@FindBy(xpath="//h3")
	WebElement heading;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user,String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}

	public String getHeading() {
		// TODO Auto-generated method stub
		return heading.getText();
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPasswor() {
		// TODO Auto-generated method stub
		return null;
	}

}
