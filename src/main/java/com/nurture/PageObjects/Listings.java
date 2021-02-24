package com.nurture.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nurture.Base.TestBase;

public class Listings extends TestBase {
	
	public Listings()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(name="username")
	WebElement EnterEmail;
	
	@FindBy(id="password")
	WebElement EnterPassword;
	
	@FindBy(name="login")
	WebElement ClickOnLogin;
	
	
	@FindBy(xpath="(//img[@class='align-self-center itemImage'])[1]")
	public WebElement list;
	
	@FindBy(xpath="//span[text()='DESCRIPTION']")
	public WebElement Listingheader;
	
	@FindBy(xpath="//div[@class='seed-details-header']")
	public WebElement headline;
	
	
	public void List() throws InterruptedException
	{
		ClickOnSignin.click();
		EnterEmail.sendKeys("nurturefarmtest1@gmail.com");
		Thread.sleep(2000);
		EnterPassword.sendKeys("Nurture@11");
		Thread.sleep(2000);
		ClickOnLogin.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		list.click();
		Thread.sleep(4000);
		String Listing=Listingheader.getText();
		Thread.sleep(2000);
		if(Listing.equalsIgnoreCase("DESCRIPTION"))
		{
			System.out.println("User is in Respective listing page");
		}
		else
		{
			System.out.println("User is not in desired page");
		}
	}
	

}
