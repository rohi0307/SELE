package tests;

import base.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TakeSnip;

import java.io.IOException;

public class Test_01 extends Base{
    LoginPage loginPage;
    @BeforeTest
    private void setUp() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Login to the application")
    private void login() throws IOException {
        TakeSnip.takeSnip();
        loginPage.loginToPortal();
        System.out.println("Test Executed");
        
    }
}
