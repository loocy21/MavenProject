package com.crm.PurchaseOrderApproved;


import org.testng.annotations.Test;

import com.crm.SelectApprovedObjectRpsitory.Select_ApprovedPage;
import com.crm.SelectApprovedObjectRpsitory.VtigerHomePage;
import com.crm.autodesk.Utils.BaseClass;
import com.crm.autodesk.Utils.WebDriverUtility;



public class TC_01_SelectApproved extends BaseClass{

	@Test
	public void SelectApproved() throws Throwable {
	VtigerHomePage hp= new VtigerHomePage(driver);
	String Subject= eLib.getExcelData ("Sheet1",1,1) + jLib.getRandomNum();
	String status = eLib.getExcelData("sheet1",1, 2);
	
	hp.mouseOver(driver,hp.getMorebtn());
	hp.getPurchasebtn().click();
	//hp.mouseOver(driver, hp.getAdministratorimg());
	//hp.getSignoutLnk().click();
	
	Select_ApprovedPage po= new Select_ApprovedPage(driver);
	po.getAddbtn().click();
	//po.getWriteSubject().sendKeys(Subject);
	po.writeSubject(Subject);
	po.selectstatus(status);

	po.save();
	
	hp.mouseOver(driver, hp.getAdministratorimg());
	hp.getSignoutLnk().click();
    
	}
	//@Test
	//public void createOrgWithType()
	{
		//System.out.println("checking region regression Testing");
	}
}

