package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;

public class AdminUsersPage extends PageActions {

	WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement pwd;

	@FindBy(id="user_type")
	WebElement dropdown;
	
	@FindBy(css="[name='Create']")
	WebElement saveBtn;
	
	public String createAdminUsers(String uname, String password ,String userType)
	{
		clickElement(newBtn);
		setTextBox(userName,uname);
		setTextBox(pwd,password);
		handleStaticDropdown(dropdown,userType);
		clickElement(saveBtn);
		String alertText = alertMsg.getText(); 
		return splitStringMSG(alertText);
		
	}

}
