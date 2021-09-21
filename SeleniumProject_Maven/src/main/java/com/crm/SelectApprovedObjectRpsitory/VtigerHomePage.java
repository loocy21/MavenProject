package com.crm.SelectApprovedObjectRpsitory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.autodesk.Utils.WebDriverUtility;

public class VtigerHomePage extends WebDriverUtility{
	WebDriver driver;
	
	
	public VtigerHomePage(WebDriver driver) 
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
		return clickonpurchasebtn;
	}
	@FindBy(xpath="//a[text()='Purchase Order']")
	private WebElement clickonpurchasebtn;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement Administratorimg;
	
	@FindBy(linkText= "Sign Out")
	private WebElement signoutLnk;

	
	public WebElement getAdministratorimg() {
		return Administratorimg;
	}
	public WebElement getSignoutLnk() {
		return signoutLnk;
	}
	public void more()
	{
		mouseOver(driver,morebtn);
		clickonpurchasebtn.click();
	}
	public void Administrator(WebDriver driver)
	{
		mouseOver(driver,Administratorimg);
		
	}
}
	
	
