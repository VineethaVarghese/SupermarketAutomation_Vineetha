package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;

public class ManagePaymentMethodsPage extends PageActions{
	
WebDriver driver;

	public ManagePaymentMethodsPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[4]/a")
	WebElement editBtn;
	
	@FindBy(id="name")
	WebElement uname;
	
	@FindBy(id="limit")
	WebElement payLimit;
	
	@FindBy(xpath="//*[@name='Update']")
	WebElement updateBtn;

	
	public void editPayment()
	{
		clickElement(editBtn);
		uname.sendKeys("NewUser1");
		payLimit.sendKeys("20000");
		updateBtn.click();
		/*
		 * String alertText = alertMsg.getText(); return splitStringMSG(alertText);
		 */
	}
	
	public void verifyIfDataIsUpdated()
	{
		
	}
	
	
	

	

	
}
