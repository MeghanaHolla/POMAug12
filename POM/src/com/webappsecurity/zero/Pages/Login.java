package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="user_login")
	private WebElement uLogin;
	
	@FindBy(id="user_password")
	private WebElement pass;
	
	@FindBy(name="submit")
	private WebElement login;
	
	@FindBy(css="#login_form > div.alert.alert-error")
	private WebElement errMsgBox;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin(String username, String password) {
		uLogin.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}
	
	public String getErrorMessage() {
		return errMsgBox.getText();
	}
	
	
	
	
}
