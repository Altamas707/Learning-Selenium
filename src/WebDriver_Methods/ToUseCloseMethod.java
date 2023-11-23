package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.close();		
	}
}
