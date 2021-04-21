/**
 * 
 */
package com.learnAutomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Akshay
 *
 */
public class TestCaseWithoutFramework {

	@Test
	
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");
		
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("https://freecrm.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
	}
}
