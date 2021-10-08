package com.AutomationTask.OrangeHRM;


import org.openqa.selenium.By;


import com.AutomationTask.Driver.DriverSingleTone;

public class LoginPage {

	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By Loginbtn=By.id("btnLogin");


	public void Enter_Username(String User){
		DriverSingleTone.getDriver().findElement(username).sendKeys(User);

	}

	public void Enter_Pass(String Password){
		DriverSingleTone.getDriver().findElement(password).sendKeys(Password);

	}


	public void Click_Login(){
		

			DriverSingleTone.getDriver().findElement(Loginbtn).click();
		

	}



}
