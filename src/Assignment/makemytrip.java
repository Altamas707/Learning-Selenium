package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		WebElement iframeElement = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		for (;;) {
			try {
				driver.findElement(By.xpath("(//div[text()='June 2024']/../..//div[@class='dateInnerCell'])[13]"))
						.click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

			}
		}

	}

}
