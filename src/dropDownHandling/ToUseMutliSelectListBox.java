package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseMutliSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.get("https://demoapp.skillrary.com/");
		WebElement multiSelect = d.findElement(By.id("cars"));
		Select select = new Select(multiSelect);
		System.out.println(select.isMultiple());
		
		select.selectByValue("99");
		select.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
		Thread.sleep(3000);
		// To dESELECT
		// select.deslectByValue("99");
		// select.deselctByVisble
		
		select.deselectAll();

	}

}
