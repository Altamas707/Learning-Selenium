package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.olivegarden.com/home");
		String s = d.getWindowHandle();
		System.out.println(s);
	}

}
