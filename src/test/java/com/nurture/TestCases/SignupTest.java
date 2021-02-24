package com.nurture.TestCases;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;
import com.nurture.PageObjects.Signup;

public class SignupTest extends TestBase{
	
	@Test(priority=0,dataProvider="ValidSignup", groups= {"Regression Test", "Smoke Test"})
	public void ValidSignupDetails(String Firstname,String LastName,String password,String Confirmpassword, String EmailID) throws InterruptedException {
		
		Signup sig=new Signup();
		sig.Validsignup(Firstname, LastName, password, Confirmpassword, EmailID);
		
	}
	
	@Test(priority=1,dataProvider="InvalidSignup",groups= {"Regression Test", "Smoke Test"})
	public void InvalidSignup(String Firstname,String LastName,String password,String Confirmpassword, String EmailID) throws InterruptedException	{
		Signup sig=new Signup();
		sig.InvalidSignup(Firstname, LastName, password, Confirmpassword, EmailID);
	}

}
