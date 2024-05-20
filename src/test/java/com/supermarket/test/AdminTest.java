package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.utils.ExcelReader;
import com.supermarket.utils.UniqueGenerator;

public class AdminTest extends BaseTest {
	
	@Test(groups="Smoke")
	public void myadminTest() throws IOException, InterruptedException 
	{
		
		String userName= ExcelReader.getCellValue(1, 0)+UniqueGenerator.getRandomNumber();
		String password= ExcelReader.getCellValue(1, 1)+UniqueGenerator.getRandomNumber();
		String userType= ExcelReader.getCellValue(1, 2);
		lp.login();
		hp.navigateToAdminUsersPage();
		String actualAdminAlertMsg = aup.createAdminUsers(userName, password, userType);
		Assert.assertEquals(actualAdminAlertMsg, "User Created Successfully");
	}

}
