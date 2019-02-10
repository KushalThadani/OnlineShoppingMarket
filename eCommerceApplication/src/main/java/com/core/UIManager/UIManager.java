package com.core.UIManager;

import java.util.*;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.core.UIInterface.IUIManager;
public class UIManager implements IUIManager {

	@Override
	public void clickElement(WebElement locator) {
		locator.click();
		Reporter.log("");
	}
	@Override
	public void setElementText(WebElement locator, String text) {
		locator.sendKeys(text);
		Reporter.log("");
	}
	@Override
	public void getElementText(WebElement _locator) {
		String temp = _locator.getText();
	}
	@Override
	public void getElementAttr(WebElement _locator, String get_txt) {
		String temp = _locator.getAttribute(get_txt);
	}
	@Override
	public HashMap<Integer, HashMap<Integer, String>> ProductTableDetails(WebElement _locat) {
		return null;
	}
	@Override
	public int[] getTableRowWithColText(WebElement _locator, String row_with_col_text) {
		return null;
	}
	@Override
	public List<WebElement> getTablechildElement(WebElement _locator, int row, int col) {
		return null;
	}
}
