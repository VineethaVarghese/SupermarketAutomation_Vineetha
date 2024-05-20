package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
//import org.testng.annotations.Test;

import com.supermarket.utils.UniqueGenerator;

public class ManageExpenseTest extends BaseTest {
	
	//@Test
	public void userIsableToCreateAndDeleteExpense() throws IOException 
	{
		lp.login();
		hp.navigateToExpenseCategory();
		
		//Since the method is static , we can call by ClassName.MethodNAme
		String uniqueName= UniqueGenerator.getUniqueString("Client");
		String actualCreationAlertMsg = ecp.createExpense(uniqueName);
		 
		//Assertion for alert creation
		Assert.assertEquals(actualCreationAlertMsg,"Expense Category Created Successfully");
		String actualDeletionMsg = ecp.deleteMsg();
		 
		//Assertion for deletion
	    Assert.assertEquals(actualDeletionMsg, "Expense Category Deleted Successfully");
			
			
	}

}
