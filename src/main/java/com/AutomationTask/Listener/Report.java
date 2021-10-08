package com.AutomationTask.Listener;

import java.io.File;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentReports;

public class Report{

	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String reportname;
	


	// Create new Report 
	public static void startReport()
	{

		// create report with execution date
		extent = new ExtentReports("Reports/Advanced-ExtentReport/AutomationReport.html",false);
		// load configuration from extend-config.xml
		extent.loadConfig(new File("D:\\Projects\\AutomationTask\\src\\main\\java\\com\\AutomationTask\\Listener\\extent-config.xml"));

	}
	//Get Executed method name

	public static String GetMethodName()
	{

		String MethodName=Thread.currentThread().getStackTrace()[2].getMethodName();
		return MethodName;

	}




}

