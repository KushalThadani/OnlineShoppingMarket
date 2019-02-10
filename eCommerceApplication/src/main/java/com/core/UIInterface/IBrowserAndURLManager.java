package com.core.UIInterface;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public interface IBrowserAndURLManager {
	public WebDriver setBrowser(String _browser) throws IOException;
	boolean navigatePageUrl(WebDriver driver, String _url);
}
