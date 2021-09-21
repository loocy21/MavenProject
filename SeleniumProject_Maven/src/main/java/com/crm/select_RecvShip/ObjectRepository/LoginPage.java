package com.crm.select_RecvShip.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.Utils.WebDriverUtility;

public class LoginPage extends  WebDriverUtility{
	

	
		
		WebDriver driver;
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(name="user_name")
		private WebElement userNameEdt;
		
		@FindBy(name="user_password")
		private WebElement passwordEdt;
		
		@FindBy(id="submitButton")
		private WebElement loginBtn;
		
		public WebElement getUserNameEdt() {
			return userNameEdt;
		}

		public WebElement getPasswordEdt() {
			return passwordEdt;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
	 
	
		 	}
		 






