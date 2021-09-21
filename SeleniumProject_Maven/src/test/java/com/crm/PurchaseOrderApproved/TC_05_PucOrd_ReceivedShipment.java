package com.crm.PurchaseOrderApproved;


import org.testng.annotations.Test;

import com.crm.autodesk.Utils.BaseClass;
import com.crm.select_RecvShip.ObjectRepository.HomePage;
import com.crm.select_RecvShip.ObjectRepository.Select_RecievedShipment;




public class TC_05_PucOrd_ReceivedShipment extends BaseClass{
	@Test(groups="RegressionSuite")
	public void PucOrd_ReceivedShipment() throws Throwable {
	
		HomePage hp= new HomePage(driver);
		String Status = eLib.getExcelData("Sheet1",1,6);
		
		
		
		hp.mouseOver(driver,hp.getMorebtn());
		hp.getPurchasebtn().click();
		
		Select_RecievedShipment po= new Select_RecievedShipment(driver);
		po.getAddbtn().click();
		po.selectstatus(Status);
	    
	
	}

}
