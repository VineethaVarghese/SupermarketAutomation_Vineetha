package com.supermarket.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.context.Constants;
import com.supermarket.utils.PageActions;
import com.supermarket.utils.UniqueGenerator;

public class ManageAddListPages extends PageActions{

	WebDriver driver;

	public ManageAddListPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="title")
	private WebElement titleInput;
	
	@FindBy(xpath="//*[@class='note-editable card-block']/p")
	private WebElement textArea;
	
	@FindBy(xpath="//*[@id='page']")
	private WebElement pageName;
	
	@FindBy(xpath="//*[@id='main_img']") 
	WebElement chooseFile;
	
	@FindBy(css="[name='create']")
	WebElement saveBtn;
	
	
	public void enterPageInfo() throws AWTException
	{
		clickElement(newBtn);
		
		setTextBox(titleInput, "Vini"+UniqueGenerator.getCurrentDateTime().toString()); 
		textArea.sendKeys("Am a fruit");
		pageName.sendKeys("Fruit Page");
		uploadImage(chooseFile,Constants.IMAGEPATH);
		scrollToBottomofPage();
		clickElement(saveBtn);
		//setTextBox(titleInput, "Vini");
		/*
		 * setTextBox(titleInput, "Vini"); textArea.sendKeys("Am a fruit");
		 * pageName.sendKeys("Fruit Page"); uploadImage(chooseFile,Constants.IMAGEPATH);
		 */
	}

}
