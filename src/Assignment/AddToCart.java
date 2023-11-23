package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();

	}

}
