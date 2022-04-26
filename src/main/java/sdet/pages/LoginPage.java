package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	//Element repository
	
	@FindBy(name="username")
	WebElement usernametext;
	
	@FindBy(name="password")
	WebElement passwordtext;
	
	@FindBy(css=".btn.btn-small")
	WebElement loginBtn;
	
	@FindBy(css = (".navbar-brand>.img-responsive"))
	WebElement logoImg;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUpLink;
	
	@FindBy(linkText = "Pricing")
	WebElement pricingLink;
	
	@FindBy(linkText = "Features")
	WebElement featuresLink;
	
	@FindBy(linkText = "Customers")
	WebElement customersLink;


	
  //Elements initilize
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
  //action
	public HomePage login(String username,String password) {
		usernametext.sendKeys(username);
	    passwordtext.sendKeys(password);
		loginBtn.click();
		return new HomePage();
		    
	}
	public boolean logo() {
		
		return logoImg.isDisplayed();
	}
	public void links() {
		signUpLink.isDisplayed();
	}
}
















