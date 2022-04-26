package sdet.testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		loginPage = new LoginPage();
	}
	@Test
	public void  validateLogoTest() {
		boolean value = loginPage.logo();
		Assert.assertEquals(value,true);
	}
	
	@Test
	public void validateLoginTest()
	{
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		String title = driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title,prop.getProperty("crmproTitle"));
	}
	@Test
	public void validateLoginTeat1()
	{
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		WebElement str = driver.findElement(By.id(""));
		System.out.println(str);
		//Assert.assertEquals(title1,"Please Enter valid password");
		
	}
	@Test
	public void validateLinkTest() {
		loginPage.links();
	}
	
	
	@AfterMethod
	public void closeResources()
	{
		driver.close();
	}

}
