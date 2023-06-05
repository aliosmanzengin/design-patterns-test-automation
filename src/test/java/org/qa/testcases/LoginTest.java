package org.qa.testcases;

import org.POM.BaseClass;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest{
    WebDriver driver;
    LoginPage lp;
    HomePage hp;
    SearchPage sp;

    @BeforeTest
    public void setUp() {
        driver= BaseClass.init();
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        sp=new SearchPage(driver);
    }

    @Test(priority = 1)
    public void validLogin() {
        hp.clickSignIn();
        lp.login("<username>", "<password>");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(hp.logoutisDisplayed());
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}