package com.com.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;





public class RemoteExecution {
	@Test
	public void remoteExecutionTest() throws MalformedURLException  {
		
		
		URL url = new URL("http://192.168.76.31:4444/wd/hub");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("http://gmail.com");
		System.out.println("browser launched successfully");
		
	}

}
