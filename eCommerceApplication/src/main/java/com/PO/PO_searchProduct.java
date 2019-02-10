package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_searchProduct {

	WebDriver driver;
	PO_searchProduct(WebDriver d){
		this.driver=d;
	}
	@FindBy(how=How.XPATH, using="")WebElement search_roduct;
}
