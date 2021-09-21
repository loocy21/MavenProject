package com.com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTES {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile under 15000");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[4]")).click();
	 String value	= driver.findElement(By.xpath("//span[@class=\"a-price-whole\"]")).getText();
	System.out.println("Stringvalue " + value);
	 //String value1 = value.replace(", ", "");
	 //int intPrice = Integer.parseInt(value1);
	 //System.out.println("intprice "+ intPrice);
	 //System.out.println(intPrice < 15000 ? "Below 15k ": "Not Below 15K");
	 //driver.close();
	 

}
}
