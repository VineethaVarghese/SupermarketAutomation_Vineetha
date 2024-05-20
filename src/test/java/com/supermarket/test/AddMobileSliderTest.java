package com.supermarket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class AddMobileSliderTest extends BaseTest{

	@Test
	public void verifyUserIsAbleTAddMobileSlider() throws AWTException, InterruptedException, IOException
	{
		lp.login();
		hp.navigateToManageSlider();
		
		ms.addMobileSlider();
	}
}
