package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;

public class ManageLocationsPage extends PageActions{

	WebDriver driver;
	public ManageLocationsPage(WebDriver driver) 
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".btn.btn-rounded.btn-danger")
	WebElement newBtn;
	
	@FindBy(id="country_id")
	WebElement countryDropdown;
	
	@FindBy(id="st_id")
	WebElement stateDropdown;
	
	@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="delivery")
	WebElement delivery;
	
	@FindBy(css = "[name='create']")
	private WebElement saveBtn;
	
	public String verifyLocationDetails()
	{
		clickElement(newBtn);
		handleStaticDropdown(countryDropdown,"United Kingdom");
		handleStaticDropdown(stateDropdown,"East Yorkshire");
		setTextBox(location,"Edinburg");
		setTextBox(delivery,"25");
		clickElement(saveBtn);
		String alertText = alertMsg.getText(); 
		return splitStringMSG(alertText);
		
	}

}
