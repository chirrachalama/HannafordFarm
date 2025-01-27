package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;
import com.nurture.PageObjects.ManualLogin;

public class ManualLoginTest extends TestBase {
	
	@Test(priority=0, groups= {"Regression Test"})
	public void LoginWithBlank() {
	
		ManualLogin log=new ManualLogin();
		log.LoginWithBlank();
	}
	
	@Test(priority=1, dataProvider="InvalidLogin", groups= {"Smoke Test","Regression Test"})
	public void LoginWithInvalidData(String Email,String Password) throws InterruptedException {
	
		ManualLogin log=new ManualLogin();
		log.LoginWithNegativeData(Email, Password);
		
	}
	
	@Test(priority=2,dataProvider="ValidLogin", groups= {"Smoke Test","Regression Test"})
	public void LoginWithValidData(String Email,String Password) throws InterruptedException {
	
		ManualLogin log=new ManualLogin();
		log.LoginWithValidEmailAndValidPassword(Email, Password);
	}
	
	@Test(priority=3, groups= {"Smoke Test","Regression Test"})
	public void VerifyTheLogo() throws InterruptedException {
		ManualLogin log = new ManualLogin();
		log.VerifyTheLogo();
	}
	

}
