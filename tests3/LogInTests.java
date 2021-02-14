package tests3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LogInTests extends BasicTests {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 0)
	public void logIn() throws InterruptedException, IOException {
		mainPage.navigateToMyAccount();
		String username = citacIzExela.getStringData("correctCredentials", 4, 3);
		String password = String.valueOf(citacIzExela.getIntData("correctCredentials", 5, 3));
		String logOutText = citacIzExela.getStringData("correctCredentials", 6, 3);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
		myAccountPage.insertUsername(username);
		Thread.sleep(2000);
		myAccountPage.insertPassword(password);
		Thread.sleep(2000);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, logOutText);
	}

	@Test(priority = 5)
	public void logInUsingNoCredentials() throws InterruptedException {
		mainPage.navigateToMyAccount();
		String username = citacIzExela.getStringData("noCredentials", 4, 3);
		String password = String.valueOf(citacIzExela.getIntData("noCredentials", 5, 3));
		String logOutText = citacIzExela.getStringData("noCredentials", 6, 3);
		mainPage.navigateToMyAccount();
		myAccountPage.insertUsername(username);
		myAccountPage.insertPassword(password);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);

		String textForAssert = myAccountPage.getErrorMessage().getText();
		AssertJUnit.assertEquals(textForAssert, logOutText);
	}

	@Test(priority = 10)
	public void logInUsingInvalidUsername() throws InterruptedException {
		mainPage.navigateToMyAccount();
		String username = citacIzExela.getStringData("wrongCredentials", 4, 3);
		String password = String.valueOf(citacIzExela.getIntData("correctCredentials", 5, 3));
		String logOutText = citacIzExela.getStringData("wrongCredentials", 6, 3);
		myAccountPage.insertUsername(username);
        myAccountPage.insertPassword(password);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);

		String textForAssert = myAccountPage.getErrorMessage().getText();
		AssertJUnit.assertEquals(textForAssert, logOutText);
	}

	@Test(priority = 15)
	public void logInUsingInvalidPassword() throws InterruptedException {
		mainPage.navigateToMyAccount();
		String username = citacIzExela.getStringData("correctCredentials", 4, 3);
		String password = String.valueOf(citacIzExela.getIntData("wrongCredentials", 5, 3));
		String logOutText = citacIzExela.getStringData("wrongCredentials", 6, 4);
		myAccountPage.insertUsername(username);
        myAccountPage.insertPassword(password);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);

		String textForAssert = myAccountPage.getErrorMessage().getText();
		AssertJUnit.assertEquals(textForAssert,logOutText);
	}

	@Test(priority = 20)
	public void logOut() throws InterruptedException, IOException {
		this.logIn();
		myAccountPage.getLogOutLabel().click();
		Thread.sleep(2000);
		String logOutText = citacIzExela.getStringData("logOut", 1, 1);
		String textForAssert = myAccountPage.getLogInButton().getText();
		AssertJUnit.assertEquals(textForAssert, logOutText);

	}
 
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

}
