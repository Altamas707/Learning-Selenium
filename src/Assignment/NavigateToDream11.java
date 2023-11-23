package Assignment;
//package handlingFrames

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDream11 {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.get("https://www.dream11.com/");
		// to use index
		d.switchTo().frame(0);
		
		//to use ID or name
		//d.switchTo().frame("send-sms-iframe");
		
		//WebElement frame = d.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		//d.switchTo().fr
		d.findElement(By.id("regEmail")).sendKeys("7076941931");
		//d.switchTo().parentFrame();
		d.switchTo().defaultContent();
		d.findElement(By.linkText("About Us")).click();

	}

}
