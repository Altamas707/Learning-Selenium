package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		System.out.println("Before enterning username and Password");
		WebElement LoginButton = driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());
		System.out.println("=================================");
		System.out.println("After entering username and Password");
		driver.findElement(By.name("username")).sendKeys("Altamas.khan");
		driver.findElement(By.name("password")).sendKeys("Khan@15");
		System.out.println(LoginButton.isDisplayed());
		System.out.println(LoginButton.isEnabled());

	}

}
