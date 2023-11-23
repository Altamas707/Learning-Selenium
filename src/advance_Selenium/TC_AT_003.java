package advance_Selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_AT_003 extends BaseClass {

	@Test
	public void toCheckUsers() {
		driver.findElement(By.id("container_users")).click();
		Reporter.log("Testcase 003 got passed", true);
	}

}
