package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest{
	
	@Test	
	public void testValidLogin() {
		
		Log.info("Starting Loging Test");
		test = ExtentReportManager.createTest("Login test");
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigate to Login Page");
		Log.info("Adding Credentials");
		loginPage.enterUserName("rajinigcp1@gmail.com");
		loginPage.enterPassword("12345678");
		loginPage.clickLogin();
		Log.info("Verify the login Scenario");
		test.info("Entered Credentials and clicked Login");
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");		
		test.pass("Login Succeessful");
		
		
	}
	
	@Test	
	public void testInValidLogin() {
		
		Log.info("Starting Loging Test");
		test = ExtentReportManager.createTest("Login test");
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigate to Login Page");
		Log.info("Adding Credentials");
		loginPage.enterUserName("rajinigcp@gmail.com");
		loginPage.enterPassword("12345678");
		loginPage.clickLogin();
		Log.info("Verify the login Scenario");
		test.info("Entered Credentials and clicked Login");
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");		
		test.pass("Login Succeessful");
		
		
	}

}
