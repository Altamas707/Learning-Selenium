package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[placeholder='username']")).sendKeys("Altamas");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Khan@12");
	}
}
