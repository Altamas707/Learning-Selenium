package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfiramtionPopup {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://licindia.in/");
		d.findElement(By.partialLinkText(" Login ")).click();
		
		Alert confrimationPop = d.switchTo().alert();
		System.out.println(confrimationPop.getText());
		confrimationPop.accept();
		
	}

}
