package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remove_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/viewcart?otracker=PP_GoToCart");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9309813553");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mayur@1435" + Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Longwalk Combo Pack of 3 Casual')]/../../../..//div[text()='Remove']")).click();
        //Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
	}
	

}
