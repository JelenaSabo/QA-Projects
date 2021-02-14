package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLogin {
	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginButton;
	WebElement logoutButton;
	
	public pageLogin(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.id("login"));
	}
	
	public WebElement getLogoutButton() {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/button[1]"));
	}

	public void logIn(String username, String password) throws InterruptedException {
		getUsernameField().clear();
		getUsernameField().sendKeys(username);
		Thread.sleep(2000);
		getPasswordField().clear();
		getPasswordField().sendKeys(password);
		Thread.sleep(2000);
		getLoginButton().click();
	}
	
	public String logOutButtonText() {
		return getLogoutButton().getText();
	}
	
	public void logOut() {
		getLogoutButton().click();
	}


	
	

}