package pages5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	WebElement checkoutButton;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCheckoutButton() {
		return driver.findElement(By.className("checkout_button"));
	}
	
	public void ceckoutButonClick() {
		this.getCheckoutButton().click();
	}
}
