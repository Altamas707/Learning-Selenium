package WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
        String sourceCode = driver.getPageSource();
        System.out.println(sourceCode);
		
	}
}
