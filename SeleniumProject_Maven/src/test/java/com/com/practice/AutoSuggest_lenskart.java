package com.com.practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest_lenskart {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");
		
		 driver.findElement(By.name("q")).click();
		
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class=\"trending_list menu-link\"]"));
		
		for(WebElement b:ele) {
			System.out.println(b.getText());
		
}
}
}