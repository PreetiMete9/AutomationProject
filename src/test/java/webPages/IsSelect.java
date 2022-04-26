package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelect {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/practice/");  //this is get method
		
		driver.manage().window().maximize();
        
		WebElement radio = driver.findElement(By.xpath("//label[text()=' Radio1']"));
		
		WebElement radio1 = driver.findElement(By.xpath("//label[text()=' Radio2']"));
		
		System.out.println(radio.isSelected());
		
		System.out.println(radio1.isSelected());
		
		radio.click();
		
		System.out.println(radio.isSelected());
		
		
		
        
	}

}
