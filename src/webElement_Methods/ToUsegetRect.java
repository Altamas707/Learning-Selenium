package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetRect {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		Rectangle loginButton = driver.findElement(By.id("loginButton")).getRect();
		System.out.println(loginButton.getHeight());
		System.out.println(loginButton.getWidth());
		System.out.println(loginButton.getX());
		System.out.println(loginButton.getY());

	}

}
