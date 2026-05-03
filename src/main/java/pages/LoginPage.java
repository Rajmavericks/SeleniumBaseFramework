package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(css = "input[data-qa='login-email']" )
	WebElement userIdfield;
	
	@FindBy(css= "input[placeholder='Password']")
	WebElement passwordfield;
	
	@FindBy(css = "button[data-qa='login-button']")
	WebElement LoginBtn;
	
	
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName(String username) {
		
		userIdfield.clear();		
		userIdfield.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		passwordfield.clear();
		passwordfield.sendKeys(password);		
	}
	
	public void clickLogin() {
		LoginBtn.click();
		
	}

}
