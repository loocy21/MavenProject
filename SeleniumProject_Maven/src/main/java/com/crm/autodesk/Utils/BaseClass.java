package com.crm.autodesk.Utils;





import java.io.File;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * this class cointains all the basic configration annotations

 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.autodesk.ElementRepository.HomePage;
import com.crm.autodesk.ElementRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public DataBaseUtility dbLib = new DataBaseUtility();
	public JSONFileUtility jsonLib = new JSONFileUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public ExcelFileUtility eLib = new ExcelFileUtility();
	public JavaUtility jLib = new JavaUtility();
	public   WebDriver driver;
	public static WebDriver staticdriver;
	
	
	@BeforeSuite//(groups= {"SmokeSuite","RegressionSuite"})
	public void ConnectDB() {
		WebDriverManager.chromedriver().setup();
		System.out.println("====MakingDBConnection=====");
	}
	//@Parameters("Browser")
	@BeforeClass//(groups= {"SmokeSuite","RegressionSuite"})
	public void launchBrowser() throws Throwable
	{
		System.out.println("====launchBrowser=====");
		 String BROWSER  =jsonLib.readDataFromJSON("browser");
		 String URL  =jsonLib.readDataFromJSON("url");
		
		
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
			System.out.println("Invalid Browser");
		}
		
		wLib.maximizeWindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
		staticdriver = driver;
	}
	@BeforeMethod//(groups= {"SmokeSuite","RegressionSuite"})
	public void LoginToApp() throws Throwable
	{
		System.out.println("====LoginToApp===");
		
		String USERNAME= jsonLib.readDataFromJSON("username");
		String PASSWORD= jsonLib.readDataFromJSON("password");
		LoginPage lp= new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
	}
	@AfterMethod//(groups= {"SmokeSuite","RegressionSuite"})
	public void logoutToApp()
	{
		System.out.println("====logoutToApp====");
		HomePage hp = new HomePage(driver);
		hp.SignOut(driver);
	
	}
	@AfterClass//(groups= {"SmokeSuite","RegressionSuite"})
	public void closeBrowser()
	{
		System.out.println("=====closeBrowser====");
		driver.close();
	}
	@AfterSuite//(groups= {"SmokeSuite","RegressionSuite"})
	public void closeDB()
	{
		System.out.println("====closeDB====");
	}
	public String getscreenshot(String name) throws IOException 
	{
		File srcfile = ((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		String  destfile = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
	
		File finaldest= new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		
		return destfile;
		
		
	}
		
		
	}


