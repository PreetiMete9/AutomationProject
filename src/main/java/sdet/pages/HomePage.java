package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import sdet.util.Utility;
import testbase.TestBase;

public class HomePage extends TestBase {
	
	// Element repository
	
	@FindBy(css = ".fa.fa-sign-out.icon-2x")
	WebElement logOutLink;
	
	
	
	@FindBy(css = "[title='Companies']")
	WebElement companyLink;
	
	@FindBy(css = "[title='New Company']")
	WebElement createCompanyLink;
	
	@FindBy(css = "[title='Contacts']")
	WebElement contactLink;
	
	@FindBy(css = "[title='New Contact']")
	WebElement createContactLink;
	
	@FindBy(css= "[title='Tasks']")
	WebElement taskLink;
	
	@FindBy(css = "[title='New Task']")
	WebElement createTaskLink;
	
	 @FindBy(css="[title='Deals']")
	 WebElement dealLink;
	 
	 @FindBy(css="[title='New Deal']")
	 WebElement createDealLink;

    //Actions
    public void logOut() {
		driver.switchTo().frame("mainpanel");
		logOutLink.click();
	}
    
     public NewCompanyPage createCompany()  {
    	Utility.switchToFrameMainPanel();
    	Utility.mouseOverAction(companyLink);
    	createCompanyLink.click();
    	return new NewCompanyPage();
    }
	 
    
     public NewContactPage createContact()  {
    	Utility.switchToFrameMainPanel(); 
       	Utility.mouseOverAction(contactLink);
    	createContactLink.click();
    	return new NewContactPage();
     }
    
    public NewDealPage createDeal() {
    	Utility.switchToFrameMainPanel();
    	Utility.mouseOverAction(dealLink);
    	createDealLink.click();
    	return new NewDealPage();
    	
    	
    	
    }
	
	
	//initilization
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
}
