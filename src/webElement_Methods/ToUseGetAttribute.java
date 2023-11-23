package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		String toolTipmsg=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(toolTipmsg);
		
	}

}
