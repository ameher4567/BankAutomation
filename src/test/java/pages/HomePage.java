package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
    By userNameLocator = By.name("uid");
    By passwordLocator = By.name("password");
    By loginLocator = By.name("btnLogin");
    By resetLocator = By.name("btnReset");
    
	WebDriver driver = null;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLoginButton() {
		WebElement loginButton=driver.findElement(loginLocator);
		return loginButton;
	}
	
	public WebElement getUsernameField() {
		WebElement usernameField=driver.findElement(userNameLocator);
		return usernameField;
	}
		
	public WebElement getPasswordField() {
		WebElement passwordField=driver.findElement(passwordLocator);
		return passwordField;
}
}
