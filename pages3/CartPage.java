package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	WebElement labelOfTheProduct;
	WebElement priceOfTheProduct;
	WebElement productRemoved;
	WebElement xButton2;
	WebElement removeMessage;

	
	public WebElement getRemoveMessage() {
		return driver.findElement(By.className("woocommerce-message"));
	}

	public WebElement getxButton2() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));
	}

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement get1LabelOfTheProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}

	public WebElement get1PriceOfTheProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[4]/span")); 
	}

	public WebElement get2LabelOfTheProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[3]/a"));
	}

	public WebElement get2PriceOfTheProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[4]/span")); 
	}
	public WebElement get3LabelOfTheProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[3]/a"));
	}

	public WebElement get3PriceOfTheProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[4]/span")); 
	}
	
	public WebElement getProductRemoved() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
	}
	
	public void xButton2Click() {
		this.getxButton2().click();
		
	}

}
