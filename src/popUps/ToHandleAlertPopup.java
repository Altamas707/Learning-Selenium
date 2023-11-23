package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		d.get("https://netbanking.hdfcbank.com/netbanking/");
		d.switchTo().frame("login_page");	
		d.findElement(By.linkText("CONTINUE")).click();
			
		Alert ref = d.switchTo().alert();
		System.out.println(ref.getText());
		ref.accept();

	}

}
