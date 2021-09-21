package com.com.practice;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.Utils.JSONFileUtility;



public class WebTable_data {
	WebDriver driver;
	@Test
	
	public void handlingDynamicWebtable() throws Throwable {
	
		
	
	JSONFileUtility jsonLib= new JSONFileUtility();
	//String BROWSER = jsonLib.readDataFromJSON("Browser");
	 
	 String URL = jsonLib.readDataFromJSON("url");
	 String BROWSER = jsonLib.readDataFromJSON("Browser");
	 
	 String USERNAME = jsonLib.readDataFromJSON("username");
	 String PASSWORD= jsonLib.readDataFromJSON("password");
	// String BROWSER = jsonLib.readDataFromJSON("Browser");
	 WebDriver driver = null;
	 
	
	
	 if(BROWSER.equalsIgnoreCase("chrome"))
	 {
		 driver = new ChromeDriver();
		 
	 }else if (BROWSER.equalsIgnoreCase("Firefox"))
	 {
		 driver = new FirefoxDriver();
	 }else {
		 driver = new InternetExplorerDriver();
		 
	 }
	 
	
	 
	
	 driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	 driver.findElement(By.id("submitButton")).click();
	 
	 driver.findElement(By.linkText("Organization")).click();
	 
	List<WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td/input[@name='selected_id']"));
	 
	// for(int i=1;i<list.size();i++)
	 {
		///list.get(i).click();
	 }
	 for(WebElement wb:list)
	 {
		 wb.click();
 }
	}
}

