package com.opencart.pages;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.containers.HeaderPageCartContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//li/a[text() = 'Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement headerRegisterButton;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu dropdown-menu-right']//*[contains(@href, 'login')]")
    private WebElement headerLoginButton;

    @FindBy(xpath = "//input[@class = 'form-control input-lg']")
    private WebElement searchString;

    @FindBy(xpath = "//button[@class = 'btn btn-default btn-lg']")
    private WebElement searchStringSubmit;

    @FindBy(id = "cart-total")
    private WebElement headerCart;

    @FindBy(xpath = "//nav[@id = 'top']//i[@class = 'fa fa-share']")
    private WebElement headerShareButton;

    @FindBy(xpath = "//ul[@class = 'list-inline']//i[@class = 'fa fa-shopping-cart']")
    private WebElement headerUpperCart;

    @FindBy(xpath = "//ul[@class = 'list-inline']//i[@class = 'fa fa-heart']")
    private WebElement headerWishListButton;

    @FindBy(xpath = "//ul[@class = 'list-inline']//i[@class = 'fa fa-phone']")
    private WebElement headerContactUsButton;

    @FindBy(xpath = "//button[@class = 'btn btn-link dropdown-toggle']//i[@class = 'fa fa-caret-down']")
    private WebElement headerCurrencyCaretDown;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu']//li//button")
    private List<WebElement> headerCurrencyList;

    @FindBy(xpath = "//div[@id = 'logo']//h1/a")
    private WebElement homeButton;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu pull-right']//table[@class = 'table table-striped']/tbody/tr")
    private List<WebElement> headerCartProducts;

    @FindBy(xpath = "//button[@class = 'btn btn-link dropdown-toggle']//strong")
    private WebElement currencySymbol;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getSearch() { return searchString; }

    public WebElement getSearchStringSubmit() { return searchStringSubmit; }

    public WebElement getHeaderRegisterButton() {
        wait.until(ExpectedConditions.visibilityOf(headerRegisterButton));
        return headerRegisterButton; }

    public WebElement getHeaderLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(headerLoginButton));
        return headerLoginButton;}

    public WebElement getHeaderCart() { return headerCart; }

    public WebElement getHeaderShareButton() { return headerShareButton; }

    public WebElement getHeaderUpperCart() { return headerUpperCart; }

    public WebElement getHeaderWishListButton() { return headerWishListButton; }

    public WebElement getHeaderContactUsButton() { return headerContactUsButton; }

    public WebElement getHeaderCurrencyCaretDown() {
       wait.until(ExpectedConditions.elementToBeClickable(headerCurrencyCaretDown));
        return headerCurrencyCaretDown; }

    public List<WebElement> getHeaderCurrencyList() {
        wait.until(ExpectedConditions.visibilityOfAllElements(headerCurrencyList));
        return headerCurrencyList; }

    public WebElement getHomeButton() {
        DriverRepository.DRIVERS.get().manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        return homeButton; }

    public List<WebElement> getHeaderCartProducts() { return headerCartProducts; }

    public WebElement getLogoutButton() { return logoutButton; }

    public List<HeaderPageCartContainer> getProducts() {
        return getHeaderCartProducts().stream().map(HeaderPageCartContainer::new).collect(Collectors.toList());
    }

    public WebElement getCurrencySymbol() {
        wait.until(ExpectedConditions.visibilityOf(currencySymbol));
        return currencySymbol;
    }
}
