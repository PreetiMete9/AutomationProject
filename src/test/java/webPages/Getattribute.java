package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getattribute {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  //this is get method
		
		driver.manage().window().maximize();
        
		WebElement value = driver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println("value of the attribute is:"+value.getAttribute("class"));
		
		driver.close();

	}

}
