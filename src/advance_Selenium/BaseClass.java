package advance_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void toLaunch() {
		driver = new ChromeDriver();
		Reporter.log("Browser launched succesfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized succesfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("Navigated to loginpage succesfully", true);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logged out succesfully", true);
	}

	@AfterClass
	public void logClose() {
		Reporter.log("Brwoser got closed succesfully", true);
		driver.quit();
	}

}
