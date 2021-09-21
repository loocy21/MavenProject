package com.crm.select_cancelled.ObjectRepo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.autodesk.Utils.WebDriverUtility;

public class Select_Cancelled extends WebDriverUtility{
	
	public Select_Cancelled(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement addbtn;
	 
	@FindBy(name="subject")
	private WebElement createsub;
	
	@FindBy(name="postatus")
	private WebElement selectstatus;
	
	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getSelectstatus() {
		return selectstatus;
	}

	public void addbtn()
	{
		addbtn.click();
	}
	public void selectstatus(String Statusnam)                      
	{
		select(selectstatus, Statusnam);
	}
	
	
	

}
