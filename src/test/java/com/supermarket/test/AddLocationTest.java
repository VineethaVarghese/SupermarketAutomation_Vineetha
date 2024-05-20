package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddLocationTest extends BaseTest {
	
	@Test
	public void verifyLocationDetails() throws IOException
	{
		lp.login();
		hp.navigateToManageLocationPage();
		String actualMessage =ml.verifyLocationDetails();
		Assert.assertEquals(actualMessage, "Location Created Successfully");
		
	}
	
	

}
