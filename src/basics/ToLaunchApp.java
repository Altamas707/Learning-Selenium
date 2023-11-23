package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchApp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
	
	}
}
