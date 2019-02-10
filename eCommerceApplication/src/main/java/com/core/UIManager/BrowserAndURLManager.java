package com.core.UIManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.log4testng.Logger;

import com.core.UIInterface.IBrowserAndURLManager;
import com.core.UIInterface.ILogAndReport;
import com.driverConfig.Config;

public class BrowserAndURLManager implements IBrowserAndURLManager  , ILogAndReport{
	
	Logger log =  Logger.getLogger(BrowserAndURLManager.class);
	
	public WebDriver setBrowser(String _browser) throws IOException {
	Config config = new Config();	
		HashMap<String, String> config_data = config.config_data();
		WebDriver driver = null;
		try {
			switch(_browser.toLowerCase()) {
			case "chrome":
										System.setProperty("webdriver.chrome.driver", 
										config_data.get("CHROME_DRIVER_PATH"));
										driver = new ChromeDriver();
										
				break;
			case "firefox":
										System.setProperty("webdriver.geckodriver.driver", 
												config_data.get("FIREFOX_DRIVER_PATH"));
										driver = new FirefoxDriver();
				break;
			case "opera":
										System.setProperty("webdriver.opera.driver", 
												config_data.get("OPERA_DRIVER_PATH"));
										driver = new OperaDriver();
				break;
			case "internet":	
										System.setProperty("webdriver.ie.driver", 
												config_data.get("INTERNET_DRIVER_PATH"));
										driver = new InternetExplorerDriver();
				break;
			case "edge":
										System.setProperty("webdriver.edge.driver", 
												config_data.get("MICROSOFT_EDGE_DRIVER_PATH"));
										driver = new EdgeDriver();
				break;
					}
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			return driver;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return driver;	
	}
	public boolean navigatePageUrl(WebDriver driver , String _url) {
		try {
			driver.get(_url);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return true;
	}
}