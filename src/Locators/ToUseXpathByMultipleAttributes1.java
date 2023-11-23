package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByMultipleAttributes1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.dunzo.com/search");
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Mango");
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//p[text()='Mangosteen - Imported']/../..//button[text()='ADD']")).click();
	}

}
