package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPlayFavSong {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		WebElement searchBox = driver.findElement(By.name("search_query"));
		searchBox.sendKeys("AFSANAY");
		Thread.sleep(2000);
		
		searchBox.submit();
		Thread.sleep(2000);
		
		driver.findElement(By.id("video-title")).click();
		
		driver.findElement(By.className("ytp-ad-skip-button")).click();

	}

}
