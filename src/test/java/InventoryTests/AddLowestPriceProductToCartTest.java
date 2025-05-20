package InventoryTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import ObjectRepository.CartPage;
import ObjectRepository.InventoryItemPage;
import ObjectRepository.InventoryPage;

@Listeners(GenericUtilities.ListenersImplementation.class)
public class AddLowestPriceProductToCartTest extends BaseClass {

	@Test(groups = {"RegressionSuite", "SmokeSuite"})
	public void tc_02_AddLowestPriceProductToCartTest() throws IOException
	{
		
		//Read data from excel file
		String PRODUCTNAME = fUtil.readDataFromExcel("Products", 4, 3);//Run Time Data
		String SORTOPTION = fUtil.readDataFromExcel("Products", 4, 2);
		
		//Click on a Product
		InventoryPage ip= new InventoryPage(driver);
		ip.clickOnLowestPriceProduct(driver, SORTOPTION, PRODUCTNAME);
		
		//Click on add to cart
		InventoryItemPage iip = new InventoryItemPage(driver);
		iip.clickOnAddToCartBtn();
		
		//Navigate to cart
		ip.clickOnCartContainer();
		
		//Validate the product in cart
		CartPage cp = new CartPage(driver);
		String ProductInCart = cp.captureItemName();
		
		Assert.assertEquals(ProductInCart, PRODUCTNAME);
		System.out.println(ProductInCart);
		
//		Assert.assertTrue(ProductInCart.equals(PRODUCTNAME));
		
	}
}
