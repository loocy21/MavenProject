package com.crm.autodesk.ContactsTests;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.Utils.ExcelFileUtility;
import com.crm.autodesk.Utils.JSONFileUtility;
import com.crm.autodesk.Utils.WebDriverUtility;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_CreateContactWithOrgnizationTest {
	WebDriver driver;
	@Test
	
	public void createcontactWithorgnization() throws Throwable
	{
		//read all the nessasary data
		JSONFileUtility jsonLib = new JSONFileUtility();
		JSONFileUtility jLib= new JSONFileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		ExcelFileUtility Lib= new ExcelFileUtility();
		
		String URL= jsonLib.readDataFromJSON("url");
		System.out.println(URL);
		String BROWSER= jsonLib.readDataFromJSON("browser");
		String USERNAME= jsonLib.readDataFromJSON("username");
		String PASSWORD= jsonLib.readDataFromJSON("password");
		
		
		String ContactName= Lib.getExcelData ("Sheet1",1,2);
		String OrgName= Lib.getExcelData ("Sheet1",1,3);
		WebDriverManager.chromedriver().setup();
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		wLib.waitForPageLoad(driver);
		wLib.maximizeWindow(driver);
		//driver.get(URL);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//click on contacts
		driver.findElement(By.linkText("Contacts")).click();
		//click on create contact link
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//create contact
		driver.findElement(By.name("lastname")).sendKeys(ContactName);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		//switch to child window
		wLib.switchToWindow(driver, "Accounts");
		driver.findElement(By.id("search_txt")).sendKeys(OrgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.linkText("abc1")).click();
		//switch back to parent window
		wLib.switchToWindow(driver, "EditView");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//logout
		 WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOver(driver, ele);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
					
		
		
}
			
	}


