package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLuanchTVS {

	@Test
	public void Yamha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tvsmotor.com/");
		Reporter.log("TVS got launched", true);
		driver.quit();
}
}
