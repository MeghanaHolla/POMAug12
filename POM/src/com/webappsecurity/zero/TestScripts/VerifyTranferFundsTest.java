package com.webappsecurity.zero.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.Home;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFundConfirm;
import com.webappsecurity.zero.Pages.TransferFunds;
import com.webappsecurity.zero.Pages.TransferFundsVerify;

public class VerifyTranferFundsTest extends Base {
	
	
	
	@Test
	public void verifyTranferFunds() {
		Home hm = new Home(driver);
		Login lp = new Login(driver);
		AccountSummary acc = new AccountSummary(driver);
		TransferFunds tf = new TransferFunds(driver);
		TransferFundsVerify tfv = new TransferFundsVerify(driver);
		TransferFundConfirm tfc = new TransferFundConfirm(driver);
		
		hm.clickSignIn();
		lp.applicationLogin("username","password");
		acc.clickTranferFunds();
		tf.tranferFunds("200");
		
		String getAmount = tfv.verifyAmountTranf();
		if(getAmount.equals("200")) {
			String actualText = tfc.getConfText();
			String expectedText = "You successfully submitted your transaction.";
			Assert.assertEquals(actualText, expectedText);
		}
	}
	
	
	

}
