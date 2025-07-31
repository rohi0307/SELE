package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GetProperty;

public class CheckOut {
	WebDriver driver;

	public CheckOut(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement CartIcon;
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement CheckOut;
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement Firstname;
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement LastName;
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement ZipCode;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ContinueButton;
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement FinishButton;

	public void CheckOutProduct() throws InterruptedException {
		Thread.sleep(1200);
		CartIcon.click();
		Thread.sleep(1200);
		CheckOut.click();
		Thread.sleep(1200);
		Firstname.sendKeys(GetProperty.getProperty("Firstname"));
		LastName.sendKeys(GetProperty.getProperty("LastName"));
		ZipCode.sendKeys(GetProperty.getProperty("ZipCode"));
		ContinueButton.click();
		Thread.sleep(1200);
		FinishButton.click();
	}
}
