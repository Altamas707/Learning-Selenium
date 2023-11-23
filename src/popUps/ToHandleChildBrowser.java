package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildBrowser {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		d.get("https://demo.actitime.com/login.do");
		String parentID = d.getWindowHandle();
		d.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowID = d.getWindowHandles();
		allWindowID.remove(parentID);
		for (String windowID: allWindowID) {
			d.switchTo().window(windowID);
		}	
		d.findElement(By.linkText("Log in")).click();
		
	}

}
