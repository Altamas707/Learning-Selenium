package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_004 extends BaseClass {

	@Test
	public void toCheckSettings() {
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Reporter.log("Settings dropdown displayed sucessfully", true);
	}

}
