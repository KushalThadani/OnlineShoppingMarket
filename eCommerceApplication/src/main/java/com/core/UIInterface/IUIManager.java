package com.core.UIInterface;

import java.util.*;

import org.openqa.selenium.WebElement;

public interface IUIManager {
	//  This interface method for clicking on Element to perform  for getting result of next operation 
	public void clickElement(WebElement locator);
	//	This interface method is used to set the value for to show the next behavior
	public void setElementText(WebElement locator, String text);
	//	This interface method is used to get response after sending the data in default text format. 
	public void getElementText(WebElement _locator);
	//	This interface method is used to get response after sending the data in parameterized text format
	void getElementAttr(WebElement _locator , String get_txt);
	// This is interface HashMap method is used to check the data format of table 
	public HashMap<Integer, HashMap<Integer,String>> ProductTableDetails(WebElement _locat);
	//	This interface method is used to get data in row and  column format.
	public int[] getTableRowWithColText(WebElement _locator, String row_with_col_text);
	//	This is used next child window of table row and column.
	public List<WebElement> getTablechildElement(WebElement _locator, int row , int col);

}
