package com.jbk.Utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TestUtil {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public static WebDriver driver;
	
	public static void takeScreenshotAtEndOfTest() throws Exception {
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		Files.copy(source, new File("/Framework/src/test/resources.png"));
		System.out.println("Screenshot is captured");
		driver.quit();
	}
}