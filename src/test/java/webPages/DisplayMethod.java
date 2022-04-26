package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayMethod {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");  //this is get method
		
		driver.manage().window().maximize();
        
		WebElement text = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        
		//System.out.println("Amazon display method:"+text.isDisplayed());
		
		System.out.println("Amazon Enabled method:"+text.isEnabled());
		
		Thread.sleep(2000);
		driver.close();
	}

}
