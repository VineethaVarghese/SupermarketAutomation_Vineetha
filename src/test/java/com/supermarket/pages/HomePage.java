package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utils.PageActions;

public class HomePage extends PageActions{
	
WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".brand-link.navbar-dark span")
	WebElement brandName;
	
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[1]")
	WebElement manageExpsene;
	
	@FindBy(xpath="(//*[contains(text(),'Manage Expense')])[2]")
	WebElement manageExpseneBtn;
	
	@FindBy(xpath="//p[contains(text(),'Expense Category')]")
	WebElement expenseCategory;
	
	@FindBy(xpath="//p[contains(text(),'Manage Delivery Boy')]")
	WebElement manageDeleviryBoy;
	
	@FindBy(xpath="//p[contains(text(),'Manage Payment Methods')]")
	WebElement managePaymentMethods;
	
	@FindBy(xpath="//p[contains(text(),'Mobile Slider')]")
	WebElement mobileSlider;
	
	@FindBy(xpath="//p[contains(text(),'Manage Content')]")
	WebElement manageContent;
	
	@FindBy(xpath="//p[contains(text(),'Manage Pages')]")
	WebElement managePages;
	
	@FindBy(xpath="//div[@class='col-lg-3 col-6'][2]//a[@class='small-box-footer']")
	WebElement adminUser;
	
	@FindBy(xpath="//*[contains(text(),'Manage News')]")
	private WebElement manageNews;
	
	@FindBy(xpath="//*[contains(text(),'Manage Location')]")
	private WebElement manageLocation;
	
	@FindBy(xpath="//*[contains(text(),'Manage Footer Text')]")
	private WebElement manageFooterText;
	
	
	
	public String getBrandName()
	{
		return brandName.getText();
	}
	
	public void navigateToExpenseCategory()
	{
		manageExpsene.click();	
		expenseCategory.click();
		
	}
	
	public void navigateToManageDeliveyBoy()
	{
		manageDeleviryBoy.click();
	}
	
	public void navigateToAddExpense()
	{
		clickElement(manageExpsene);
		clickElement(manageExpseneBtn);

	}
	
	public void navigateToManagePaymentMethods()
	{
		System.out.println("Am in Payment Section");
		managePaymentMethods.click();
	}
	
	public void navigateToManageSlider()
	{
		clickElement(mobileSlider);
	}
	
	/*
	 * public void navigateToManageContent() { clickElement(mobileSlider); }
	 */
	
	public void navigateToManageContentPages()
	{
		clickElement(manageContent);
		clickElement(managePages);
		
	}
	
	public void navigateToAdminUsersPage() throws InterruptedException
	{
		clickElement(adminUser);
		Thread.sleep(1000);
		System.out.println("hi");
	}
	
	public void navigateToNewsPage() {
		clickElement(manageContent);
		clickElement(manageNews);
		
	}
	
	public void navigateToManageLocationPage() {
		clickElement(manageLocation);
	
		
	}
	
	public void navigateToManageFooterTestPage()
	{
		clickElement(manageContent);
		clickElement(manageFooterText);
	}
	
	
}
