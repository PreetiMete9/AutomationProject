package sdet.testbase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewContactPage;
import sdet.util.ReadData;
import testbase.TestBase;

public class NewContactPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	NewContactPage newContactPage; 
	
	
	@BeforeMethod
	public void setUp() {
	    initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		newContactPage = homePage.createContact();
	}

    @DataProvider(name="testData3")
    public String[][] sendData() throws IOException {
    	String data[][]= ReadData.getData();
    	return data;
    }
    	
     @Test (dataProvider = "testData3")
    public void validateCreateContactTest(String firstName,String lastName,String company,String position,String department,String mobile,String email,String address) throws InterruptedException {
    	
    	newContactPage.createContact("Preeti","Mete","TCS","QA","Quality","9309813553","preetimete@gmail.com","pune");
    	Thread.sleep(5000);
    }


   @AfterMethod
   public void closeResources() {
	   driver.close();
   }









}



