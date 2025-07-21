package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver = null;
	static String browser = GetProperty.getProperty("browser");

	public static WebDriver driverSetup() {
		if (driver == null) {
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(GetProperty.getProperty("url"));
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(GetProperty.getProperty("url"));
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(GetProperty.getProperty("url"));
				break;

			default:
				System.out.println("Invalid Browser");
				break;
			}
		}
		return driver;

	}
	@AfterTest
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
