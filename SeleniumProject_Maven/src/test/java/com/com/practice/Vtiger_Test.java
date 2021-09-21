package com.com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger_Test {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		 driver.findElement(By.linkText("Organizations")).click();
		 
		// System.out.println(driver.findElement(By.cssSelector(cssSelector)).
		 
		   String ele = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).getAttribute("title");
		  //Actions ele1 =new Actions(driver);
		  //ele1.moveToElement(ele).perform();
		   System.out.println(ele);
		  
		  
		  
		 
		 
		

}
}
