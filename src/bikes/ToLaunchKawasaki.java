package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKawasaki {
	
	@Test
	public void kawaski() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
		Reporter.log("Kawaski got launched", true);
		driver.quit();
	}
 
}
