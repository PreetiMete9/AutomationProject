package webPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Example {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
		/*WebElement bigbasket = driver.findElement(By.xpath("//input[@id='input']"));
		bigbasket.sendKeys("amul");
		
		WebElement bigbasket1 = driver.findElement(By.xpath("//div[@class='container footer-links']//a"));
		System.out.println(bigbasket1.getText());
		
		WebElement bigbasket = driver.findElement(By.xpath("//input[@id='input123']"));
		
		WebElement bigbasket = driver.findElement(By.xpath("//input[@id='input123']"));
		
		
		List<WebElement> bigbasket = driver.findElements(By.xpath("//input[@id='input']"));
		System.out.println(bigbasket.size());
		
		List<WebElement> bigbasket = driver.findElements(By.xpath("//div[@class='container footer-links']//a"));
		for(WebElement bigbasket1: bigbasket)
		//System.out.println(bigbasket1.getText());
		if(bigbasket1.getText().equals("Green bigbasket"))
		{
			bigbasket1.click();
		}*/
		
		List<WebElement> bigbasket = driver.findElements(By.xpath("//input[@id='input123']"));
		System.out.println(bigbasket.size());
		
		
		
		
		
		

	}

}
