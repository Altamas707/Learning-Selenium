package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_005 extends BaseClass{
	
	@Test
	public void toCheckFeaturesTurnON_OFF() {
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Turn Features On / Off']")).click();
		Reporter.log("Testcase 005 got passed", true);
	}

}
