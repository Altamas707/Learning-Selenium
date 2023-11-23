package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheSize {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement loginButton = d.findElement(By.id("loginButton"));
		System.out.println(loginButton.getSize());
		System.out.println(loginButton.getLocation());

	}

}
