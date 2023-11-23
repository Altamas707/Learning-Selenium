package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select(monthDropdown);
		Select yearSelect = new Select(yearDropdown);
		
		daySelect.selectByIndex(5);
		monthSelect.selectByValue("4");
		yearSelect.selectByVisibleText("1998");
		
		List<WebElement> allMonthsOption = monthSelect.getOptions();
		for(WebElement month:allMonthsOption) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(1000);
		}
			 
	}

}

