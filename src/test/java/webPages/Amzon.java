package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzon {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");  //this is get method
		
		driver.manage().window().maximize();
        
		System.out.println("The titleof page is:"+driver.getTitle());  // this is getTitle method
		
		System.out.println("The url of page is:"+driver.getCurrentUrl());  //this is getCurrentUrl method
	    
		System.out.println("This is a pagesource of amazon:"+driver.getPageSource()); //This is PageSource method
		
		driver.close();
		
		driver.quit();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.flipkart.com/");
		
		//System.out.println("The title of  this page is:"+driver.getTitle());
		
		//System.out.println("The  Current url of this page is:"+driver.getCurrentUrl());
		
		//driver.quit();
	
	}

}
