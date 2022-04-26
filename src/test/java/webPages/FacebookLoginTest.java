package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {
    WebDriver driver;
	@BeforeMethod
	public void initilization()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
    @Test
    public void validateLoginTest1()
    {
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9833084538");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9309813553");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	//String uid = driver.findElement(By.xpath("")).getText();
    }
    
   
    
   /* @Test
    public void validateLoginTest2()  //valid username and invalid password
    {
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9833084538");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9309813553");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	String str2 = driver.findElement(By.xpath("")).getText();
    	System.out.println(str2);
    	Assert.assertEquals("str2","","Element not Found");
    }
    @Test
    public void validateLoginTest3()   //invalid username and valid password
    {
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9833084538");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9309813553");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	String str3 = driver.findElement(By.xpath("")).getText();
    	System.out.println(str3);
    	Assert.assertEquals("str3","","Element not Found");
    }
    @Test
    public void validateLoginTest4()   //invalid username and invalid password
    {
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9833084538");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9309813553");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	String str4 = driver.findElement(By.xpath("")).getText();
    	System.out.println(str4);
    	Assert.assertEquals("str4","","Element not Found");
    }*/
    @Test
    public void validateLoginTest5()    //empty username and empty password
    {
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9833084538");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9309813553");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	String str4 = driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).getText();
    	System.out.println(str4);
    	Assert.assertEquals("Find your account and log in.","Find your account and log in");
    }
    @AfterMethod
    public void closeResources()
    {
    	driver.close();
    }
    
	}


