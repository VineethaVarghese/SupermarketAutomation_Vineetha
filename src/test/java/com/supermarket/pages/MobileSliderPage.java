package com.supermarket.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.context.Constants;
import com.supermarket.utils.PageActions;

public class MobileSliderPage extends PageActions{
	
	WebDriver driver;

	public MobileSliderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cat_id")
	WebElement categoryDropdown;
	
	@FindBy(xpath="//*[@id='main_img']") 
	WebElement chooseFile;
	
	@FindBy(id="imagePreview")
	WebElement previewImage;
	
	@FindBy(css="[name='create']")
	protected WebElement saveBtn;
	
	
	
	public void addMobileSlider() throws AWTException, InterruptedException
	{
		clickElement(newBtn);
		handleStaticDropdown(categoryDropdown, "Fruits");
		uploadImage(chooseFile,Constants.IMAGEPATH);
		Thread.sleep(1000);	//previewImage.isDisplayed(); clickElement(saveBtn);
		 
		
	}

}
