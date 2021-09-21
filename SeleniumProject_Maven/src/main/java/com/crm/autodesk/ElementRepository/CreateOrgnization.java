package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.Utils.WebDriverUtility;

public class CreateOrgnization extends WebDriverUtility {
	WebDriver driver;
	
	public CreateOrgnization() 
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="accountname")
	private WebElement OrgNameEdt;
	
	@FindBy(name="industry")
	private WebElement industrydropdown;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAccountnameEdt() {
		return OrgNameEdt;
	}

	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void CreateOrgnization(String OrgName )
	{
		OrgNameEdt.sendKeys(OrgName);
		saveBtn.click();
	}
	public void CreateOrgnizationwithIndustry(String OrgName ,String industryType )
	{
		OrgNameEdt.sendKeys(OrgName);
		select(industrydropdown,industryType);
		saveBtn.click();
	}

	
		
	}
	


