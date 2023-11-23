package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_006 extends BaseClass {

	@Test
	public void toCheckGeneralSettings() {
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='item_link'])[3]")).click();
		Reporter.log("Testcase 006 passed", true);
	}

}
