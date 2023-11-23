package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d =new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.woodenstreet.com/");
		for(;;) {
		try {
			d.findElement(By.id("loginclose1")).click();
			break;
		} catch (Exception e) {
			Thread.sleep(3000);
		}
	}
		List<WebElement> allEle = d.findElements(By.xpath("//ul[@class='container flex']/li"));
		for(WebElement ele : allEle) {
			System.out.println(ele.getText());
		}
	}
}
