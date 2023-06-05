package org.facade;

import org.openqa.selenium.WebDriver;

public class PlaceOrderFacade {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    SummaryPage summaryPage;
    ShippingPage shippingPage;
    PaymentPage paymentPage;
    AddressPage addressPage;


    public String placeOrder(WebDriver driver) throws InterruptedException {
        loginPage =new LoginPage(driver);
        System.out.println("loginPage: "+ loginPage);
        loginPage.login("<username>", "<password>");
        homePage = loginPage.clickHomeBtn(driver);
        summaryPage = homePage.addToCartAndProceedToChkOut(0, driver);
        addressPage= summaryPage.proceedToCheckOut(driver);
        shippingPage =addressPage.proceedToCheckOut(driver);
        paymentPage = shippingPage.proceedToCheckOut(driver);
        String cartCount= paymentPage.clickPayByChequeAndConfirm(driver);
        return cartCount;
    }

}
