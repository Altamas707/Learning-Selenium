package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToInstagram {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.instagram.com/");
		d.findElement(By.name("username")).sendKeys("John");
		d.findElement(By.name("password")).sendKeys("John@12");
		d.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
