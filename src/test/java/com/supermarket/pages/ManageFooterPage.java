package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.supermarket.utils.PageActions;

public class ManageFooterPage extends PageActions{

	WebDriver driver;
	public ManageFooterPage(WebDriver driver)
	{
		super(driver); // This is the driver of the Parent Class "Page Actions"
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".btn.btn-sm.btn.btn-primary.btncss")
	WebElement editBtn;
	
	public void editFooterText()
	{
		clickElement(editBtn);
	}
	

}
