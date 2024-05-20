package com.supermarket.test;

import java.io.IOException;

import org.testng.annotations.Test;

public class EditFooterTest extends BaseTest {
	
	@Test
	public void navigate() throws IOException
	{
		lp.login();
		hp.navigateToManageFooterTestPage();
		mfp.editFooterText();
	}
	
	@Test
	public void verifyIfFooterTextUpdated() throws IOException
	{
		lp.login();
		hp.navigateToManageFooterTestPage();
		mfp.editFooterText();
	}

}
