package com.webappsecurity.zero.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.Home;
import com.webappsecurity.zero.Pages.Login;

public class VerifyInvalidLloginTest extends Base {
	
	@Test
	public void verifyInvalidCredentailsTest() {
		Home hm = new Home(driver);
		Login lp = new Login(driver);
		
		hm.clickSignIn();
		lp.applicationLogin("u111","p111");
		String actualErrMsg = lp.getErrorMessage();
		String expectedErrMsg = "Login and/or password are wrong.";
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		
	}
	

}
