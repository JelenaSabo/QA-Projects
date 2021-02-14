package pages3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement cartTab;
	WebElement myAccountTab;
	WebElement shopTab;
	WebElement checkoutTab;
	WebElement samplePageTab;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCheckoutTab() {
		return driver.findElement(By.className("page-item-9"));
	}

	public WebElement getSamplePageTab() {
		return driver.findElement(By.className("page-item-2"));
	}

	public WebElement getCartTab() {
		return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
	}

	public WebElement getMyAccauntTab() {
		return driver.findElement(By.className("page-item-10"));
	}

	public WebElement getShopTab() {
		return driver.findElement(By.className("page-item-7"));
	}

	public void navigateToMyAccount() {
		this.getMyAccauntTab().click();
	}

	public void navigateToShopTab() {
		this.getShopTab().click();
	}

	public void navigateToCartTab() {
		this.getCartTab().click();
	}
	
	public void navigateToSamplePageTab() {
		this.getSamplePageTab().click();
	}

	public void navigateToCheckoutTab() {
		this.getCartTab().click();
	}

}
