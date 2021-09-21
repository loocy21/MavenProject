package com.crm.SelectApprovedObjectRpsitory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.autodesk.Utils.WebDriverUtility;

public class Select_ApprovedPage extends WebDriverUtility{
	WebDriver driver;
	
	public Select_ApprovedPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement addbtn;
	
	@FindBy(name="subject")
	private WebElement writeSubject;
	
	
	public WebElement getWriteSubject() {
		return writeSubject;
	}
	@FindBy(name="postatus")
	private WebElement selectstatus;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement savebtn;
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}

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
	public void selectstatus(String Status)                      
	{
		select(selectstatus, Status);
	}
	public void writeSubject(String Subject)
	{
		writeSubject.sendKeys(Subject);
		
	}
	public void save()
	{
		savebtn.click();
		
	}
	
	}
	


		
	


	
		
	
	
	


