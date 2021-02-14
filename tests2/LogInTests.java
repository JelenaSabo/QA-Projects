package tests2;

//import java.util.ArrayList;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.MyAccountPage;

public class LogInTests {
	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
	
	@BeforeClass
	public void preKlase() {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}
	@Test (priority = 0)
	public void logIn() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		//myAccountPage.logIn("customer","123456789");
		myAccountPage.insertUsername("customer");
		Thread.sleep(2000);
		myAccountPage.insertPassword("123456789");
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, "Log out");
		}
	
	@Test (priority = 3)
	public void logInWithWrongCredentials() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		myAccountPage.insertUsername("custome");
		Thread.sleep(2000);
		myAccountPage.insertPassword("123456789");
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getErrorLabel().getText();
		Assert.assertEquals(textForAssert, "ERROR: Invalid username. Lost your password?");
	}
	
	@Test (priority = 4)
	public void logInWithoutCredentials() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		myAccountPage.insertUsername("");
		Thread.sleep(2000);
		myAccountPage.insertPassword("");
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getErrorLabel().getText();
		Assert.assertEquals(textForAssert, "Error: Username is required.");
	}
	
	@Test (priority = 10)
	public void logOutConfirm() throws InterruptedException {
		logIn();
		
		myAccountPage.getLogOutLabel().click();
		
		String loginText = myAccountPage.getLoginLabel().getText();
		Assert.assertEquals(loginText, "Login");
	}
	
	
	
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void pposleKlase() {
		driver.close();
		System.out.println("Izvrsava se posle klase");
	}
}

//test; logovanje s pogresnim kredencijalima
//
//test: logovanje da niste uneli kredencijale
//
//test: izlogovati se