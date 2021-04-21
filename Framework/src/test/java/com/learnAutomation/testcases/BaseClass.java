package com.learnAutomation.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnAutomation.utility.BrowserFactory;
import com.learnAutomation.utility.ConfigDataProvider;
import com.learnAutomation.utility.ExcelDataProvider;
import com.learnAutomation.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	
	public ConfigDataProvider config;
	
	public ExcelDataProvider excel;
	
	public ExtentReports report;
	
	public ExtentTest logger;
	public ExtentTest logger1;
	
	@BeforeSuite
	public void setupSuite() {
		
		Reporter.log("Setting done to generate the report", true);
		 excel= new ExcelDataProvider();
		 
		 config=new ConfigDataProvider();
		 
		  report = new ExtentReports();
		 
		 ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reporter/FreeCRMreport"+Helper.getCurrentDateTime()+".html"));
		 
		 
		 report.attachReporter(extent);
		 
		 Reporter.log("Setting done reports to be started", true);
	}
	@BeforeClass
	
	public void setup() {
		
	Reporter.log("Trying to start browser and getting application ready", true);
		driver= BrowserFactory.startApplication(driver, config.getBrowserFromConfig(), config.getURLFromConfig());
		
		System.out.println(driver.getTitle());
		
		Reporter.log("Setting done test can be started", true);
	}
	
//	@AfterClass
//	public void tearDown() {
//		BrowserFactory.quiteBrowser(driver);
//	}
	
	@AfterMethod
	public void teardownmethod(ITestResult result) throws IOException {
		
		Reporter.log("Test is end", true);
		if(result.getStatus()==ITestResult.FAILURE) {
			logger.fail("Test failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
			
			logger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
		}
		report.flush();
		
		Reporter.log("Report generated", true);
	}
	
	
	
}
