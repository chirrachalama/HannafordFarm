package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;
import com.nurture.PageObjects.Listings;


public class ListingsTest extends TestBase {
	
	

	@Test(priority=0,groups= {"Regression Test","Smoke Test"})
	public void List() throws InterruptedException {
		Listings LS = new Listings();
		LS.List();
	}


}
