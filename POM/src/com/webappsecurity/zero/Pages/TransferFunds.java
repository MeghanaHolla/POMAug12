package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {

	@FindBy(id="tf_fromAccountId")
	private WebElement fromAccount;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAccount;
	
	@FindBy(id="tf_amount")
	private WebElement amount;
	
	@FindBy(id="tf_description")
	private WebElement desc;
	
	@FindBy(id="btn_submit")
	private WebElement submit;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void tranferFunds(String tAmount) {
		Select dd = new Select(fromAccount);
		dd.selectByIndex(2);
		
		Select dd2 = new Select(toAccount);
		dd2.selectByIndex(3);
		
		amount.sendKeys(tAmount);
		desc.sendKeys("Amount Tranfer from Savings to Loan");
		submit.click();
	}
	
	
}
