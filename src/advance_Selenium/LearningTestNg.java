package advance_Selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningTestNg {

	@Test(priority = 1)
	public void crickbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crickbuzz.com");
		Reporter.log("Crickbuzz got Executed", true);
		driver.quit();
	}

	@Test(enabled = false)
	public void baskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baskinrobbinsindia.com");
		Reporter.log("BaskinRobbins got Executed", true);
		driver.quit();

	}

	@Test
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Reporter.log("Amazon got Executed", true);
		driver.quit();

	}
}
