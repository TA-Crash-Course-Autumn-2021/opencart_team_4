package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.pages.HomePage;
import com.opencart.pages.MyAccountPage;
import com.opencart.pages.containers.HeaderPageCartContainer;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.List;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        for (;;) {
            try{
            headerPage.getMyAccountButton().click();
            break;
            }catch (ElementClickInterceptedException e ){ continue;}
        }
        return this;
    }

    public MyAccountPageBL myAccount() {
        headerPage.getMyAccountButton().click();
        headerPage.getMyAccount().click();
        return new MyAccountPageBL();
    }

    public HeaderPageBL checkCurrencySymbol(String symbol) {
        String actual = headerPage.getCurrencySymbol().getText();
        String expected = symbol;
        Assert.assertEquals(actual, expected, "Currency error");
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getHeaderRegisterButton().click();
        return new RegisterPageBL();
    }

    public LoginPageBL clickOnLoginButton(){
        headerPage.getHeaderLoginButton().click();
        return new LoginPageBL();
    }

    public CartPageBL clickOnHeaderUpperCartButton(){
        headerPage.getHeaderUpperCart().click();
        return new CartPageBL();
    }

    public CheckoutPageBL clickOnHeaderCheckoutButton(){
        headerPage.getHeaderCheckoutButton().click();
        return new CheckoutPageBL();
    }

    public HeaderPageBL headerCurrencyCaretDownClick(){
        headerPage.getHeaderCurrencyCaretDown().click();
        return this;
    }

    public HeaderPageBL headerCurrencyChoose(String Currencies){
        for(WebElement current : headerPage.getHeaderCurrencyList()){
            if(current != null & current.getAttribute("name").equalsIgnoreCase(Currencies)){
                current.click();
                break;
            }
        }
        return this;
    }

    public SearchPageBL useSearch(String product){
        headerPage.getSearch().click();
        headerPage.getSearch().clear();
        headerPage.getSearch().sendKeys(product);
        headerPage.getSearchStringSubmit().click();
        return new SearchPageBL();
    }

    public HomePageBL headerClickOnHomeButton(){
        headerPage.getHomeButton().click();
        return new HomePageBL();
    }

    public WishListBL headerClickOnWishListButton() {
        headerPage.getHeaderWishListButton().click();
        return new WishListBL();
    }

    public HeaderPageCart getHeaderCart(){
        headerPage.getHeaderCart().click();
        return new HeaderPageCart();
    }

    public MyAccountPageBL loginValidUser() {
        do{
            headerPage.getMyAccountButton().click();
        } while(!headerPage.getHeaderLoginButton().isDisplayed());
        headerPage.getHeaderLoginButton().click();
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.loginValidUser().successLoginCheck();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL loginInvalidUser() {
        do{
            headerPage.getMyAccountButton().click();
        } while(!headerPage.getHeaderLoginButton().isDisplayed());
        headerPage.getHeaderLoginButton().click();
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.loginInvalidUser().unsuccessLoginCheck();
        return new MyAccountPageBL();
    }

    public LogoutPageBL clickOnLogoutButton() {
        headerPage.getLogoutButton().click();
        return new LogoutPageBL();
    }


    public HomePageBL logoutUser() {
        LogoutPageBL logoutPageBL = new LogoutPageBL();
        headerPage.getMyAccountButton().click();
        headerPage.getLogoutButton().click();
        logoutPageBL.clickOnContinueButton();
        headerPage.getHomeButton().click();
        return new HomePageBL();
    }
}
