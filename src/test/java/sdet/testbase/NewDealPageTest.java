package sdet.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sdet.pages.HomePage;
import sdet.pages.LoginPage;
import sdet.pages.NewDealPage;
import testbase.TestBase;

public class NewDealPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewDealPage newDealPage;
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		newDealPage = homePage.createDeal();
	}
	
	@Test
	public void validateCreateDealTest() throws InterruptedException {
		newDealPage.createDeal("XYZ","Wipro");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}