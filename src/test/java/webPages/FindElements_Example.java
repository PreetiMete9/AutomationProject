package webPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_Example {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");  //this is get method
		
		driver.manage().window().maximize();
		/*WebElement amazon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		amazon.sendKeys("moblie");
        
        WebElement amazon1 = driver.findElement(By.xpath("//div[@id='navFooter']//a"));
        System.out.println(amazon1.getText());
        
        WebElement amazon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox111']"));*/
		
		//This is findElements Method
		
		/*List<WebElement> amazon = driver.findElements(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println(amazon.size());*/
		
		List<WebElement> amazon = driver.findElements(By.xpath("//div[@id='navFooter']//a"));
        System.out.println(amazon.size());
        for(WebElement amazonlink: amazon)
        	//System.out.println(amazon1.getText());
        if(amazonlink.getText().equals("Instagram"))
        {
        amazonlink.click();
        }
		
        
        
        
	}

}
