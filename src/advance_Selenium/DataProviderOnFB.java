package advance_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOnFB {

	@DataProvider(name = "cred")
	public String[][] sendData() {
		String[][] sarr = { { "admin", "manager" }, { "trainee", "trainee" }, { "kiran", "Testing@123" } };
		return sarr;
	}

	@Test(dataProvider = "cred")

	public void toLogin(String[] credentials) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(credentials[0]);
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys(credentials[1]);
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
}
