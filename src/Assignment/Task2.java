package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		ChromeDriver c =new ChromeDriver();
		c.manage().window().maximize();
		c.navigate().to("https://www.youtube.com/");
		String s = c.getPageSource();
		System.out.println(s);
		c.quit();
	}

}
