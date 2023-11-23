package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumSendKeys {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://www.amazon.com");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);

	}

}
