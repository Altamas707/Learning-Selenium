package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Constructor
	WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	@FindBy(linkText="Log in")
	private WebElement login;
	
	@FindBy(linkText="Register")
	private WebElement registerLink;

}
