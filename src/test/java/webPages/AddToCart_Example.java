package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart_Example {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/realme-9i-prism-black-64-gb/p/itm3e9987219f652?pid=MOBG9VGVYG2XHZGR&lid=LSTMOBG9VGVYG2XHZGRYBJYA7&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp3&fm=neo%2Fmerchandising&iid=fbab2628-6a07-4ade-b621-b7bb3c44950d.MOBG9VGVYG2XHZGR.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=r5g6wedkps0000001648011340490");
        driver.findElement(By.xpath("//span[contains(text(),'realme 9i (Prism Black, 64 GB)')]/../../../../../..//button[text()='ADD TO CART']")).click();
        
	}

}
