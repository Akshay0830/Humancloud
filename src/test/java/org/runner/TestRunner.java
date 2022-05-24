package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ("src/test/resources/org/feature/Amazon.feature"),
		glue = {"org/stepDefinition","org/applicationHooks"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/html_report/cucumber_reports.html",
				"json:target/Json_reports/json-reports.json",
				"junit:target/Junit_reports/Junit_reports.xml"
			
		}
		
		)
		
		
public class TestRunner {

}
