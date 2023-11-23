package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateGaminginFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		WebElement ele = d.findElement(By.xpath("//span[@role='button']"));
		if(ele.isEnabled()) {
			ele.click();		
		}
		else {		
		}
		
		d.findElement(By.xpath("//img[@alt='Electronics']")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Gaming")).click();
		Thread.sleep(2000);
		String price = d.findElement(By.xpath("(//div[text()='₹99'])[1]")).getText();
		System.out.println(price);

	}

}
