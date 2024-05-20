package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;

public class ExpenseCategoryPage extends PageActions{
	
	WebDriver driver;
	
	public ExpenseCategoryPage(WebDriver driver)
	{
		super(driver); // This is the driver of the Parent Class "Page Actions"
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//declared them as private so that others cannot access this
	@FindBy(id="name")
	private WebElement titleInput;
	
	
	@FindBy(xpath="//*[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[2]/a[2]")
	private WebElement deleteMsg;
	
	public String createExpense(String uniqueExpense) {
		clickElement(newBtn);
		setTextBox(titleInput, uniqueExpense);
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		
		return splitStringMSG(alertText);
	
	}
	
	public String deleteMsg()
	{
		System.out.println("Delete method");
		clickElement(deleteMsg);
		acceptAlert();
		//driver.switchTo().alert().accept();
		String alertText=alertMsg.getText();
		
		return splitStringMSG(alertText);
	}
	

}
