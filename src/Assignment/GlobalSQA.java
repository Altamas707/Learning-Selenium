package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQA {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.findElement(By.xpath("(//li[@role='tab'])[2]")).click();
		
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(iframe);
		
		WebElement img = driver.findElement(By.id("draggable"));
		WebElement accept = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(img, accept).perform();
		Thread.sleep(30000);
		driver.switchTo().parentFrame();
		
		//Propagation
		driver.findElement(By.id("Propagation")).click();
		WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[3]"));
		driver.switchTo().frame(iframe1);
		
		WebElement img1 = driver.findElement(By.id("droppable"));
		WebElement accept1 = driver.findElement(By.id("draggable2-inner"));
		action.dragAndDrop(img1, accept1).perform();

	}

}
