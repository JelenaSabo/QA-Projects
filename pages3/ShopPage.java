package pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {

	WebDriver driver; 
	WebElement Item1;
	WebElement Item2;
	WebElement Item3;
	WebElement delFromCart;
	
	public WebElement getItem1() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}
	public WebElement getItem2() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[2]"));
	}
	public WebElement getItem3() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[3]/div/a[2]"));
		
	}
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getDelFromCart() {
		return driver.findElement(By.className("remove"));
	}
	
	public void clickDelFromCart() {
		getDelFromCart().click();
	}
	
	public void item1Click() {
		this.getItem1().click();
	}
	
	public void item2Click() {
		this.getItem2().click();
	}
	
	public void item3Click() {
		this.getItem3().click();
	}

}
