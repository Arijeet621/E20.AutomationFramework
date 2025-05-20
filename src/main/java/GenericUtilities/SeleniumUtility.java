package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of generic methods related to Selenium tool
 * @author Arijeet
 * 
 */

public class SeleniumUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will add 10 seconds of implicit wait
	 * @param driver
	 */
	
	public void addImplicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method will wait for 10 seconds for element to be visible
	 * @param driver
	 */
	
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will wait for 10 seconds for element to be clickable
	 * @param driver
	 * @param element
	 */
	
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will handle DropDown by index
	 * @param element
	 * @param index
	 */
	
	public void handleDropdown(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This method will handle DropDown by value
	 * @param element
	 * @param value
	 */
	
	public void handleDropdown(String value, WebElement element)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method will handle DropDown by visible text
	 * @param value
	 * @param element
	 */
	
	public void handleDropdown(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * This method will perform Mouse Hover
	 * @param driver
	 * @param element
	 */
	
	public void MouseHover(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	/**
	 * This method will perform DoubleClick
	 * @param driver
	 * @param element
	 */
	
	public void DoubleClick(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	/**
	 * This method will perform RightClick
	 * @param driver
	 * @param element
	 */
	
	public void RightClick(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	/**
	 * This method will Click and Hold the element
	 * @param driver
	 * @param element
	 */
	
	public void ClickAndHold(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.clickAndHold(element).build().perform();
	}
	
	/**
	 * This method will perform Drag and Drop
	 * @param driver
	 * @param src
	 * @param dst
	 */
	
	public void DragAndDrop(WebDriver driver, WebElement src, WebElement dst)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dst).build().perform();
	}
	
	/**
	 * This method will Scroll to the element
	 * @param driver
	 * @param element
	 */
	
	public void ScrollToElement(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.scrollToElement(element).build().perform();
	}
	
	/**
	 * This method will handle Frame by index
	 * @param driver
	 * @param frameIndex
	 */
	
	public void handleFrame(WebDriver driver, int frameIndex)
	{
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * This method will handle Frame by name
	 * @param driver
	 * @param name
	 */
	
	public void handleFrame(WebDriver driver, String name)
	{
		driver.switchTo().frame(name);
	}
	
	/**
	 * This method will handle Frame by WebElement
	 * @param driver
	 * @param element
	 */
	
	public void handleFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will accept Alert pop up
	 * @param driver
	 */
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will dismiss Alert pop up
	 * @param driver
	 */
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will get text of Alert pop up
	 * @param driver
	 */
	
	public void getTextAlert(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	
	/**
	 * This method will enter data to the Alert pop up
	 * @param driver
	 * @param text
	 */
	
	public void sendKeysAlert(WebDriver driver, String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	/**
	 * This method will capture text from the Alert pop up
	 * @param driver
	 * @return
	 */
	
	public String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	/**
	 * This method will give the Parent Window id
	 * @param driver
	 * @return
	 */
	
	public String parentWindow(WebDriver driver)
	{
		return driver.getWindowHandle();
	}
	
	/**
	 * This method will give all Child Window id
	 * @param driver
	 * @return
	 */
	
	public Set<String> childWindow(WebDriver driver)
	{
		return driver.getWindowHandles();
	}
	
	/**
	 * This method will open Child Window
	 * @param driver
	 * @param winID
	 */
	
	public void openAllChildWindow(WebDriver driver, Set<String> childwinID)
	{
		for(String Window:childwinID)
		{
			driver.switchTo().window(Window);
			String title=driver.getTitle();
			System.out.println(title);
		}
	}
	
	/**
	 * This method will switch from one Window to another Window
	 * @param driver
	 * @param winID
	 */
	
	public void backToParentWindow(WebDriver driver, String winID)
	{
		driver.switchTo().window(winID);
	}
	
	/**
	 * This method will capture Screenshots and return the path to the caller
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	
	public String captureScreenShot(WebDriver driver, String screenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\Screenshots\\"+screenShotName+".png");
		FileHandler.copy(src, dst);
		
		return dst.getAbsolutePath(); //For extent report
	}
}
