package com.crm.autodesk.Utils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * THIS class contains all the genric methods related to webdriver actions
 * @author ANSHUL
 *
 */

public class WebDriverUtility {
	/**
	 * this method will wait for the page load for 20 seconds
	 * @param driver
	 */
	
	
	public void waitForPageLoad(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	/**
	 * this method will maximise the window
	 */
	public void maximizeWindow(WebDriver driver ) {
		
		driver.manage().window().maximize();
	}
	/**
	 * this method will select from the dropdown using visible index
	 * @param purcaseDropdown
	 * @param purchaseOrder
	 */
		public void select (WebElement element,int Index)
		{
			Select sel = new Select (element);
			sel.selectByIndex(Index);
		}
		/**
		 * this method will select from the dropdown using mouse over actions
		 * @param driver
		 * @param element
		 */
		
		
		public void select (WebElement element,String value)
		{
			Select sel= new Select(element);
			sel.selectByValue(value);
		}
		
		public void mouseOver(WebDriver driver,WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
		}
		/**
		 * this method will use for double click 
		 * @param driver
		 * @param element
		 */
		public void doubleClick(WebDriver driver,WebElement element)
		{
			Actions act = new Actions (driver);
			act.doubleClick().click();
		}
		/**
		 * this method we use for accept the alert popup
		 * @param driver
		 */
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		/**
		 * this method will cancel the alert popup
		 * @param driver
		 */
		public void dismissAlert(WebDriver driver ) {
			driver.switchTo().alert().dismiss();
		}
		/**
		 * this method will switch to frame wrt to index
		 * @param driver
		 * @param index
		 */
		public void switchToFrame(WebDriver driver,int index) {
			driver.switchTo().frame(index);
		}
		/**
		 * this method will switch to frame wrt to id
		 * @param driver
		 * @param frameid
		 */
		public void switchToFrame(WebDriver driver,String frameid) {
			driver.switchTo().frame(frameid);
			
		}
		/**
		 * this method will switch to frame wrt to element
		 * @param driver
		 * @param frameElement
		 */
		public void switchToFrame(WebDriver driver,WebElement frameElement) {
			driver.switchTo().frame(frameElement);
			
		}
		/**
		 * this method will switch to frame wrt to partialwindowtitle
		 * @param driver
		 * @param partialwinTitle
		 */
		public void switchToWindow (WebDriver driver,String partialwinTitle) {
			
			 Set<String> windowHandles = driver.getWindowHandles();
			 Iterator<String> it = windowHandles.iterator();
			 while(it.hasNext())
			 {
				 String winId = it.next();
				 String actTitle = driver.switchTo().window(winId).getTitle();
				 if(actTitle.contains(partialwinTitle))
			
			 {
				 driver.switchTo().window(actTitle);
				 break;
			 }
			 }
		}
		
			
		}

