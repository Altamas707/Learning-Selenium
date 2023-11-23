package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Md Altamas Khan\\Desktop\\Altamas Khan\\Resume\\RESUME.pdf");
	}
}
