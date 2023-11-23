package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AC_001 extends BaseClass {

	@Test
	public void toCheckTasklist() {
		driver.findElement(By.id("container_tasks")).click();
		Reporter.log("Testcase 001 got passed", true);
	}

}
