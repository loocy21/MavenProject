package com.com.practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {
	@Test
	public String getscreenshot(String name) throws IOException {
		
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
	
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String  destfile = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
	
		File finaldest= new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		
		return destfile;
		
		

}
}
