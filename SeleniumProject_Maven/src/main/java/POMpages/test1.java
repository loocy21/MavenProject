package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.Utils.WebDriverUtility;

public class test1  extends WebDriverUtility{
	WebDriver driver;
	
	@FindBy(name="user_name")
	private WebElement usernmebtn;
	
	@FindBy(name="user_password")
	private WebElement paswdbtn;
	
	@FindBy(name="user_name")
	private WebElement clickbtn;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/menuDnArrow.gif\"]")
	private WebElement morebtn;
	
	@FindBy(linkText="Purchase Order")
	private WebElement purchasebtn;

	public WebElement getUsernmebtn() {
		return usernmebtn;
	}

	public WebElement getPaswdbtn() {
		return usernmebtn;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public WebElement getMorebtn() {
		return morebtn;
	}

	public WebElement getPurchasebtn() {
		return purchasebtn;
	}
	public test1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void Test1(String username,String password)
	{
		usernmebtn.sendKeys(username);
		usernmebtn.sendKeys(password);
		clickbtn.click();
	}
	public void more()
	{
		mouseOver(driver,morebtn);
		purchasebtn.click();
		
	}
		

	


}

