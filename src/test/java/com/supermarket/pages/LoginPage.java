package com.supermarket.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;
import com.supermarket.utils.TestProperties;

public class LoginPage extends PageActions{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement signInBtn;
	
	public void login() throws IOException
	{
		Properties prop = TestProperties.getProperties();
		setTextBox(userName, prop.getProperty("username"));
		setTextBox(password, prop.getProperty("password"));
		signInBtn.click();
	}

}
