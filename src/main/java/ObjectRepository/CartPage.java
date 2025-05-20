package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy(className = "inventory_item_name")
	private WebElement itemInfo;
	
	@FindBy(xpath = "//button[.='Remove']")
	private WebElement removeBtn;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getItemInfo() {
		return itemInfo;
	}

	public WebElement getRemoveBtn() {
		return removeBtn;
	}
	
	//Business Library
	
	/**
	 * This method will capture product name and return to caller
	 * @return
	 */
	
	public String captureItemName()
	{
		return itemInfo.getText();
	}
	
	/**
	 * This method will click on remove button
	 */
	
	public void clickOnRemoveBtn()
	{
		removeBtn.click();
	}
	
	////div[.='Sauce Labs Backpack']/parent::a[@href='#']/following-sibling::div[@class='item_pricebar']/child::button
}
