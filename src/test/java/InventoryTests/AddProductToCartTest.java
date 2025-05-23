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
public class AddProductToCartTest extends BaseClass{

	@Test(groups = {"SmokeSuite", "RegressionSuite"})
	public void tc_01_AddProductToCartTest() throws IOException
	{
		
		//Read data from excel file
		String PRODUCTNAME = fUtil.readDataFromExcel("Products", 1, 2);//Run time data
		
		//Click on a Product
		InventoryPage ip = new InventoryPage(driver);
		ip.clickOnAProduct(driver, PRODUCTNAME);
		
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
	}
	
	@Test(groups = "SmokeSuite")/*(retryAnalyzer = GenericUtilities.RetryAnalyserImplementation.class)*/
	public void SampleTest()
	{
//		Assert.fail();
		System.out.println("Sample");
	}
}
