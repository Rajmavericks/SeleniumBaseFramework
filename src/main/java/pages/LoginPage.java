package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userIdfield= By.cssSelector("input[data-qa='login-email']");
	private By passwordfield = By.cssSelector("input[placeholder='Password']");
	private By LoginBtn=By.cssSelector("button[data-qa='login-button']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void enterUserName(String username) {
		driver.findElement(userIdfield).clear();
		driver.findElement(userIdfield).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordfield).clear();
		driver.findElement(passwordfield).sendKeys(password);		
	}
	
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
		
	}

}
