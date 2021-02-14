package tests3;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends BasicTests{

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}

	@Test
	public void addToCart() throws InterruptedException {
		shopPage.item1Click();
		Thread.sleep(2000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		String assert1 = citacIzExela.getStringData("addingItems", 1, 2);
		String assert2 = citacIzExela.getStringData("addingItems", 1, 3);
		String name1 = cartPage.get1LabelOfTheProduct().getText();
		String price1 = cartPage.get1PriceOfTheProduct().getText(); 
		Assert.assertEquals(name1, assert1);
		Assert.assertEquals(price1, assert2);
		
	}
	
	@Test
	public void deleteFromCart() throws InterruptedException {
		addToCart();
		Thread.sleep(2000);
		shopPage.clickDelFromCart();
		Thread.sleep(2000);
		String assert1 = citacIzExela.getStringData("deleteItem", 1, 1);
		String removedConfirmation = cartPage.getProductRemoved().getText();
		Assert.assertEquals(removedConfirmation, assert1);
	}
	
	@Test
	public void adding3ItemsToCart() throws InterruptedException {
		shopPage.item1Click();
		shopPage.item2Click();
		shopPage.item3Click();
		Thread.sleep(2000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		String assert1 = citacIzExela.getStringData("addingItems", 1, 2);
		String assert2 = citacIzExela.getStringData("addingItems", 1, 3);
		String name1 = cartPage.get1LabelOfTheProduct().getText();
		String price1 = cartPage.get1PriceOfTheProduct().getText(); 
		Assert.assertEquals(name1, assert1);
		Assert.assertEquals(price1, assert2);
		String assert3 = citacIzExela.getStringData("addingItems", 2, 2);
		String assert4 = citacIzExela.getStringData("addingItems", 2, 3);
		String name2 = cartPage.get2LabelOfTheProduct().getText();
		String price2 = cartPage.get2PriceOfTheProduct().getText(); 
		Assert.assertEquals(name2, assert3);
		Assert.assertEquals(price2, assert4);
		String assert5 = citacIzExela.getStringData("addingItems", 3, 2);
		String assert6 = citacIzExela.getStringData("addingItems", 3, 3);
		String name3 = cartPage.get3LabelOfTheProduct().getText();
		String price3 = cartPage.get3PriceOfTheProduct().getText(); 
		Assert.assertEquals(name3, assert5);
		Assert.assertEquals(price3, assert6);
	}
	
	@Test
	public void adding2ItemsToCartAndDelOne() throws InterruptedException {
		shopPage.item2Click();
		shopPage.item3Click();
		Thread.sleep(2000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		cartPage.xButton2Click();
		Thread.sleep(2000);
		String assertDel = citacIzExela.getStringData("deleteItem", 2, 1);
		String message = cartPage.getRemoveMessage().getText();
		Assert.assertEquals(assertDel, message);
		
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}
