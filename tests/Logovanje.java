package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.MyAccountPage;

public class Logovanje {
	
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
		myAccountPage.insertUsername("ccc");
		Thread.sleep(2000);
		myAccountPage.insertPassword("123");
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogInButton().getText();
		Assert.assertEquals(textForAssert, "Invalid Username and Password");
		}
	@Test (priority = 5)
	public void logIn2() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		//myAccountPage.logIn("customer","123456789");
		myAccountPage.insertUsername("");
		Thread.sleep(2000);
		myAccountPage.insertPassword("");
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogInButton().getText();
		Assert.assertEquals(textForAssert, "Username is required");
		}
	@Test (priority = 10)
	public void logOut() throws InterruptedException {
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		myAccountPage.logIn("customer","123456789");
		//myAccountPage.insertUsername("");
		//Thread.sleep(2000);
		//myAccountPage.insertPassword("");
		//Thread.sleep(2000);
		//myAccountPage.logInButtonClick();
		//Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, "Log out");
		Thread.sleep(2000);
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
