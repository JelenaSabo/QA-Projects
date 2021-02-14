package tests;

import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

public class LoginTest {
	
	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
	XSSFSheet sheet;
	XSSFCell[] niz = new XSSFCell[6];

	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		driver.manage().window().maximize();
		File fajl = new File("TestPlan.xlxs");
		FileInputStream fis = new FileInputStream(fajl);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheet("wrongCredentials");
	}	
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			driver.navigate().to("http://cms.demo.katalon.com/");
			Thread.sleep(2000);
		}
		
		@Test (priority = 1)
		public void logIn() throws InterruptedException {
			
		//	XSSFSheet sheet1 = null;
			//XSSFRow row = sheet1.getRow(2);
			//XSSFCell usernameCell = row.getCell(2);
			//XSSFCell passwordCell = row.getCell(2);
			
			mainPage.navigateToMyAccount();
			Thread.sleep(2000);
			//myAccountPage.logIn("customer","123456789");
			myAccountPage.insertUsername("abc");
			Thread.sleep(2000);
			myAccountPage.insertPassword("123");
			Thread.sleep(2000);
			myAccountPage.logInButtonClick();
			Thread.sleep(2000);
			
			String textForAssert = myAccountPage.getLogOutLabel().getText();
			Assert.assertEquals(textForAssert, "Log out");
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
	
	
	
	


