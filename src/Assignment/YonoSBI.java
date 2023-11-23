package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonoSBI {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		d.findElement(By.id("password")).sendKeys("testing@12");
		WebElement eyeIcon = d.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		Actions act = new Actions(d);
		act.moveByOffset(1295, 315).clickAndHold().perform();
		Thread.sleep(2000);
		act.release(eyeIcon).perform();

	}

}
