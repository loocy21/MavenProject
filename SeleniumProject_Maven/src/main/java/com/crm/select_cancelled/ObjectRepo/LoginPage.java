package com.crm.select_cancelled.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.Utils.WebDriverUtility;

public class LoginPage extends WebDriverUtility{
	
WebDriver driver;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/menuDnArrow.gif\"]")
	private WebElement morebtn;
	

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMorebtn() {
		return morebtn;
	}


	public WebElement getPurchasebtn() {
		return purchasebtn;
	}

	@FindBy(xpath="//a[@class='drop_downnew']")
	private WebElement purchasebtn;

	
	public void more()
	{
		
		mouseOver(driver,morebtn);
		
		purchasebtn.click();
		
	}
}



