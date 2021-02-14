package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {

	WebDriver driver;
	WebElement addToCartBtn;
	WebElement viewCartBtn;
	
	
	public WebElement getAddToCartBtn() {
		return driver.findElement(By.className("ajax_add_to_cart"));
	}


	public WebElement getViewCartBtn() {
		return driver.findElement(By.className("wc-forward"));
	}


	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addToCartClick() {
		this.getAddToCartBtn().click();
	}
	
	public void viewCartClick() {
		this.getViewCartBtn().click();
	}


	public void removeFromCartClick() {
		// TODO Auto-generated method stub
		
	}
}
