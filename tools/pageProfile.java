package tools;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageProfile {
	
	WebDriver driver;
	WebElement bookName;
	WebElement deleteAllBooksButton;
	WebElement deleteAllConfirmationButton;
	WebElement emptyBookNameField;
	WebElement logOutButton;

	public pageProfile(WebDriver driver) {
		//super();
		this.driver = driver;
	}

	public WebElement getBookName() {
		return driver.findElement(By.xpath("//*[@id=\"see-book-Designing Evolvable Web APIs with ASP.NET\"]/a"));
	}

	public WebElement getDeleteAllBooksButton() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/button"));
	}
	
	public WebElement getDeleteAllConfirmationButton() {
		return driver.findElement(By.xpath("//*[@id=\"closeSmallModal-ok\"]"));
	}
	

	public WebElement getEmptyBookNameField() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]"));
	}

	public WebElement getLogOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	}

	public void DeleteAllBooks() throws InterruptedException {
		getDeleteAllBooksButton().click();
		Thread.sleep(2000);
		getDeleteAllConfirmationButton().click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
		
	}
	
	public void clickOnLogOutButton() throws InterruptedException {
		getLogOutButton().click();
		Thread.sleep(2000);
	}

}
