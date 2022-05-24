package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ("src/test/resources/org/feature/Flipkart.feature"),
		glue = {"org/stepDefinition","org/applicationHooks"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:Reports/html_reports/Flipkart_reports.html",
				"json:Reports/json-reports/Flipkart_json.json",
				"junit:Reports/junit_reports/Flipkart_junit.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		}
		
		)
		
public class Flipkart_TestRunner {

}
