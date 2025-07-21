package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CheckOut;
import pages.LoginPage;
import pages.SelectProduct;
import utils.DriverFactory;
import utils.ListinersForTests;

@Listeners(ListinersForTests.class)
public class TC01_LoginToPortal {
	static WebDriver driver = DriverFactory.driverSetup();
	LoginPage l;
	SelectProduct s;
	CheckOut c;

	@Test(description = "Login to portal", priority = 1)
	public void login() throws InterruptedException {
		l = new LoginPage(driver);
		l.loginToProtal();
		Thread.sleep(1200);
	}

	@Test(description = "Select product", priority = 2)
	public void selectProduct() {
		s = new SelectProduct(driver);
		s.selectProduct();
	}

	@Test(description = "Check Outr Product", priority = 3)
	public void checkOut() throws InterruptedException {
		c = new CheckOut(driver);
		c.CheckOutProduct();
	}
}
