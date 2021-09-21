package com.crm.PurchaseOrderApproved;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import com.crm.SelectCreated_ObjectRepo.Select_Created;
import com.crm.SelectCreated_ObjectRepo.VtigerHomePage;
import com.crm.autodesk.Utils.BaseClass;

import junit.framework.Assert;

//@Listeners(com.crm.autodesk.Utils.ListnerS.class)


public class TC_02_PurchaseOrder_created extends BaseClass{
	@Test(groups="SmokeSuite")
	
	

	
	public void PurchaseOrder_created() throws Throwable {
		VtigerHomePage hp= new VtigerHomePage(driver);
		String StatusNum =eLib.getExcelData("Sheet1",1,4);
		hp.mouseOver(driver,hp.getMorebtn());
		hp.getPurchasebtn().click();
	
		Select_Created sc= new Select_Created(driver);
		sc.getAddbtn().click();
		sc.selectstatus(StatusNum);
		Assert.assertEquals(false, true);
	
		

	

}
}
