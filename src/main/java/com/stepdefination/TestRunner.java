package com.stepdefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		
		features = {"src/test/resources/com/Features/DonateAmount.feature"}, 
		glue = {"com.stepdefination"} ,dryRun=false
		
)

public class TestRunner extends AbstractTestNGCucumberTests {
	// Logger log = LogManager.getLogger(this.getClass());

}
