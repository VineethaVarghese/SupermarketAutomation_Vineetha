package com.supermarket.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.supermarket.context.Constants;

public class ExtentReporterUtil {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReporter()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.REPORPATH);
		reporter.config().setReportName("Obsqura Automation Report");
		reporter.config().setDocumentTitle("Obsqura Zone");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name", "Vineetha");
		extent.setSystemInfo("Environment", "QA");
		return extent;
		
	}

}
