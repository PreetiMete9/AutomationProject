package sdet.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewCompanyPage;
import testbase.TestBase;

public class NewCompanyPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewCompanyPage newCompanyPage;
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		newCompanyPage = homePage.createCompany();
		
	}
	
	@Test
	public void validatecreateCompanyTest() throws InterruptedException {
		newCompanyPage.createCompany("Wipro","xyz","New");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
