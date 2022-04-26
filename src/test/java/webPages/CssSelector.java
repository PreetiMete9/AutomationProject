package webPages;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		
		WebElement button = driver.findElement(By.cssSelector("[name='click']"));
		Actions act = new Actions(driver);
		act.click(button).build().perform();
		//Thread.sleep(4000);
		//driver.quit();
		
		

	}

}
