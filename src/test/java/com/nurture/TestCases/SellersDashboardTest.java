package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;
import com.nurture.PageObjects.SellersDashboard;


public class SellersDashboardTest extends TestBase {
	
	@Test(priority=0, groups= {"Regression Test","Smoke Test"})
	public void SellerDashboard() throws InterruptedException {
		SellersDashboard SD = new SellersDashboard();
		SD.sellerDashboard();
	}

}
