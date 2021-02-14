package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	WebElement logInButton;
	WebElement logOutButton;
	WebElement userNameInputField;
	WebElement passwordNameInputField;
	WebElement logOutLabel;
	WebElement ErrorMessage;
	
	public WebElement getLogOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/nav/ul/li[6]/a"));
	}
	
	public WebElement getErrorMessage() {
		return driver.findElement(By.className("woocommerce-error"));
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.name("login"));
	}

	public WebElement getUserNameInputField() {
		return driver.findElement(By.id("username"));
	}

	public WebElement getPasswordNameInputField() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getLogOutLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
	}
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertUsername(String korisnickoIme) {
		this.getUserNameInputField().clear();
		this.getUserNameInputField().sendKeys(korisnickoIme);
	}
	
	public void insertPassword(String lozinka) {
		this.getPasswordNameInputField().clear();
		this.getPasswordNameInputField().sendKeys(lozinka);
	}
	
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public void logOutButtonClick() {
		this.getLogOutButton().click();
	}
	
	public void logIn(String korisnickoIme, String lozinka) {
		this.getUserNameInputField().sendKeys(korisnickoIme);
		this.getPasswordNameInputField().sendKeys(lozinka);
		this.logInButton.click();
	}

}
