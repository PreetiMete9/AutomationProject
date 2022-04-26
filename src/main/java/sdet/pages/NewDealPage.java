package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class NewDealPage extends TestBase {
	
	//Element repository
	@FindBy(id="title")
	WebElement titleType;
	
	@FindBy(xpath="//*[@id=\"prospectForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/input[3]")
	WebElement companyName;
	
	@FindBy(xpath="//*[@id=\"prospectForm\"]/table/tbody/tr[1]/td/input[1]")
	WebElement saveBtn;
	
	
	//initilization
	public NewDealPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	//Action And Method
	public void createDeal(String te,String cn) {
		titleType.sendKeys("XYZ");
		companyName.sendKeys("Wipro");
		saveBtn.click();
	}

}
