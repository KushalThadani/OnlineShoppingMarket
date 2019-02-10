package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_loginPage {

	WebDriver driver;
	public PO_loginPage(WebDriver drv) {
		this.driver=drv;
	}
	
	@FindBy(how=How.XPATH, using="")WebElement txt_useranem;
	@FindBy(how=How.XPATH, using="")WebElement txt_password;
	@FindBy(how=How.XPATH, using="")WebElement click_login;
	
	public void set_username(String username) {
		txt_useranem.sendKeys(username);
	}
	public void set_password(String password) {
		txt_password.sendKeys(password);
	}
	public void click_on_login_button() {
		click_login.click();
	}
}
