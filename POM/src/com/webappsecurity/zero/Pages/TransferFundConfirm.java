package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundConfirm {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confMsg;
	
	public TransferFundConfirm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getConfText() {
		return confMsg.getText();
	}
	
}
