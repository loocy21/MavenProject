package com.com.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadFromXML {
  
	@Test
	public void ReadDataFromXML(XmlTest xmlObj)
	{
		System.out.println(xmlObj.getParameter("browser"));
		System.out.println(xmlObj.getParameter("url"));
	}
}
 