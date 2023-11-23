package advance_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLeranDataProvider {
	
	@DataProvider(name="cred")
	public String[][] sendData() {
		String[][] sarr = {
				{"admin","manager"},
				{"trainee","trainee"},
				{"kiran","Testing@123"}
		};
		return sarr;
	}
	@Test(dataProvider="cred")
	
	public void toLogin(String[] credentials) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys(credentials[0]);
	Thread.sleep(1000);
	driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
	Thread.sleep(1000);
	driver.findElement(By.id("loginButton")).click();
    driver.quit();    
}
}
	