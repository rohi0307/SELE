package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import utils.DriverFactory;

public class Base {
	public static WebDriver driver = DriverFactory.getDriver();

	
	}

