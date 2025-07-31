package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GetProperty;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;
	@FindBy(css = "#password")
	private WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement LoginButton;
	
	public  void loginToPortal() {
		username.sendKeys(GetProperty.getProperty("username"));
		Password.sendKeys(GetProperty.getProperty("password"));
		LoginButton.click();
	}
}
