package com.learnAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	//This is new update from Poonam
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver= ldriver;
	}
	
	@FindBy(name="email1") WebElement uname;
	@FindBy(name= "password") WebElement upassword;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]") WebElement loginbutton;
	
	public void loginToCRM(String username, String userpassword) {
		
			
		
		
		uname.sendKeys(username);
		upassword.sendKeys(userpassword);
		loginbutton.click();
		
		System.out.println("Login successfull");
	}

	
}
