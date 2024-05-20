package com.supermarket.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.supermarket.context.DriverManager;

import com.supermarket.pages.AdminUsersPage;
import com.supermarket.pages.DeliveryBoyPage;
import com.supermarket.pages.ExpenseCategoryPage;
import com.supermarket.pages.HomePage;
import com.supermarket.pages.ListExpensePage;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageAddListPages;
import com.supermarket.pages.ManageFooterPage;
import com.supermarket.pages.ManageLocationsPage;
import com.supermarket.pages.ManagePaymentMethodsPage;
import com.supermarket.pages.MobileSliderPage;
import com.supermarket.pages.NewsPage;
import com.supermarket.utils.TestProperties;

public class BaseTest {
	
	WebDriver driver = null;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browserName"})
	public void initializeDriver(@Optional String browserName) throws IOException 
	{
		/*
		 * Method Properties prop = TestProperties.getProperties(); should be there as
		 * global for below metioned method
		 */
		/* Method 1
		 * String browser = "chrome"; */
		
		/*Method 2
		 * Using TestProperties.getProperties() method we will get the get/load the  config.properties file
		 *  and it will get assigned to prop ,which will then call the specifed data from the config  file
		 *  and assign to the String variable 'browser' . Then it will check the if conditions
		 *  String browser = prop.getProperty("browserName");
		 *  
		 *  Method 3 is Cross Browser by passing parameters
		 */
		Properties prop = TestProperties.getProperties();
		
		//IF PARAMETERS ARE NOT PASSED TEH GET IT FROM THE PROPERTIES FILE
		if(browserName==null || browserName.isEmpty()) 
		{
			browserName=prop.getProperty("browserName");
		}
		
		
		/*
		 * This is for getting the environment(qa,dev,prod) in which the tes has to run
		 * Then it will select the specifed URL
		 */
		String env = prop.getProperty("Environment");
		String URL = prop.getProperty(env);
		System.out.println("Executing tests :"+ env +"  Envrionment");
		System.out.println(URL);
		
		if (browserName.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();

		} 
		else if (browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		} 
		else 
		{
			System.out.println("Not a valid browser");
		}
		DriverManager.setDriver(driver);
		initPages();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	public LoginPage lp;
	public HomePage hp;
	public ExpenseCategoryPage ecp;
	public DeliveryBoyPage dboy;
	public ManagePaymentMethodsPage mpm;
	public ListExpensePage lep;
	public MobileSliderPage ms;
	public ManageAddListPages mlp;
	public AdminUsersPage aup;
	public NewsPage news;
	public ManageLocationsPage ml;
	public ManageFooterPage mfp;
	
	public void initPages() 
	{
		lp   = new LoginPage(driver);
		hp   = new HomePage(driver);
		ecp  = new ExpenseCategoryPage(driver);
		dboy = new DeliveryBoyPage(driver);
		mpm  = new ManagePaymentMethodsPage(driver);
		lep  =  new ListExpensePage(driver);
		ms   =   new MobileSliderPage(driver);
		mlp = new ManageAddListPages(driver);
		aup = new AdminUsersPage(driver);
		news = new NewsPage(driver);
		ml = new ManageLocationsPage(driver);
		mfp = new ManageFooterPage(driver);
		
	}
	
	
	/*
	 * @AfterMethod(alwaysRun=true) public void tearDown() { driver.quit(); }
	 */
	 
	
	

}
