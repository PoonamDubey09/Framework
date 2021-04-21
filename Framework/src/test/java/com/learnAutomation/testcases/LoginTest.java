package com.learnAutomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnAutomation.pages.LoginPage;

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
