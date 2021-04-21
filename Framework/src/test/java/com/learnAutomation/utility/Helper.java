package com.learnAutomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	//Screenshot, alerts, frames, windows, sync issue, javascript executer
	public static String captureScreenShot(WebDriver driver) {
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String src1= System.getProperty("user.dir")+"/ScreenShots/Login"+ getCurrentDateTime()+ ".png";
			//new File("./ScreenShots/Login"+ getCurrentDateTime()+ ".png");
	try {
		org.openqa.selenium.io.FileHandler.copy(src, new File(src1));
		
		System.out.println("Screen shot captured successfuly");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("unable to capture screenshot" +e.getMessage());
	}
	return src1;
	}
	public static String getCurrentDateTime() {
		DateFormat dateformate= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		
		return dateformate.format(currentdate);
		
	}
}
