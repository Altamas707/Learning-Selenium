package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElements {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.facebook.com/reg");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement hiddenEle = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='Tiktoker';", hiddenEle);
		
	}

}
