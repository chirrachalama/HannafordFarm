package com.nurture.PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nurture.Base.TestBase;

public class CreateListing extends TestBase {
	
	public CreateListing() {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(id="profile-tab")
WebElement ClickOnActivity;

@FindBy(xpath="//div[text()=' + Create New Listing']")
public WebElement CreateNewListing;

@FindBy(xpath="//input[@id='headline']")
WebElement ListingHeadLine;

@FindBy(xpath="//input[@id='description']")
WebElement ListDescription;

@FindBy(xpath="//label[text()='Same as business location']")
WebElement SameAsBusinessLocation;

@FindBy(xpath="//input[@placeholder='ex. 5024']")
WebElement PostCode;

@FindBy(xpath="//input[@placeholder='ex. 200 Broadway Av']")
WebElement yourAddress;

@FindBy(xpath="//input[@placeholder='ex. New Canberra']")
WebElement LocalityTown;

@FindBy(xpath="(//div[@class=' css-1hwfws3'])[1]")
WebElement PickupState;

@FindBy(xpath="//*[text()='Queensland']")
WebElement selectstate;

@FindBy(xpath="//button[text()='Next']")
WebElement Next;

@FindBy(xpath="(//div[@class=' css-1hwfws3'])[1]")
WebElement CropCategory;

@FindBy(xpath="//*[text()='Field Pea']")
WebElement SelectCrop;

@FindBy(xpath="(//div[@class=' css-1hwfws3'])[2]")
WebElement Variety;

@FindBy(xpath="//*[text()='Helena']")
WebElement SelectVariety;


@FindBy(xpath="//input[@step='1']")
WebElement AvailableQuality;

@FindBy(xpath="(//input[@id='state'])[2]")
WebElement MinimumQuality;

@FindBy(xpath="(//input[@id='state'])[3]")
WebElement Price;

@FindBy(xpath="//div[@class=' css-1hwfws3']")
WebElement Season;

@FindBy(xpath="//*[text()='2021']")
WebElement SelectSeason;

@FindBy(xpath="//div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[8]/div[1]/div[1]/label[1]/i[1]")
WebElement UploadSeedImages;

@FindBy(xpath="//button[text()='Preview Listing']")
WebElement PreviewListing;

@FindBy(xpath="//label[@for='checkmark']//span[1]")
WebElement CheckTandC;

@FindBy(xpath="//button[text()='Create Listing']")
WebElement CreatListing;

@FindBy(xpath="//button[text()='View Dashboard']")
WebElement ViewDashboard;

@FindBy(xpath="//button[text()='Sign In']")
WebElement ClickOnSignin;

@FindBy(name="username")
WebElement EnterEmail;

@FindBy(id="password")
WebElement EnterPassword;

@FindBy(name="login")
WebElement ClickOnLogin;


public void LoginWithRegisterUSer(String Email,String Password) throws InterruptedException {
	
	ClickOnSignin.click();
	Thread.sleep(2000);
	EnterEmail.sendKeys(Email);
	Thread.sleep(2000);
	EnterPassword.sendKeys(Password);
	Thread.sleep(1000);
	ClickOnLogin.click();
	Thread.sleep(3000);
	
}
public void NavigateCreateListManual() throws InterruptedException {
ClickOnActivity.click();
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,700)");
Thread.sleep(3000);
CreateNewListing.click();
Thread.sleep(3000);
}

public void CreateListManual(String ListHead, String ListDesc,String seedQuantity,String MinQuantity,String SeedPrice,String Postcode,String Address,String Locality) throws IOException, InterruptedException 
{
	
	ListingHeadLine.sendKeys(ListHead);
	Thread.sleep(3000);
	ListDescription.click();
	Thread.sleep(2000);
	ListDescription.sendKeys(ListDesc);
	Thread.sleep(3000);
//	SameAsBusinessLocation.click();
//	Thread.sleep(2000);
//	SameAsBusinessLocation.click();
//	Thread.sleep(2000);
//	PostCode.clear();
//	Thread.sleep(2000);
	PostCode.sendKeys(Postcode);
	Thread.sleep(2000);
//	yourAddress.clear();
//	Thread.sleep(2000);
	yourAddress.sendKeys(Address);
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	Thread.sleep(3000);
//	LocalityTown.clear();
//	Thread.sleep(2000);
	LocalityTown.sendKeys(Locality);
	Thread.sleep(3000);
	PickupState.click();
	Thread.sleep(3000);
	selectstate.click();
	Thread.sleep(3000);
	Next.click();
	Thread.sleep(3000);
	
	CropCategory.click();
	Thread.sleep(2000);
	SelectCrop.click();
	Thread.sleep(3000);
	Variety.click();
	Thread.sleep(3000);
	SelectVariety.click();
	Thread.sleep(3000);

	js.executeScript("window.scrollBy(0,800)");
	Thread.sleep(3000);
	Next.click();
	Thread.sleep(3000);
	
	AvailableQuality.sendKeys(seedQuantity);
	Thread.sleep(3000);
	MinimumQuality.sendKeys(MinQuantity);
	Thread.sleep(3000);
	Price.sendKeys(SeedPrice);
	Thread.sleep(4000);
	Season.click();
	Thread.sleep(3000);
	SelectSeason.click();
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	
	//UploadSeedImages.click();
	//Runtime.getRuntime().exec("C:\\Users\\CHALAMA\\Desktop\\Nature Farming\\Autoit-Upload Documents\\Upload.exe");
	//Thread.sleep(2000);
	PreviewListing.click();	
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,800)");
	Thread.sleep(3000);
	CheckTandC.click();
	Thread.sleep(4000);
	CreatListing.click();
	Thread.sleep(3000);
	ViewDashboard.click();
	Thread.sleep(3000);   
	
 }

}



 


