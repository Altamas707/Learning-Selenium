package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_0010 extends BaseClass {

	@Test
	public void toCheckTypesOfWork() {
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='item_link'])[7]")).click();
		Reporter.log("Notifications page displayed succesfully", true);
	}
}
