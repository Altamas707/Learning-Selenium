package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetTagname {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		String tagName = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(tagName);
		
	}

}
