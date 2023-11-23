package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDeclareImplicitWait {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://www.instagram.com/");
		d.findElement(By.name("username")).sendKeys("Altamas");
		d.findElement(By.name("password")).sendKeys("Altamas@12");
	}

}
