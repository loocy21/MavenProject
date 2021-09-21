package com.com.practice;


import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.Utils.JSONFileUtility;

public class RemoteExecutable2 {

		@Test
		public void remoteExecutionTest() throws Throwable  {
			JSONFileUtility jLib = new JSONFileUtility();
			String BROWSER =jLib.readDataFromJSON("browser");
			
			URL url = new URL("http://192.168.76.31:4444/wd/hub");
			DesiredCapabilities cap =new DesiredCapabilities();
			
			if(BROWSER.equals("chrome"))
			{
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
			else if(BROWSER.equals("firefox"))
			{
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
			else {
				System.out.println("invalid browser");
			}
			
			RemoteWebDriver driver = new RemoteWebDriver(url,cap);
			driver.get("http://gmail.com");
			System.out.println("browser launched successfully");
			
		}

}
