package pages5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement logInButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.id("login-button"));
	}

	public void usernameInput(String username) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(username);
	}

	public void passwordInput(String password) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}

	public void LogInButtonClick() {
		this.getLogInButton().click();
	}

}
