package org.qa.testcases;

import org.factory.DriverManager;
import org.factory.DriverManagerFactory;
import org.factory.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FactoryDesignTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
    }

    @Test
    public void verifyBStackDemoAddToCart() {
        driver.get("https://bstackdemo.com/");
        List<WebElement> addToCartBtns = driver.findElements(By.cssSelector("div.shelf-item__buy-btn"));
        addToCartBtns.get(0).click();
        WebElement checkoutBtn = driver.findElement(By.cssSelector("div.but-btn"));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertTrue(checkoutBtn.isDisplayed());
    }

    @Test
    public void verifyBStackDemoTitle() {
        driver.get("https://bstackdemo.com/");
        Assert.assertEquals(driver.getTitle(), "StackDemo");
    }
    @Test
    public void verifyBStackDemoLogo() {
        driver.get("https://bstackdemo.com/");
        WebElement logo = driver.findElement(By.cssSelector(" a.Navbar_logo__26S5Y"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(logo.isDisplayed());
    }

    @AfterTest
    public void afterMethod() {
        driver.quit();
    }
}
