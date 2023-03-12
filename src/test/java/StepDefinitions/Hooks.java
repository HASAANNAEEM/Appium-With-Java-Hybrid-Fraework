package StepDefinitions;

import DriverManager.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;

import static DriverManager.Driver.driver;


public class Hooks {

	@Before("@android")
	public void setUpAndroid() {
		System.out.println("Before Setup Started");
		try {
			Driver.setUp("Android");
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@Before("@iOS")
	public void setUpIos() {
		System.out.println("Before Setup Started");
		try {
			Driver.setUp("IOS");
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@Before("@browser")
	public void setUpBrowser() {
		System.out.println("Before Setup Started");
		try {
			Driver.setUp("browser");
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@After("@mobile")
	public void tearDownMobile() {
		((AppiumDriver)driver).quit();
		Driver.stopAppium();
	}

	@After("@browser")
	public void tearDownBrowser() {
		Driver.stopBrowserDriver();
	}


	@AfterMethod @AfterStep
	public void TakescreenshotFailure(Scenario scenario)
	{
		if (scenario.isFailed()){
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte [] src = ts.getScreenshotAs(OutputType.BYTES) ;
			scenario.attach(src,"image/png","screenshot");
		}
	}
}
