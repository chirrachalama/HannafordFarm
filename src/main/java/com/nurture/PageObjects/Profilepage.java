package com.nurture.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nurture.Base.TestBase;

public class Profilepage extends TestBase {
	
	public Profilepage()
	{
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//a[@data-toggle='dropdown']//img[1]")
	public WebElement Profiledropdown;


	@FindBy(xpath="//div[@class='dropdown-menu']//a[1]")
	public WebElement Profile;

	@FindBy(xpath="(//span[text()='Your Full Name']/following-sibling::div)[1]")
	public WebElement profilename;

	
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(name="username")
	WebElement EnterEmail;
	
	@FindBy(id="password")
	WebElement EnterPassword;
	
	@FindBy(name="login")
	WebElement ClickOnLogin;
	
	public void login() {
		ClickOnSignin.click();
		EnterEmail.sendKeys("nurturefarmtest11@gmail.com");
		EnterPassword.sendKeys("Nurture@111");
		ClickOnLogin.click();
	}

	public void verifyProfile() throws InterruptedException
	{
		Profiledropdown.click();
		Thread.sleep(3000);
		Profile.click();
		Thread.sleep(2000);
		String ProfileName=profilename.getText();
		if(ProfileName.equalsIgnoreCase("David S")) 
		{
			System.out.println("User is in Profile Screen");
		}
		else
		{
			System.out.println("user is not in Profile Screen");
		}
		
	}


}
