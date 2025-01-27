package com.nurture.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nurture.Base.TestBase;

public class RegistrationTest extends TestBase {
	
@Test(priority=0,dataProvider="Registration",groups= {"Regression Test"})
	
	public void LoginWithNonRegister_GeneralDetails(String NonRegisterMail,String Pwd,
			String Name,String ShortBio,
			String businessname,String AEmail,String Phone,
			String abn,String ngr,
			String postalcode,String address,String town) throws InterruptedException, IOException {
		
	com.nurture.PageObjects.Registration Reg = new com.nurture.PageObjects.Registration();
		Reg.LoginWithNonRegister_GeneralDetails(NonRegisterMail,Pwd,
								Name,ShortBio,
								businessname,AEmail,Phone,
								abn, ngr,
								postalcode,address,town);
	
	}
	
	
	
	@Test(priority=1,dataProvider="StripeDetails",groups= {"Regression Test"})
	public void Registration_FinancialDetails(String Mail,String Name,String Abn,String address1,String address2,String city,String postcodee,String website) throws InterruptedException {
		
		com.nurture.PageObjects.Registration Reg = new com.nurture.PageObjects.Registration();
		Reg.Registration_FinancialDetails(Mail,Name,Abn,address1,address2,city,postcodee,website);
			
	}
	
	@Test(priority=2,groups= {"Regression Test"})
	public void Registration_TermsACondtions() throws InterruptedException {
		
		com.nurture.PageObjects.Registration Reg = new com.nurture.PageObjects.Registration();
		Reg.Registration_TermsACondtions();
			
	}
	
	@Test(priority=3,groups= {"Regression Test"})
	public void Registration_Complete() throws InterruptedException {
		com.nurture.PageObjects.Registration Reg = new com.nurture.PageObjects.Registration();
		Reg.Registration_Complete();
	}


}
