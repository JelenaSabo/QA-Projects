package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	WebElement logInButton;
	WebElement userNameInputField;
	WebElement passwordNameInputField;
	WebElement logOutLabel;

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
		this.getUserNameInputField().sendKeys(korisnickoIme);
	}
	
	public void insertPassword(String lozinka) {
		this.getPasswordNameInputField().sendKeys(lozinka);
	}
	
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public void logIn(String korisnickoIme, String lozinka) {
		this.getUserNameInputField().sendKeys(korisnickoIme);
		this.getPasswordNameInputField().sendKeys(lozinka);
		this.logInButton.click();
	}

	public WebElement getErrorLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getLoginLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
