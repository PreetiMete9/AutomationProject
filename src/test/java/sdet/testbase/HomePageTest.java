package sdet.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.util.Utility;
import testbase.TestBase;

public class HomePageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test
	public void validateClickOnNewCompany() {
		Utility.switchToFrameMainPanel();
		homePage.createCompany();
	}
	
	@Test
	public void validateClickOnNewContact() {
		Utility.switchToFrameMainPanel();
		homePage.createContact();
	}
	
	@Test
	public void validateClickOnNewDeal() {
		Utility.switchToFrameMainPanel();
		homePage.createDeal();
	}
	@Test
	public void validateLogoutTest() {
		homePage.logOut();
	}
	
@AfterMethod
	public void closeResourecs() {
		driver.close();
	}
}
