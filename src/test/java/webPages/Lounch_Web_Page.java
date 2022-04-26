package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lounch_Web_Page {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
        
       driver.get("http://www.uitestpractice.com/Students/Actions");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.name("click"));
		
		Actions action = new Actions(driver);
		action.click(button).build().perform();
		Thread.sleep(2000);
        driver.quit();
	}

}
