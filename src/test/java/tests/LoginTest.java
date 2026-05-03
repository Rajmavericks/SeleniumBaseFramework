package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest{
	
	@Test	
	public void testValidLogin() {
		
		Log.info("Starting Loging Test");
		
		LoginPage loginPage = new LoginPage(driver);
		Log.info("Adding Credentials");
		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		Log.info("Verify the login Scenario");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");		
		
		
	}

}
