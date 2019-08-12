package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerify {
	
	@FindBy(id="tf_amount")
	private WebElement tranfAmount;
	
	@FindBy(id="btn_submit")
	private WebElement submit;
	
	public TransferFundsVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAmountTranf() {
		String actualAmount = tranfAmount.getAttribute("value");
		submit.click();
		return actualAmount;
	}

}
