package com.crm.PurchaseOrderApproved;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.SelectApprovedObjectRpsitory.Select_ApprovedPage;
import com.crm.SelectApprovedObjectRpsitory.VtigerHomePage;
import com.crm.autodesk.Utils.BaseClass;


public class TC_06_CreateSubject extends BaseClass {
	@DataProvider
	
	public Object[][] getData() throws Throwable
	{
		return eLib.getxcelData("Sheet1");
	}
	@Test(dataProvider = "getData")
	public void CreateSubjectWithMultipleData(String Subject,String status) throws Throwable
	{
		//String Subject= eLib.getExcelData ("Sheet1",3,2) + jLib.getRandomNum();
		//String status = eLib.getExcelData("sheet1",3, 3);
		
		VtigerHomePage hp = new VtigerHomePage(driver);
		
		hp.mouseOver(driver,hp.getMorebtn());
		hp.getPurchasebtn().click();
		hp.mouseOver(driver, hp.getAdministratorimg());
		hp.getSignoutLnk().click();
		
		Select_ApprovedPage po= new Select_ApprovedPage(driver);
		po.getAddbtn().click();
		//po.writeSubject(Subject);
		//po.selectstatus(status);
		//po.getSavebtn().click();
		po.writeSubject(status);
		po.selectstatus(status);
		po.getSavebtn().click();
	
		
		
	}

}
