package webPages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_Example {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://meesho.com/");
		
		/*List<WebElement> meesho = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println(meesho.size());
		
		List<WebElement> meesho = driver.findElements(By.xpath("//div[@class='Accordion__AccordionContentWrapper-sc-zncow4-3 jxYks']//a"));
	    
		for(WebElement meesho1: meesho)
		
			//System.out.println(meesho1.getText());
	    
	    if(meesho1.getText().equals("Ice Cream Scoops"))
	    {
	    	meesho1.click();
	    }*/
		
		List<WebElement> meesho = driver.findElements(By.xpath("//input[@type='text22']"));
		System.out.println(meesho.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement meesho = driver.findElement(By.xpath("//input[@type='text']"));
		meesho.sendKeys("beauty");
		
		WebElement meesho1 = driver.findElement(By.xpath("//div[@class='Accordion__AccordionContentWrapper-sc-zncow4-3 jxYks']//a"));
	    System.out.println(meesho1.getText());
	    
	    WebElement meesho = driver.findElement(By.xpath("//input[@type='text11']"));*/
	}

}
