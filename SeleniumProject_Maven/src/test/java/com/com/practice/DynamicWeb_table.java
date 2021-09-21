package com.com.practice;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.autodesk.Utils.JSONFileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;




public class DynamicWeb_table {

	public static void main(String[] args) throws Throwable {

		JSONFileUtility jsonLib=new JSONFileUtility();
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String URL = jsonLib.readDataFromJSON("url");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		//String BROWSER = jsonLib.readDataFromJSON("browser");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		 driver.findElement(By.linkText("Organizations")).click();
		 
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		 
		// for(int i=1;i<list.size();i++)
		 {
			//list.get(i).click();
		 

		}
	int count =  0;
	for(WebElement web:list) {
		System.out.println(web.getText());
	}
	driver.close();
	System.out.println("Count " +list.size());
		
	}
	

	}


