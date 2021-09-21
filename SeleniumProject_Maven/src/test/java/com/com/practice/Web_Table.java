package com.com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Web_Table {
	@Test
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@data-testid=\"menu\"]")).click();
		 WebElement a = driver.findElement(By.linkText("Settings"));
		Actions a1	= new Actions(driver);
		a1.moveToElement(a).perform();
		
		driver.findElement(By.xpath("//div[@class=\"_36Lzk\"]")).click();
		
		
	}
}