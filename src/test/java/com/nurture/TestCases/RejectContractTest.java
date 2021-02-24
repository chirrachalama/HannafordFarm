package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;

public class RejectContractTest extends TestBase {
	
	@Test(priority=0,dataProvider="BuyerAccount")
	public void LoginWithBuyerUser(String buyerEmail, String Password) throws InterruptedException {
		com.nurture.PageObjects.RejectContract SA = new com.nurture.PageObjects.RejectContract();
		SA.LoginWithBuyerUser(buyerEmail, Password);
	}
	
	@Test(priority=1)
	public void ContractShare() throws InterruptedException {
		com.nurture.PageObjects.RejectContract SA = new com.nurture.PageObjects.RejectContract();
		SA.sharecontract();
	}
	
	@Test(priority=2,dataProvider="SellerAccount")
	public void LoginWithSellerUser(String sellerEmail,String Password) throws InterruptedException {
		com.nurture.PageObjects.RejectContract SA = new com.nurture.PageObjects.RejectContract();
		SA.LoginWithSellerUser(sellerEmail,Password);
	}
	
	@Test(priority=3)
	public void RejectContract() throws InterruptedException {
		com.nurture.PageObjects.RejectContract SA = new com.nurture.PageObjects.RejectContract();
		SA.RejectContracts();
	}


}
