package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;

public class DeliveryBoyPage extends PageActions{
	
WebDriver driver;
	
	public DeliveryBoyPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".btn.btn-rounded.btn-danger")
	WebElement newBtn;
	
	@FindBy(id="name")
	WebElement titleInput;
	
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='btn btn-danger']")
	WebElement saveBtn;
	
	@FindBy(css=".alert-success.alert-dismissible")
	WebElement alertMsg;

	
	public String createDeliveryBoy(String nameVal,String userVal,String userPassword) throws InterruptedException
	{
		//newBtn.click();
		clickElement(newBtn);
		setTextBox(titleInput,nameVal);
		setTextBox(uname,userVal);
		setTextBox(password,userPassword);
		scrollToBottomofPage();
		Thread.sleep(1000);
		clickElement(saveBtn);
		
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);
		
	}

}
