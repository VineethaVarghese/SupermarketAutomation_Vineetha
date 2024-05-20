package com.supermarket.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.context.Constants;

//import com.supermarket.context.Constants;
import com.supermarket.utils.PageActions;
import com.supermarket.utils.UniqueGenerator;

public class ListExpensePage extends PageActions {

	WebDriver driver;

	public ListExpensePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_id")
	private WebElement userDropdown;

	@FindBy(id = "ex_type")
	private WebElement expenseDropdown;

	@FindBy(id = "amount")
	private WebElement amountInput;

	@FindBy(css = "[name='userfile']")
	private WebElement chooseFile;

	@FindBy(css = "[name='create']")
	private WebElement saveBtn;

	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[2]")
	WebElement manageExpseneBtn;
	
	  @FindBy(xpath = "//table//tbody//tr[1]/td[8]//a") 
	  private WebElement imageOpenArrow;
	  
	  @FindBy(xpath = "//*[@class='detail-row open']//*[@class='profile-info-name']")
		private WebElement uploadedPhoto;
	  
	  @FindBy(xpath = "//*[@class='table table-bordered table-hover table-sm']/tbody/tr/td[9]//a[1]")
		private WebElement updateRow;
	  
	  @FindBy(xpath = "//*[@class='table table-bordered table-hover table-sm']/tbody/tr/td[9]//a[2]")
		private WebElement deleteRow;
	  
	  @FindBy(xpath = "//*[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]")
		private WebElement updatedField;
	
	
	  @FindBy(css = "[name='update']")
		private WebElement updateBtn;
	  

	public void moveToAddExpense() {
		clickElement(newBtn);
	}

	public String addExpense() throws AWTException {
		handleStaticDropdown(userDropdown, "232(Staff)");
		handleStaticDropdown(expenseDropdown, "Credit Bank");
		setTextBox(amountInput, UniqueGenerator.getRandomNumber());
		scrollToBottomofPage();
		uploadImage(chooseFile, Constants.IMAGEPATH);
		clickElement(saveBtn); 
		String alertText = alertMsg.getText(); 
		return splitStringMSG(alertText);
		 

	}
	
	public boolean isUploadedPhotoExist() {
		clickElement(manageExpseneBtn);
		javascriptClickElement(imageOpenArrow);
		waitUntilVisible(uploadedPhoto);
		return isElementDisplayed(uploadedPhoto);
			
	}
	
	public String rowIsUpdated()
	{
		clickElement(updateRow);
		handleStaticDropdown(userDropdown, "Tdb(DB)");
		scrollToBottomofPage();
		clickElement(updateBtn);
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);
	}
	
	public boolean isUpdatedRowExist()
	{
		clickElement(manageExpseneBtn);
		waitUntilVisible(updatedField);
		return isElementDisplayed(updatedField);
	}
	
	
	
	public String rowIsDeleted()
	{
		clickElement(deleteRow);
		acceptAlert();
		String alertText = alertMsg.getText();
		return splitStringMSG(alertText);
	}
	
	public void colorOfButtons()
	{
		
	}
	

}
