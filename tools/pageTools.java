package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageTools{
	WebDriver driver;
	WebElement bookStoreTab;

	pageTools(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getBookStoreTab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return driver.findElement(By.xpath("//div[@class='category-cards']/div[6]/div/div[1]"));
	}
	public void bookStoreApp() {
		this.bookStoreTab.click();
	}

	
	}
	
	



	
	
	
	
	
	
	


