package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Alex");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Vecna");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
