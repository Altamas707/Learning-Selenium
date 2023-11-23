package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_007 extends BaseClass {

	@Test
	public void toCheckWorkFlowSetting() {
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='item_link'])[4]")).click();
		Reporter.log("Workflow Setting page displayed succesfully", true);
	}

}
