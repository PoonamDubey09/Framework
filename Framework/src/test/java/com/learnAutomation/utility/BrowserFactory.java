package com.learnAutomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserFactory {

	@BeforeTest
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String url) {
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
	//		driver.manage().timeouts().pageLoadTimeout(30l, TimeUnit.SECONDS);
		}
		
		else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
	//		driver.manage().timeouts().pageLoadTimeout(20l, TimeUnit.SECONDS);
		}
		
		
		else {
			
			System.out.println("no browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	
//	public static void quiteBrowser(WebDriver driver) {
//		
//		driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
//		driver.quit();
//		
//		System.out.println("quite");
//		
	//}
}
