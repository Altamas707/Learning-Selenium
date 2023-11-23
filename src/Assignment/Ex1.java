package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

// Barbeque Nation
public class Ex1 {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.barbequenation.com/");
		String s = d.getTitle();
		System.out.println(s);
	}
}
