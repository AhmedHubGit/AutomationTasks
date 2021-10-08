package com.AutomationTask.Stepdef;

import java.io.IOException;

import com.AutomationTask.Driver.DriverSingleTone;
import com.AutomationTask.Listener.Report;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	Scenario scenario;
	@Before
	public void scenarioName(Scenario scenario)
	{
		this.scenario=scenario;
		Report.startReport();
		Report.test = Report.extent.startTest(scenario.getName());
	}
	@After

	public void teardown() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Report.extent.endTest(Report.test);
		Report.extent.flush();	
		Thread.sleep(1000);
       DriverSingleTone.tearDown();
       

	}


}
