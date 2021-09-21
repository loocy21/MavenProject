package com.crm.test1;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.LSUB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import com.crm.SelectCreated_ObjectRepo.VtigerHomePage;
import com.crm.autodesk.ElementRepository.LoginPage;
import com.crm.autodesk.Utils.ExcelFileUtility;
import com.crm.autodesk.Utils.JSONFileUtility;
import com.crm.autodesk.Utils.JavaUtility;
import com.crm.autodesk.Utils.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 extends WebDriverUtility{
	WebDriver driver;
	@Test
	public void test1() throws Throwable {
		
		JSONFileUtility jsonLib = new JSONFileUtility();
		JSONFileUtility jLib= new JSONFileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		ExcelFileUtility Lib= new ExcelFileUtility();
		

	
	String URL= jsonLib.readDataFromJSON("url");
	System.out.println(URL);
	String BROWSER= jsonLib.readDataFromJSON("browser");
	String USERNAME= jsonLib.readDataFromJSON("username");
	String PASSWORD= jsonLib.readDataFromJSON("password");
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
	
	//driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	wLib.waitForPageLoad(driver);
	wLib.maximizeWindow(driver);
	driver.get(URL);
	
	LoginPage vt= new LoginPage(driver);
	vt.login(USERNAME,PASSWORD);
	
	
	
	
	VtigerHomePage hp= new VtigerHomePage(driver);
	hp.mouseOver(driver,hp.getMorebtn());
	
	hp.getPurchasebtn();
	

}
}
