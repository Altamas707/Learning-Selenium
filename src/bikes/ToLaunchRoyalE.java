package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRoyalE {

	@Test
	public void Yamha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		Reporter.log("Yamha got launched", true);
		driver.quit();
}
}
