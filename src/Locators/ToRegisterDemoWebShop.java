package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		d.findElement(By.name("Gender")).click();
		Thread.sleep(2000);
		d.findElement(By.name("FirstName")).sendKeys("Altamas");
		Thread.sleep(2000);
		d.findElement(By.name("LastName")).sendKeys("Khan");
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys("Khan.Altamas@207.com");
		Thread.sleep(2000);
		d.findElement(By.id("Password")).sendKeys("Batman*01");
		Thread.sleep(2000);
		d.findElement(By.id("ConfirmPassword")).sendKeys("Batman*01");
		Thread.sleep(2000);
		d.findElement(By.id("register-button")).click();

	}

}
