package com.supermarket.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.supermarket.utils.ExtentReporterUtil;
import com.supermarket.utils.PageActions;

public class ReportListener implements ITestListener
{
	ExtentReports extent = ExtentReporterUtil. getReporter();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Start");
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		//ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "I am passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		try {
			extentTest.get().addScreenCaptureFromPath(PageActions.getScreenshot(),result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/*
	 * @Override public void onTestSkipped(ITestResult result) { // TODO
	 * Auto-generated method stub ITestListener.super.onTestSkipped(result); }
	 */
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish"); 
		extent.flush();
	}
	
	
}
