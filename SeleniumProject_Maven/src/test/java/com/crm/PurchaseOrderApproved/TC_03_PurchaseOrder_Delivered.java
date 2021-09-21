package com.crm.PurchaseOrderApproved;

import org.testng.annotations.Test;
import com.crm.autodesk.Utils.BaseClass;
import com.crm.select_Delivered.ObjectRepos.HomePage;
import com.crm.select_Delivered.ObjectRepos.Select_Delivered;

import junit.framework.Assert;

public class TC_03_PurchaseOrder_Delivered extends BaseClass  {
	@Test(groups="RegressionSuite",retryAnalyzer=com.crm.autodesk.Utils.RetryAnalyzer.class)
	public void PurchaseOrder_Delivered() throws Throwable {
	
	HomePage hp= new HomePage(driver);
	String Statusname = eLib.getExcelData("sheet1", 1,5);
	
	hp.mouseOver(driver,hp.getMorebtn());
	hp.getPurchasebtn().click();
	
	Select_Delivered sd= new Select_Delivered(driver);
	sd.getAddbtn().click();
	sd.selectstatus(Statusname);
	Assert.assertEquals(false, true);
	
	
	


	

}
}
