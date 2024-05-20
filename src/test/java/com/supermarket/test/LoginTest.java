package com.supermarket.test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;

public class LoginTest extends BaseTest{
	
	@Test(groups="Smoke")
	public void verifyUserIsAbleToLoginWithCredentials() throws IOException
	{
		System.out.println("Am After Method");
		
		lp.login();
		String actualBrandName = hp.getBrandName();
		//System.out.println(actualBrandName);
		Assert.assertEquals(actualBrandName,"7rmart supermarket");
	}
	
	

}
