package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseMoveByOffset {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://www.woodenstreet.com/");
		d.findElement(By.id("loginclose1")).click();
		
		Actions act = new Actions(d);
		act.moveByOffset(236, 161).perform();

	}

}
