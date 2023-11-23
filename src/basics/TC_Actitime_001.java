package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Actitime_001 {

	public static void main(String[] args) throws InterruptedException {

		// Expected data
		String usernamedata = "admin";
		String passworddata = "manager";
		String expectedLoginPageTitle = "actiTIME - Login";
		String expectedHomeTitle = "actiTIME - Enter Time-Track";

		// Step 1: Open the browser

		WebDriver driver = new ChromeDriver(); // cross browser setting
		System.out.println("Browser got launched Succesfully");
		driver.manage().window().maximize();
		System.out.println("Browser maximized Succesfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Step 2: To Enter URL
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Suuccesfully navigated to Loginoage");
		} else {
			System.out.println("Failed to navigate Loginpage");
		}

		// Step 3: To Enter username
		WebElement usernameTestField = driver.findElement(By.id("username"));
		usernameTestField.clear();
		usernameTestField.sendKeys(usernamedata);
		String actualUsernameData = usernameTestField.getAttribute("value");
		if (actualUsernameData.equals(usernamedata)) {
			System.out.println("UsernameTextField sucessfuly accepted data");
		} else {
			System.out.println("UsernameTextField failed accept data");
		}

		// Step 4: To Enter password
		WebElement passwordTestField = driver.findElement(By.name("pwd"));
		passwordTestField.clear();
		passwordTestField.sendKeys(passworddata);
		String actualPasswordData = usernameTestField.getAttribute("value");
		if (actualPasswordData.equals(passworddata)) {
			System.out.println("PasswordTextField sucessfuly accepted data");
		} else {
			System.out.println("PasswordTextField failed accept data");
		}
		// Step 5: Click on Login button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		String actualHomePageTitle = driver.getTitle();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Time-Track")));

		if (actualHomePageTitle.equals(expectedHomeTitle)) {
			System.out.println("Succesfully naviagteed to Homepage");
		} else {
			System.out.println("Failed naviagteed to Homepage");
		}

		// Step 6: To close the browser
		System.out.println("Browser closed succesfully");
		// driver.quit();
	}

}
