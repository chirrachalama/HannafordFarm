package com.nurture.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nurture.Base.TestBase;

public class DeleteListing extends TestBase {
	
	public DeleteListing() {
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
	
	@FindBy(xpath="//a[@data-toggle='dropdown']//img[1]")
	public WebElement Profiledropdown;

	@FindBy(xpath="//div[@class='dropdown-menu']//a[1]")
	public WebElement Profile;

	@FindBy(id="others-tab")
	WebElement HowotherSeeyou;
	
	@FindBy(xpath="(//span[text()='LG Master Super Bremer Seeds'])[1]")
	public WebElement SelectList;
	
	@FindBy(xpath="//img[@alt='delete']")
	public WebElement ClickOnDeleteButton;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement ClickOnDelete;
	
	@FindBy(xpath="//p[text()='Listing Deleted Successfully']")
	public WebElement ListDelete;
	
	@FindBy(xpath="//p[text()='Go to dashboard']")
	public WebElement GotoDashboard;
	
public void LoginWithListingUSer(String Email,String Password) throws InterruptedException {
		
		ClickOnSignin.click();
		Thread.sleep(2000);
		EnterEmail.sendKeys(Email);
		Thread.sleep(2000);
		EnterPassword.sendKeys(Password);
		Thread.sleep(1000);
		ClickOnLogin.click();
		Thread.sleep(3000);		
}
public void DeleteTheList() throws InterruptedException	{
	Profiledropdown.click();
	Thread.sleep(2000);
	Profile.click();
	Thread.sleep(2000);
	HowotherSeeyou.click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(3000);
	
	String List=SelectList.getText();
	Thread.sleep(2000);
	if(List.equalsIgnoreCase("LG Master Super Bremer Seeds")) 
	{
		SelectList.click();
		System.out.println("user selected parcticular List");
	}
	else
	{
		System.out.println("user not selected parcticular List");
	}
	
	Thread.sleep(2000);
	ClickOnDeleteButton.click();
	Thread.sleep(4000);
	ClickOnDelete.click();
	Thread.sleep(3000);
	String deleteList=ListDelete.getText();
	if(deleteList.equalsIgnoreCase("Listing Deleted Successfully")) 
	{
		System.out.println("List Deleted Sucessfully");
	}
	else
	{
		System.out.println("List not Deleted");
	}
	Thread.sleep(2000);
	GotoDashboard.click();
	Thread.sleep(3000);
	
	
	
	
}


}
