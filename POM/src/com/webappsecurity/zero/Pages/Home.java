package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(id="signin_button")
	private WebElement signIn;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignIn() {
		signIn.click();
	}

}
