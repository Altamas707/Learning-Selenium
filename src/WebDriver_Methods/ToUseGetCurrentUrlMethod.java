package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCurrentUrlMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String urlOfTheWebpage = driver.getCurrentUrl();
		System.out.println(urlOfTheWebpage);
	}
}
