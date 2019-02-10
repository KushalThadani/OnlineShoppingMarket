package com.utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class captureScreenShot {

	public static void takeScreenShot(WebDriver driver, String capScrName) throws Exception {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./screenShot/"+capScrName+".png"));
		} catch (WebDriverException e) {
			System.out.println("Exception is occured while taking screen shot "+ e.getMessage());
		}
	}
}
