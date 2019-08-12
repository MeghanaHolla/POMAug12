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

public class VerifyLoginTest extends Base{
	
	
	
	@Test
	public void verifyLogin() {
		Home hm = new Home(driver);
		Login lp = new Login(driver);
		AccountSummary acc = new AccountSummary(driver);
		
		hm.clickSignIn();
		lp.applicationLogin("username","password");
		boolean transFundPresent = acc.clickTranferFunds();
		Assert.assertTrue(transFundPresent);
	}
	
	

}
