package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testTools {
	WebDriver driver;
	pageTools mainPage;
	pageBooks bookstorePage;
	pageLogin loginPage;
	pageProfile profilePage;

@BeforeClass
public void objects() {
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	
	this.driver = new ChromeDriver();
	this.mainPage = new pageTools(driver);
	this.bookstorePage = new pageBooks(driver);
	this.loginPage = new pageLogin(driver);
	this.profilePage = new pageProfile(driver);
	driver.manage().window().maximize();
}

@BeforeMethod
public void setup() throws InterruptedException {
	driver.navigate().to("https://demoqa.com/");
	Thread.sleep(2000);
}

@Test
public void test() throws InterruptedException {
	mainPage.bookStoreApp();
	bookstorePage.clickOnLogin();
	loginPage.logIn("johndo", "J123*d@9");
	Thread.sleep(2000);
	Assert.assertEquals(true, loginPage.getLogoutButton().isDisplayed());
	bookstorePage.clickOnBookstoreMenuTab();
	bookstorePage.clickOnBook1();
	bookstorePage.clickOnAddToYourCollection();
	bookstorePage.clickOnProfileTab();
	String bookAssert = profilePage.getBookName().getText();
	Assert.assertEquals(bookAssert, "Designing Evolvable Web APIs with ASP.NET");
	Thread.sleep(5000);
	profilePage.DeleteAllBooks();
	String emptyFieldAssert = profilePage.getEmptyBookNameField().getText();
	Assert.assertEquals(emptyFieldAssert, " ");
	profilePage.clickOnLogOutButton();
}

@AfterMethod
public void afterTest() throws InterruptedException {
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	Thread.sleep(2000);
}

@AfterClass
public void end() {
	driver.close();
}

}
