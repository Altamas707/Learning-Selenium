package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKtm {
	
	@Test
	public void Ktm() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM got launched", true);
		driver.quit();
}
}
