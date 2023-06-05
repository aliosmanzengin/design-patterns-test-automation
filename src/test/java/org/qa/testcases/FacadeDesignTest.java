package org.qa.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.facade.PlaceOrderFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacadeDesignTest {
    WebDriver driver;
    PlaceOrderFacade facade;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationpractice.com/index.php");
        driver.manage().window().maximize();
        facade = new PlaceOrderFacade();
    }

    @Test
    public void placeOrder() throws InterruptedException {
        Assert.assertEquals(facade.placeOrder(driver), "");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
