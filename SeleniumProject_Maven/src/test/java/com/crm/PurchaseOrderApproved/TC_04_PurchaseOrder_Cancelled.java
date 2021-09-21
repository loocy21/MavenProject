package com.crm.PurchaseOrderApproved;

import org.testng.annotations.Test;

import com.crm.autodesk.Utils.BaseClass;
import com.crm.select_Delivered.ObjectRepos.Select_Delivered;
import com.crm.select_cancelled.ObjectRepo.HomePage;

	public class TC_04_PurchaseOrder_Cancelled extends BaseClass{
	
	@Test(groups="RegressionSuite")
	public void PurchaseOrder() throws Throwable {
	
	
	
	HomePage hp= new HomePage(driver);
	String Statusnam = eLib.getExcelData("Sheet1",1,5);
	hp.mouseOver(driver,hp.getMorebtn());
	hp.getPurchasebtn().click();
	
	Select_Delivered sc= new Select_Delivered(driver);
	sc.getAddbtn().click();
	sc.selectstatus(Statusnam);

	}
}
