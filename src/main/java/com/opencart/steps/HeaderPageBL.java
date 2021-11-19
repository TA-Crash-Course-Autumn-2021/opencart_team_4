package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.pages.containers.HeaderPageCartContainer;
import org.openqa.selenium.WebElement;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
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

    /*public SharePageBL clickOnHeaderShareButton(){
        headerPage.getHeaderShareButton().click();
        return new SharePageBL();
    }*/

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

    public LogoutPageBL clickOnLogoutButton() {
        headerPage.getLogoutButton().click();
        return new LogoutPageBL();
    }
}
