package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(
		features="src/test/resources/Features",
		glue= {"StepDefinitions"},
		tags = "@TC_Beneficiary_List&Details_01_01",
		monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-html-report.html",
				"json:target/cucumber-json-report.json",
				"junit:target/cucumber-junit-xml-report.xml",
				"rerun:target/cucumber-reports/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		dryRun = false
		)
public class TestRunner_Mobile extends AbstractTestNGCucumberTests {

}