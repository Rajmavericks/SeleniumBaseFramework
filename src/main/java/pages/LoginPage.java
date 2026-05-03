package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userIdfield= By.id("Email");
	private By passwordfield = By.id("Password");
	private By LoginBtn=By.cssSelector("button[type='submit']");
	
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
