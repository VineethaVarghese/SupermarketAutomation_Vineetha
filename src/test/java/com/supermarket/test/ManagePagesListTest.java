package com.supermarket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class ManagePagesListTest extends BaseTest {
	
	@Test
	public void verifyAddPages() throws AWTException, IOException
	{
		lp.login();
		hp.navigateToManageContentPages();
		
		mlp.enterPageInfo();
	}

}
