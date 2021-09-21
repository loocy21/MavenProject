package practice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo_actitimeTest {
	@Test
	public void demo() {
System.out.println("execute test" );
String URL=System.getProperty("url");
String USERNAME=System.getProperty("username");
String PASSWORD=System.getProperty("password");
String browser=System.getProperty("browserName");

System.out.println(URL);
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
driver.findElement(By.name("username")).sendKeys(USERNAME);
driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
driver.findElement(By.xpath("//div[text()='Login ']")).click();

driver.close();
}
}
	

	
	

