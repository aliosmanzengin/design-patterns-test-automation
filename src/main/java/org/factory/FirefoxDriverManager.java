package org.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    public FirefoxDriverManager() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
}
