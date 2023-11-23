package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_002 extends BaseClass {

	@Test
	public void toCheckReports() {
		driver.findElement(By.id("container_reports")).click();
		Reporter.log("Testcase 002 got passed", true);
	}

}
