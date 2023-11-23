package pomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Demowebshop_001 {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextfield().sendKeys("Kiran@gmail.com");
		lp.getPasswordTextfield().sendKeys("Testing@123");
		lp.getLoginButton().click();

	}

}
