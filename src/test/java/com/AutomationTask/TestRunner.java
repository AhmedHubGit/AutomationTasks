package com.AutomationTask;

import org.testng.annotations.Test;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;


@CucumberOptions(
		features={"src/test/java/com/AutomationTask/FeatureFiles"},
		glue={"com/AutomationTask/Stepdef"},
		tags = {"~@NotRun"},
		plugin = {"pretty", "html:Reports",
		"json:Reports\\JsonReport\\jsonReport.json"},
		monochrome=true) 

public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	  @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	  public void feature(CucumberFeatureWrapper cucumberFeature) {
	    try {
	      super.feature(cucumberFeature);
	      System.out.println("start execution");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	
	
	


	
}
