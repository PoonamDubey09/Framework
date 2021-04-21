package Chrome;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	@Test
	
	public void loginTest() {
		
		System.out.println("Login your website");
		
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/htmlAutomationReport.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger1= extent.createTest("Login Test");
		
		logger1.log(Status.INFO,"Login to your website");
		
		logger1.log(Status.PASS, "It is passed");
		
		extent.flush();
		
		ExtentTest logger2= extent.createTest("Logout Test");
		
		logger2.log(Status.INFO, "Logout to your website");
		logger2.log(Status.FAIL, "It is failed");
		
		//.fail("Test case failed", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/Akshay/Desktop/photo.JPG"));
		extent.flush();
		
		
		
		
		
	}
}
