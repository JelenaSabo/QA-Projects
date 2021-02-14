package tools;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBooks {
	
	WebDriver driver;
	WebElement login;
	WebElement bookStoreMenu;
	WebElement book1;
	WebElement addToCollection;
	WebElement profileTab;
	pageBooks(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getLogin() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]"));
	}
	public WebElement getBookStoreMenu() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]"));
	}
	public WebElement getBook1() {
		return driver.findElement(By.xpath("//*[@id=\"see-book-Designing Evolvable Web APIs with ASP.NET\"]/a"));
	}
	public WebElement getAddToCollection() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[9]/div[2]/button"));
	}
	public WebElement getProfileTab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]"));
	}
	public void clickOnLogin() throws InterruptedException {
		getLogin().click();
		Thread.sleep(2000);
	}
	
	public void clickOnBookstoreMenuTab() throws InterruptedException {
		getBookStoreMenu().click();
		Thread.sleep(2000);
	}
	
	public void clickOnBook1() throws InterruptedException {
		getBook1().click();
		Thread.sleep(2000);
	}
	
	public void clickOnAddToYourCollection() throws InterruptedException {
		getAddToCollection().click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
	}
	
	public void clickOnProfileTab() throws InterruptedException {
		getProfileTab().click();
		Thread.sleep(2000);
	
}
}
