package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick_Example {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.uitestpractice.com/Students/Actions");
		 
		 WebElement button = driver.findElement(By.name("dblClick"));
		 Actions action = new Actions(driver);
		 action.doubleClick(button).build().perform();
		 Thread.sleep(2000);
		 driver.quit();
		 
	}

}
