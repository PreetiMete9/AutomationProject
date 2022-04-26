package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class NewCompanyPage extends TestBase{
	
 @FindBy(id="company_name")
 WebElement companyName;
 
 @FindBy(name="industry")
 WebElement industryNamet;
 
 @FindBy(id="annual_revenue")
 WebElement annualAmmount;
 
 @FindBy(name="status")
 WebElement statusType;
 
 @FindBy(name="category")
 WebElement categoryType;
 
 @FindBy(name="priority")
 WebElement priorityType;
 
 @FindBy(name="source")
 WebElement sourceType;

 @FindBy(xpath="//*[@id=\"companyForm\"]/table/tbody/tr[1]/td/input")
 WebElement saveBtn;
 
 
 
 
 public NewCompanyPage() {
	 PageFactory.initElements(driver,this);
 }
 public void createCompany(String cn, String in, String status) {
	 
	 companyName.sendKeys("Wipro");
	 industryNamet.sendKeys("xyz");
	 //annualAmmount.sendKeys("75.0000c");
	 statusType.sendKeys("New");
	 saveBtn.click();
	 
	 
 }






}
