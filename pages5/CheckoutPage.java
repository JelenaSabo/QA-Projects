package pages5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement zipCode;
	WebElement continueButton;
	WebElement finishButton;
	WebElement messsage;

	public WebElement getMesssage() {
		return driver.findElement(By.className("complete-header"));
	}

	public WebElement getFinishButton() {
		return driver.findElement(By.className("cart_button"));
	}

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getZipCode() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.className("cart_button"));
	}

	public void firstNameInput(String firstName) {
		this.getFirstName().click();
		this.getFirstName().sendKeys(firstName);
	}

	public void lastNameInput(String lasttName) {
		this.getLastName().click();
		this.getLastName().sendKeys(lasttName);
	}

	public void zipCodeInput(String zipCode) {
		this.getZipCode().click();
		this.getZipCode().sendKeys(zipCode);
	}

	public void continueButtonClick() {
		this.getContinueButton().click();
	}

	public void finishButtonClick() {
		this.getFinishButton().click();
	}
}
