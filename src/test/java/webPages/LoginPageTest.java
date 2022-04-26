package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void initilization()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void validateLoginTest1()    //valid username and valid passward
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement logoElement = driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		System.out.println(logoElement.isDisplayed());
		Assert.assertEquals(logoElement.isDisplayed(),true);
	}
	
	@Test
	public void validateLoginTest2()    //invalid username and valid passward
	{
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("preeti");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String errorMessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(errorMessage);
		Assert.assertEquals(errorMessage,"Invalid credentials");
		
	}
	@Test
	public void validateLoginTest3()    //valid username and invalid passward
	{
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("preeti");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String str3 = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(str3);
		Assert.assertEquals(str3,"Invalid credentials");
	}
	
	@Test
	public void validateLoginTest4()   //invalid username and invalid passward
	{
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("preeti");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("sweety");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String str4 = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(str4);
		Assert.assertEquals(str4,"Invalid credentials");
	}
	
	@Test
	public void validateLoginTest5()    //empty username and empty passward
	{
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String str5 = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(str5);
		Assert.assertEquals(str5,"Username cannot be empty");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	
	

}