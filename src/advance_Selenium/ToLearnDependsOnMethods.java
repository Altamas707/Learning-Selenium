package advance_Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {

	@Test
	public void createAccount() {
		Reporter.log("Account created succesfully", true);
	}

	@Test(dependsOnMethods = "createAccount")
	public void editAccount() {
		Reporter.log("Account edited succesfully", true);
	}

	@Test(dependsOnMethods = {"editAccount","createAccount"})
	public void deleteAccount() {
		Reporter.log("Account delted succesfully", true);
	}

}
