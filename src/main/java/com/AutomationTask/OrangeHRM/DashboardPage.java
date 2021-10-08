package com.AutomationTask.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.AutomationTask.Driver.DriverSingleTone;

public class DashboardPage {
	By Admin_tab=By.id("menu_admin_viewAdminModule");
	By userManagment_tab=By.id("menu_admin_UserManagement");
	By Users_tab=By.id("menu_admin_viewSystemUsers");
	
	
	
	
	public void Hover_Admintab()
	{
		Actions action=new Actions(DriverSingleTone.getDriver());
		DriverSingleTone.Wait(Admin_tab);
		action.moveToElement(DriverSingleTone.getDriver().findElement(Admin_tab)).perform();
		
		
	}
	
	public void Hover_UserManagmenttab()
	{
		Actions action=new Actions(DriverSingleTone.getDriver());
		DriverSingleTone.Wait(userManagment_tab);
		action.moveToElement(DriverSingleTone.getDriver().findElement(userManagment_tab)).perform();
	
	}
	
	public void Click_userstab()
	{
		DriverSingleTone.Wait(Users_tab);
		DriverSingleTone.getDriver().findElement(Users_tab).click();
	}

}
