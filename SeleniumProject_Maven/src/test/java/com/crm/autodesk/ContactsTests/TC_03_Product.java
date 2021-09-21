package com.crm.autodesk.ContactsTests;

import java.util.List;



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

public class TC_03_Product {
	WebDriver driver;
	@Test
	
	public void checkpr0duct() throws Throwable
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
		
		String PRODUCTNAME = jsonLib.readDataFromJSON("productname");
		String PARTNUM= jsonLib.readDataFromJSON("partnumber");
		
		//String productName= Lib.getExcelData ("Sheet2",1,2);
		//String Partnumber= Lib.getExcelData ("Sheet2",1,3);
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
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(URL);
		wLib.waitForPageLoad(driver);
		wLib.maximizeWindow(driver);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
		driver.findElement(By.name("productname")).sendKeys(PRODUCTNAME);
		driver.findElement(By.id("productcode")).sendKeys(PARTNUM);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.name("search_text")).click();
		
		driver.findElement(By.xpath("//table[@class='searchUIBasic small']/tbody/tr[1]/td[3]/input[@name='search_text']")).sendKeys(PARTNUM);
		 WebElement ele = driver.findElement(By.xpath("//select[@name='search_field']"));
		 
		ele.click();
		wLib.select(ele, 2);
		driver.findElement(By.name("submit")).click();
		
		  List<WebElement> ele1 = driver.findElements(By.xpath("//table[@class=\"lvt small\"]/tbody/tr[*]/td[4]/span[@vtmodule='Products']"));
		 int Count =0;
		 for(int i=1;i<ele1.size();i++) {
			 for(WebElement web:ele1) {
				 System.out.println(web.getSize());
			 }
			 System.out.println("Count " + ele1.size());
			 
		 }
		
		
		
		

		
		
	
}
}
