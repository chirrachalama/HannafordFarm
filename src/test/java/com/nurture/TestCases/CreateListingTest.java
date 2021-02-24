package com.nurture.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;


public class CreateListingTest extends TestBase{
	
	@Test(priority=0,dataProvider="ValidLogin")
	public void LoginWithRegisterUSer(String Email,String Password) throws InterruptedException {
	
		com.nurture.PageObjects.CreateListing CL = new com.nurture.PageObjects.CreateListing();
		CL.LoginWithRegisterUSer(Email, Password);
		
	}
	
	@Test(priority=1)
	public void NavtigateCreateListing() throws InterruptedException {
		com.nurture.PageObjects.CreateListing CL = new com.nurture.PageObjects.CreateListing();
		CL.NavigateCreateListManual();
	}
	
	@Test(priority=2,dataProvider="CreateListing")
	public void CreateList(String ListHead, String ListDesc,String seedQuantity,String MinQuantity,String SeedPrice,String Postcode,String Address,String Locality) throws IOException, InterruptedException {
		
		com.nurture.PageObjects.CreateListing CL = new com.nurture.PageObjects.CreateListing();
		CL.CreateListManual(ListHead, ListDesc, seedQuantity, MinQuantity, SeedPrice, Postcode, Address, Locality);
	}


}
