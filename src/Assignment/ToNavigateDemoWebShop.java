package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToNavigateDemoWebShop {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement prod = driver.findElement(By.id("products-orderby"));
		
		Select nprod = new Select(prod);
		nprod.selectByVisibleText("Price: High to Low");
	}

}
