package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.MainPage;
import pages.ShopPage;

public class AddProductToCart {
	
	WebDriver driver;
	ShopPage shopPage;
	MainPage mainPage;
	CartPage cartPage;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		this.shopPage = new ShopPage(driver);
		this.mainPage = new MainPage(driver);
		this.cartPage = new CartPage(driver);
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}

	@Test (priority = 5)
	public void addProductToCart() throws InterruptedException {
		mainPage.navigateToShop();
		Thread.sleep(2000);
		shopPage.addToCartClick();
		Thread.sleep(2000);
		shopPage.viewCartClick();
		
		Thread.sleep(2000);
		
		String name = cartPage.getProductName().getText();
		Assert.assertEquals(name, "Flying Ninja");
		
	}
	@Test (priority = 6)
	public void addProductToCart2() throws InterruptedException {
		mainPage.navigateToShop();
		Thread.sleep(2000);
		shopPage.addToCartClick();
		Thread.sleep(2000);
		shopPage.viewCartClick();
		
		Thread.sleep(2000);
		
		String name2 = cartPage.getProductName().getText();
		Assert.assertEquals(name2, "Happy Ninja");
	}
	//@Test 
	public void removeProductFromCart() throws InterruptedException {
		mainPage.navigateToShop();
		Thread.sleep(2000);
		shopPage.removeFromCartClick();
		Thread.sleep(2000);
		shopPage.viewCartClick();
		
		Thread.sleep(2000);
		
		String name = cartPage.getProductName().getText();
		Assert.assertEquals(name, "Flying Ninja");
		
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterClass() {
		//driver.close();
	}
}//*[@id="main"]/div[2]/ul/li[2]/a/h2
