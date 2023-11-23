package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	
		WebElement ele = driver.findElement(By.xpath("//span[@role='button']"));
		if(ele.isEnabled()) {
			ele.click();		
		}
		else {		
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(price);

	}

}
