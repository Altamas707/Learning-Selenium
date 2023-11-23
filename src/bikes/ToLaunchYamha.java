package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchYamha {

	
	@Test
	public void Yamha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("Yamha got launched", true);
		driver.quit();
}
}
