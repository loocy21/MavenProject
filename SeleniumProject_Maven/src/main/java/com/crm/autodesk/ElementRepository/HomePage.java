package com.crm.autodesk.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.Utils.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	WebDriver driver;
	public HomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText= "Organizations")
	private WebElement orgnizationLink;

	@FindBy(xpath= "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement administratorImg;
	
	@FindBy(linkText= "Sign Out")
	private WebElement signoutLnk;
	
	@FindBy(linkText= "Contacts")
	private WebElement contactLnk;
	
	@FindBy(linkText= "Leads")
	private WebElement LeadsLnk;
	
	@FindBy(linkText= "Opportunities")
	private WebElement oppertunitiesLnk;

	@FindBy(linkText= "Email")
	private WebElement emailLnk;

	@FindBy(linkText= "Products")
	private WebElement productLnk;

	public WebElement getOrgnizationLink() {
		return orgnizationLink;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignoutLnk() {
		return signoutLnk;
	}

	public WebElement getContactLnk() {
		return contactLnk;
	}

	public WebElement getLeadsLnk() {
		return LeadsLnk;
	}

	public WebElement getOppertunitiesLnk() {
		return oppertunitiesLnk;
	}

	public WebElement getEmailLnk() {
		return emailLnk;
	}

	public WebElement getProductLnk() {
		return productLnk;
	}
	public void clickOnOrgnization()
	
	{
		orgnizationLink.click();
		
	}
	public void clickOnContacts()
	{
		contactLnk.click();
		
	}
	public void SignOut(WebDriver driver)
	
	{
		
		mouseOver(driver,administratorImg);
		signoutLnk.click();
		
	}
	public void clickLeads()
	
	{
		LeadsLnk.click();
		
	}

	
	
}
