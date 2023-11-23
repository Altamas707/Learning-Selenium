package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseManageMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		// To maximize
		driver.manage().window().maximize();
		
		// To minimize
		driver.manage().window().minimize();
		
		// To full screen
		driver.manage().window().fullscreen();
		
		// To get the size
		Dimension sizeOfThewebpage = driver.manage().window().getSize();
		System.out.println(sizeOfThewebpage);
		
		// To set size
		driver.manage().window().setSize(new Dimension(800,400));
		
		// To get position
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		// To set position
		driver.manage().window().setPosition(new Point(150,150));
	}

}
