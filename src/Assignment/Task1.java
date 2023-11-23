package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.navigate().to("https://www.amazon.in/");
		String s = c.getTitle();
		System.out.println(s);
		c.quit();
	}
}
