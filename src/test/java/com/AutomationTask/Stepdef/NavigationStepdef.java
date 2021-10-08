package com.AutomationTask.Stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.AutomationTask.Driver.DriverSingleTone;
import com.AutomationTask.Listener.Report;
import com.AutomationTask.OrangeHRM.DashboardPage;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.en.Then;

public class NavigationStepdef {
	
	DashboardPage DashboardPageObj=new DashboardPage();
	

	
	@Then("^User can Open Users Page$")
	public void user_can_Open_Users_Page() throws Throwable {
		try{
		
		DashboardPageObj.Hover_Admintab();
		DashboardPageObj.Hover_UserManagmenttab();
		DashboardPageObj.Click_userstab();
		Report.test.log(LogStatus.PASS, Report.GetMethodName());
		 Assert.assertTrue(DriverSingleTone.getDriver().findElement(By.id("systemUser-information")).isDisplayed());
		
		}catch(Exception e)
		{
			Report.test.log(LogStatus.FAIL, Report.GetMethodName());
		}
	}

}
