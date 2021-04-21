package com.learnAutomation.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnAutomation.pages.LoginPage;
import com.learnAutomation.utility.BrowserFactory;
import com.learnAutomation.utility.ExcelDataProvider;
import com.learnAutomation.utility.Helper;

public class LoginTest extends BaseClass{

	@Test(priority = 1)
	public void loginCRM() {
	
		logger = report.createTest("Login to CRM");
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class );
		
		logger.info("Starting application");
		
		loginPage.loginToCRM(excel.getStringData("Login",0, 0), excel.getIntegerData("Login", 0, 1));
		
		logger.pass("Application login successfuly");
		
		
		//Helper.captureScreenShot(driver);
		
	}
	
//	@Test (priority = 2)
//	
//	public void loginApp1() {
//	
//		logger1= report.createTest("logout");
//		
//
//	
//		logger1.fail("Application logout fail");
//		
//	}
//	
//	
}
