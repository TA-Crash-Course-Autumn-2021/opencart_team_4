package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;


public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

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
    WebElement headerWishListButton;

    @FindBy(xpath = "//ul[@class = 'list-inline']//i[@class = 'fa fa-phone']")
    WebElement headerContactUsButton;

    @FindBy(xpath = "//button[@class = 'btn btn-link dropdown-toggle']//i[@class = 'fa fa-caret-down']")
    WebElement headerCurrencyCaretDown;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu']//li//button")
    List<WebElement> headerCurrencyList;

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
}
