package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement cartTab;
	WebElement myAccountTab;
	
	public WebElement getCartTab() {
		return cartTab;
	}

	public WebElement getMyAccauntTab() {
		return driver.findElement(By.className("page-item-10"));
	}


	public WebElement getShopTab() {
		return shopTab;
	}


	WebElement shopTab;
	

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToMyAccount() {
		this.getMyAccauntTab().click();
	}
}
