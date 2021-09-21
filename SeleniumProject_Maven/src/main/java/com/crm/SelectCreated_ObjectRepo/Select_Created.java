package com.crm.SelectCreated_ObjectRepo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import com.crm.autodesk.Utils.WebDriverUtility;

public class Select_Created  extends WebDriverUtility{
	


	
	public   Select_Created (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement addbtn;
	
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
	public void selectstatus(String StatusNum)                      
	{
		select(selectstatus, StatusNum);
	}
	

	

	
	
		
	


}
