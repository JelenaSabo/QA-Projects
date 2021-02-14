package tests3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CartPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ShopPage;

public class BasicTests {
	
	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
	ExcelCitac citacIzExela;
    ShopPage shopPage;
	CartPage cartPage;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		this.shopPage = new ShopPage(driver);
		this.cartPage = new CartPage(driver);
	    citacIzExela = new ExcelCitac("data/testplan.xlsx");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void posleKlase() throws IOException {
		driver.close();
		citacIzExela.fis.close();
		citacIzExela.wb.close();
	}

}
