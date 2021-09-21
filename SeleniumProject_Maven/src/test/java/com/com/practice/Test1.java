package com.com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.amazon.in/");
		
		 WebElement button = driver.findElement(By.linkText("Fashion"));
		 System.out.println(button.getText());
		 wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		  
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		//sSystem.out.println(ele.getText());
		//ele.sendKeys("mobile");
		wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("mobile");

}
}
