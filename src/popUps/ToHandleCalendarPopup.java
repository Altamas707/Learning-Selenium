package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalendarPopup {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		d.get("https://www.abhibus.com");
		d.findElement(By.id("jaurney-date")).click();

		for (;;) {
			try {
				d.findElement(By.xpath("//span[text()='November']/../../..//span[text()='24']")).click();
				break;
			} catch (Exception e) {
				d.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}
		}

	}

}
