package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utils.ExtentReportManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import utils.Log;

public class BaseTest {
	
	protected WebDriver driver;
	protected static ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent = ExtentReportManager.getReportinstance();
	}
	
	@AfterSuite
	public void tearDownReport() {
		extent.flush();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		Log.info("Starting webdriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Navigate to URL...");
		driver.get("https://automationexercise.com/login");		
		
	}
	
	@AfterMethod	
	public void tearDown(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
		    String screenshotPath = ExtentReportManager.captureScreenshot(driver, "LoginFailure");
		    System.out.println("ScreenShot Captures, PATH: " + screenshotPath);
		    test.fail("Test Failed. Screenshot attached.",
		        MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		}
		
		if(driver!=null) {
			Log.info("Closing the Browser");
			driver.quit();
		}
	}

}
