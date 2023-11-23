package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertiesFile2 {

	public static void main(String[] args) throws IOException {

		// Step 1: Create object of FileInputStream
		FileInputStream fis = new FileInputStream("./testData/testData2.properties");

		// Step 2: Create object of Properties file
		Properties prop = new Properties();

		// Step3: Call method
		prop.load(fis);
		String url = prop.getProperty("url");
		String gender = prop.getProperty("Gender");
		String first = prop.getProperty("First");
		String last = prop.getProperty("Last");
		String email = prop.getProperty("Email");
		String password = prop.getProperty("Password");
		String cPassword = prop.getProperty("Confirm");

		// Automation script

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(first);
		driver.findElement(By.id("LastName")).sendKeys(last);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cPassword);
		driver.findElement(By.id("register-button")).click();
	}

}
