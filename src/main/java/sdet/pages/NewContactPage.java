package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class NewContactPage extends TestBase {

	//Element repository
	//@FindBy(name= "title")
	//WebElement  titleText;

	@FindBy(id="first_name")
	WebElement firstName;

	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[2]/input[3")
	WebElement companyName;
	
	@FindBy(id="company_position")
	WebElement positionName;
	
	@FindBy(id="department")
	WebElement departmentType;
	
	@FindBy(id="mobile")
	WebElement mobileNo;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"contactForm\"]/table/tbody/tr[3]/td/fieldset/table/tbody/tr/td/table/tbody/tr[4]/td[2]/textarea")
	WebElement addressType;

	@FindBy(xpath ="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	
	//initilization
	public NewContactPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	//Action and Method
	public void createContact(String fristName,String lastName,String company,String position,String department,String mobile,String email,String address) {
		//titleText.sendKeys("miss");
		firstName.sendKeys(fristName);
		lastname.sendKeys(lastName);
		companyName.sendKeys(company);
		positionName.sendKeys(position);
		departmentType.sendKeys(department);
		mobileNo.sendKeys(mobile);
		emailid.sendKeys(email);
		addressType.sendKeys(address);
		
		saveBtn.click();
	}
	
	
	

}
