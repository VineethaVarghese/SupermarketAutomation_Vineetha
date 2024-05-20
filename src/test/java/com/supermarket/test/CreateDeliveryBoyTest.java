package com.supermarket.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.supermarket.utils.UniqueGenerator;

public class CreateDeliveryBoyTest extends BaseTest{
	
	@Test(dataProvider = "getData")
	public void verifyUserIsAbleToCreateMultipleDeliveryBoys(String nameVal,String usernameVal,  String passwordVal) throws InterruptedException, IOException 
	{
		lp.login();
		hp.navigateToManageDeliveyBoy();
		
		String actualDeliveryBoyText = dboy.createDeliveryBoy(nameVal, usernameVal, passwordVal);
		Assert.assertEquals(actualDeliveryBoyText, "Delivery Boy Details Created Successfully");
		
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data = new String[3][3];
		data[0][0] = UniqueGenerator.getUniqueString("CustomerA");
		data[0][1] = UniqueGenerator.getUniqueString("CusUnameA")+UniqueGenerator.getRandomNumber();
		data[0][2] = UniqueGenerator.getUniqueString("CusPasswordA");
		
		data[1][0] = UniqueGenerator.getUniqueString("CustomerB");
		data[1][1] = UniqueGenerator.getUniqueString("CusUnameB")+UniqueGenerator.getRandomNumber();
		data[1][2] = UniqueGenerator.getUniqueString("CusPasswordB");
		
		data[2][0] = UniqueGenerator.getUniqueString("CustomerB");
		data[2][1] = UniqueGenerator.getUniqueString("CusUnameB")+UniqueGenerator.getRandomNumber();
		data[2][2] = UniqueGenerator.getUniqueString("CusPasswordB");
		
		
		
		return data;
		
		
	}
	
	

}
