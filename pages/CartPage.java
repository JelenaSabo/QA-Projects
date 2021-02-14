package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	WebElement productName;
	WebElement remove;
	
	
	public WebElement getRemove() {
		return driver.findElement(By.className("product-remove"));
	}

	public WebElement getProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void deleteProduct() {
		this.getRemove().click();
	}
	
}
