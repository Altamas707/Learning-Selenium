package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseExplicitWait {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.get("https://www.shoppersstack.com/products_page/3");
		d.findElement(By.id("Check Delivery")).sendKeys("560011");
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		d.findElement(By.id("Check")).click();
	}
}
