package practice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fb_loginTest {
	@Test
	public void demo() {
		System.out.println("execute Test");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		String browser=System.getProperty("BrowserName");
		
		System.out.print(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(browser);
		
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else {
			System.out.println("Invalid browser");
			
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.name("pass")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginbutton")).click();

		driver.close();
		
		
		
		
	}

}
