package com.com.practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.ElementRepository.LoginPage;
import com.crm.autodesk.Utils.ExcelFileUtility;
import com.crm.autodesk.Utils.JSONFileUtility;
import com.crm.autodesk.Utils.WebDriverUtility;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPractice {
	
	WebDriver driver;
	@Test
	
	public void Login_page() throws Throwable {
		
	
	JSONFileUtility jsonLib = new JSONFileUtility();
	JSONFileUtility jLib= new JSONFileUtility();
	WebDriverUtility wLib = new WebDriverUtility();
	ExcelFileUtility Lib= new ExcelFileUtility();
	
	String URL= jsonLib.readDataFromJSON("url");
	//System.out.println(URL);
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
	driver.get(URL);{
	wLib.waitForPageLoad(driver);
	wLib.maximizeWindow(driver);
	
	LoginPage lp=new LoginPage(driver);
	lp.login(USERNAME,PASSWORD);
	
	System.out.println("login succesful");
	}
	}



}





	
	
	


