package pages5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductPage {
	
	WebDriver driver;
	WebElement menuButton;
	WebElement logOutSideBar;
	WebElement addToCartButton;
	WebElement cart;
    WebElement x;
    
	public WebElement getX() {
		return driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[2]/div/button"));
	}

	public WebElement getCart() {
		return driver.findElement(By.className("fa-3x"));
	}

	public WebElement getAddToCartButton() {
		return driver.findElement(By.className("btn_inventory"));
	}

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMenuButton() {
		return driver.findElement(By.className("bm-burger-button"));
	}

	public WebElement getLogOutSideBar() {
		return driver.findElement(By.id("logout_sidebar_link"));
	}

	public void openSideMenu() {
		this.getMenuButton().click();
	}
	
	public void addToCartClick() {
		this.getAddToCartButton().click();
	}
	
	public void CartClick() {
		this.getCart().click();
	}
	
	public void xClick() {
		this.getX().click();
	}
}
