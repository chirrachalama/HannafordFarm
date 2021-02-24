package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;
import com.nurture.PageObjects.Profilepage;

public class ProfileTest extends TestBase{
	
	@Test(priority=0,groups= {"Regression Test", "Smoke Test"})
	public void Profile() throws InterruptedException {
		
		Profilepage pp = new Profilepage();
		pp.login();
		pp.verifyProfile();
	}


}
