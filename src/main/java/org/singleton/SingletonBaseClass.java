package org.singleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
Webdriver object has been initialised as static and null.

 init() static method is used to initialise the Webdriver object only when the Webdriver object is null.
 If driver has a value (not been destroyed/ not null), init() method will not be executed
 and the same driver would be used for the further execution.
 This serves the actual purpose of Singleton design pattern
 getDriver() static method returns driver object to be used in test class.
 quit() static method quits the driver and makes the driver as null to destroy the driver object completely.
 */
public class SingletonBaseClass {

    private static WebDriver driver = null;
    private static String browserName = "chrome";

    public static void init() {
        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }
}
