package com.supermarket.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class AddExpenseTest extends BaseTest{
	
	//@Test
	public void verufyUserIsAbleToAddExpense() throws InterruptedException, AWTException, IOException
	{
		lp.login();
		Thread.sleep(1000);
		hp.navigateToAddExpense();
		lep.moveToAddExpense();
		lep.addExpense();
		/*
		 * String actualMsg=lep.addExpense(); Assert.assertEquals(actualMsg,
		 * "Expense Record Created Successfully");
		 */
		
		boolean photoDisplayed =lep.isUploadedPhotoExist();
		Assert.assertTrue(photoDisplayed, "pHOTO IS not Displayed");
		
		String actualDeleteAlertMsg = lep.rowIsDeleted();
		Assert.assertEquals(actualDeleteAlertMsg, "Expense Record Deleted Successfully");
		
		String actualUpdatedAlertMsg = lep.rowIsUpdated();
		Assert.assertEquals(actualUpdatedAlertMsg, "Expense Record Updated Successfully");
		
		boolean rowUpdated =  lep.isUpdatedRowExist();
		Assert.assertTrue(rowUpdated,"Not Updated");
		
		lep.colorOfButtons();
	}

}
