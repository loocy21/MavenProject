package com.crm.autodesk.ContactsTests;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.autodesk.Utils.ExcelFileUtility;
import com.crm.autodesk.Utils.JSONFileUtility;
import com.crm.autodesk.Utils.WebDriverUtility;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_Search_Dropdown {
	private static final WebElement WebElement = null;
	WebDriver driver;
	@Test
	
	public void createcontactWithorgnization() throws Throwable
	{
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
		wLib.waitForPageLoad(driver);
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		wLib.waitForPageLoad(driver);
		wLib.maximizeWindow(driver);
		
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("shoo",Keys.ENTER);
		
		WebElement ele = driver.findElement(By.name("industry"));
		
		
		Select s =new Select(ele);
		
		s.selectByIndex(8);
		s.selectByVisibleText("Education");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		
		 WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			wLib.mouseOver(driver, ele1);
			driver.findElement(By.linkText("Sign Out")).click();
		
		driver.close();
		
		
	

}
}
