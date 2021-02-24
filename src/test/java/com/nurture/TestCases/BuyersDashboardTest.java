package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;
import com.nurture.PageObjects.BuyersDashboard;


public class BuyersDashboardTest extends TestBase {
	
	@Test(priority=0,groups= {"Regression Test","Smoke Test"})
	public void BuyerDashboard() throws InterruptedException {
		BuyersDashboard BD = new BuyersDashboard();
		BD.Buyersdashboard();
		
	}

}
