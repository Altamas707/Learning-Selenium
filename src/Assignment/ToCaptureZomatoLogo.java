package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureZomatoLogo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		File temp = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/ZomatoLogo.bmp");
		FileHandler.copy(temp, src);

	}

}
