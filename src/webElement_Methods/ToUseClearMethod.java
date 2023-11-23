package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Altamas");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Altamas");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")).submit();

	}

}
