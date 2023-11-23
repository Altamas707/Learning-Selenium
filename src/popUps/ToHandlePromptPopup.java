package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopup {

	public static void main(String[] args) {
		

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		d.switchTo().frame("iframeResult");	
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertPopup = d.switchTo().alert();
		alertPopup.sendKeys("Altamas");
		alertPopup.accept();

	}

}
