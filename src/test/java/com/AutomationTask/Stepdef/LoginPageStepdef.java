package com.AutomationTask.Stepdef;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.AutomationTask.Driver.DriverSingleTone;
import com.AutomationTask.Listener.Report;
import com.AutomationTask.OrangeHRM.DashboardPage;
import com.AutomationTask.OrangeHRM.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepdef {

	LoginPage loginPageObj=new LoginPage();
	DashboardPage userPage=new DashboardPage();



	@Given("^User can Navigate to WebSite$")
	public void user_can_Navigate_to_WebSite() throws Throwable {
		try{
			System.out.println("Navigating to url");
			DriverSingleTone.setDriver();
			DriverSingleTone.getDriver().get("https://opensource-demo.orangehrmlive.com/");
			Report.test.log(LogStatus.PASS, Report.GetMethodName());
		}catch (Exception e) {
			Report.test.log(LogStatus.FAIL, Report.GetMethodName());
		}

	}


	@When("^Enter Username \"([^\"]*)\"$")
	public void enter_Username(String User) throws Throwable {
		try{
			loginPageObj.Enter_Username(User);
			Report.test.log(LogStatus.PASS, Report.GetMethodName());
		}catch(Exception e)
		{
			Report.test.log(LogStatus.FAIL, Report.GetMethodName());
		}
	}

	@When("^Enter Password \"([^\"]*)\"$")
	public void enter_Password(String Password) throws Throwable {
		try{
			loginPageObj.Enter_Pass(Password);
			Report.test.log(LogStatus.PASS, Report.GetMethodName());
		}catch (Exception e) {
			Report.test.log(LogStatus.FAIL, Report.GetMethodName());
		}
	}

	@Then("^User Login Successfully$")
	public void user_Login_Successfully() throws Throwable {
		try{
			loginPageObj.Click_Login();
			DriverSingleTone.Wait(By.id("welcome"));
			Assert.assertTrue(DriverSingleTone.getDriver().findElement(By.id("welcome")).isDisplayed());
			Report.test.log(LogStatus.PASS, Report.GetMethodName());


		}catch(Throwable e)
		{
			Report.test.log(LogStatus.FAIL, Report.GetMethodName());
		}


	}


}
