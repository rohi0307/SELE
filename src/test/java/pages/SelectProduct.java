package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.GetProperty;

public class SelectProduct {
	WebDriver driver;

	public SelectProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "inventory_item_name")
	private static List<WebElement> products;
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement AddToCart;

	public void selectProduct() {
		for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText();
			if (product.equalsIgnoreCase(GetProperty.getProperty("ProductName"))) {
				driver.findElements(By.className("inventory_item_name")).get(i).click();
			}
		}
		
		AddToCart.click();
	}
}
