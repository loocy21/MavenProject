package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	public OrganizationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, null);
	}
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgnizationInfo;
	
	@FindBy(id="dtlview_Organization Name")
	private WebElement Industryinfo;

	public WebElement getOrgnizationInfo() {
		return orgnizationInfo;
	}

	public WebElement getIndustryinfo() {
		return Industryinfo;
	}
	
	public void getOrgnizationsinfo() {
		orgnizationInfo.getText();
		
	}
	public void getIndustriesinfo() {
		Industryinfo.getText();
		
	}
}
