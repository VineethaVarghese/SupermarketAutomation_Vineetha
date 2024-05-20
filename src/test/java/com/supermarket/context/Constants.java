package com.supermarket.context;

import com.supermarket.utils.UniqueGenerator;

public class Constants {
	
	public static final String WORKINGDIRECTORY = System.getProperty("user.dir"); 
	//static  method to be called using Classname.methodname
	//final keyword, so that the data is not changed
	
	//C:\Users\shon4\eclipse-workspace\SupermarketAutomation\src\test\resources\Test\flower.jpg
	//WorkingDirectory = C:\Users\shon4\eclipse-workspace\SupermarketAutomation
	
	//public static final String IMAGEPATH = WORKINGDIRECTORY+"\\src\\test\\resources\\Test\\flower.jpg";
	public static final String IMAGEPATH = WORKINGDIRECTORY+"\\src\\test\\resources\\Test\\fruit.jpg";
	public static final String PROPERTIESFILEPATH = WORKINGDIRECTORY+"\\src\\test\\resources\\Configuration\\config.properties";
	public static final String EXCELSHEET=  WORKINGDIRECTORY+"\\src\\test\\resources\\Test\\testData.xlsx";
	public static final String REPORPATH= WORKINGDIRECTORY+"//Reports//AutomationReport.html";
	public static final String SCREENSHOTPATH = WORKINGDIRECTORY+"//Reports//"+UniqueGenerator.getCurrentDateTime()+".png";
	
	
}
