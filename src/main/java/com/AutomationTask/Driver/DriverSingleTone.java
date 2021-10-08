package com.AutomationTask.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;




public class DriverSingleTone {
	
	public static DriverSingleTone driverSingletone = null;
	public static WebDriver driver;
	
	private DriverSingleTone(){
		
	}
	
	// if driver is up use it , if not create new one 

	public static DriverSingleTone getDriverSingleton(){
		if (driverSingletone == null)
			driverSingletone = new DriverSingleTone();

		return driverSingletone;
	}
	
	
	// Set Up driver 
	public static void setDriver()
	{
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
    
	
//get driver to use it in browser actions
    public static WebDriver getDriver() {
        return driver;
    }

    public static void Wait(By path)
    {
    	WebDriverWait wait=new WebDriverWait(getDriver(), 1000);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }
    
    public static void tearDown()
    {
    	getDriver().close();
    }

}
