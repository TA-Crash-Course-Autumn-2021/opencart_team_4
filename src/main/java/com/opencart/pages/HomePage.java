package com.opencart.pages;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HomePage extends BasePage{


    @FindBy(xpath = "//div[contains(@class, 'product-thumb')]")
    private List<WebElement> products;

    @FindBy(xpath = "//h4[contains (.,'MacBook')]/a")
    private WebElement macbook;

    @FindBy(xpath = "//h4[contains (.,'iPhone')]/a")
    private WebElement iphone;

    @FindBy(xpath = "//h4[contains (.,'Apple')]/a")
    private WebElement AppleCinema;

    @FindBy(xpath = "//h4[contains (.,'Canon')]/a")
    private WebElement CanonEOS;

    @FindBy(xpath = "//h4[contains (.,'MacBook')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'cart')]/..")
    private WebElement macbookAddToCart;

    @FindBy(xpath = "//h4[contains (.,'MacBook')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'hear')]/..")
    private WebElement macbookAddToWishList;

    @FindBy(xpath = "//h4[contains (.,'MacBook')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'exch')]/..")
    private WebElement macbookAddToCompare;

    @FindBy(xpath = "//h4[contains (.,'iPhone')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'cart')]/..")
    private WebElement iphoneAddToCart;

    @FindBy(xpath = "//h4[contains (.,'iPhone')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'hear')]/..")
    private WebElement iphoneAddToWishList;

    @FindBy(xpath = "//h4[contains (.,'iPhone')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'exch')]/..")
    private WebElement iphoneAddToCompare;

    @FindBy(xpath = "//h4[contains (.,'Apple')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'cart')]/..")
    private WebElement appleCinemaAddToCart;

    @FindBy(xpath = "//h4[contains (.,'Apple')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'hear')]/..")
    private WebElement appleCinemaAddToWishList;

    @FindBy(xpath = "//h4[contains (.,'Apple')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'exch')]/..")
    private WebElement appleCinemaAddToCompare;

    @FindBy(xpath = "//h4[contains (.,'Canon')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'cart')]/..")
    private WebElement canonEOSAddToCart;

    @FindBy(xpath = "//h4[contains (.,'Canon')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'hear')]/..")
    private WebElement canonEOSAddToWishList;

    @FindBy(xpath = "//h4[contains (.,'Canon')]/ancestor::div[@class = 'product-thumb transition']//i[contains(@class, 'exch')]/..")
    private WebElement canonEOSAddToCompare;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']/a[contains(., 'shopping')]")
    private WebElement successfulAddToCartAlert;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']/a[contains(.,'login')]")
    private WebElement unsuccessfulAddToWishListAlert;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']/a[contains(.,'wish')]")
    private WebElement successfulAddToWishListAlert;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']/a[contains(.,'com')]")
    private WebElement successfulAddToCompareAlert;

    public List<WebElement> getProducts() {
        wait.until(ExpectedConditions.visibilityOfAllElements(products));
        return products;
    }

    public WebElement getMacbook() {
        wait.until(ExpectedConditions.visibilityOf(macbook));
        return macbook; }

    public WebElement getIphone() {
        wait.until(ExpectedConditions.visibilityOf(iphone));
        return iphone;
    }

    public WebElement getMacbookAddToWishList() {
        wait.until(ExpectedConditions.elementToBeClickable(macbookAddToWishList));
        return macbookAddToWishList;
    }

    public WebElement getMacbookAddToCompare() {
        wait.until(ExpectedConditions.elementToBeClickable(macbookAddToCompare));
        return macbookAddToCompare;
    }

    public WebElement getMacbookAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(macbookAddToCart));
        return macbookAddToCart;
    }

    public WebElement getIphoneAddToWishList() {
        wait.until(ExpectedConditions.elementToBeClickable(iphoneAddToWishList));
        return iphoneAddToWishList;
    }

    public WebElement getIphoneAddToCompare() {
        wait.until(ExpectedConditions.elementToBeClickable(iphoneAddToCompare));
        return iphoneAddToCompare;
    }

    public WebElement getIphoneAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(iphoneAddToCart));
        return iphoneAddToCart;
    }

    public WebElement getCanonEOSAddToWishList() {
        wait.until(ExpectedConditions.elementToBeClickable(canonEOSAddToWishList));
        return canonEOSAddToWishList;
    }

    public WebElement getCanonEOSAddToCompare() {
        wait.until(ExpectedConditions.elementToBeClickable(canonEOSAddToCompare));
        return canonEOSAddToCompare;
    }

    public WebElement getCanonEOSAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(canonEOSAddToCart));
        return canonEOSAddToCart;
    }

    public WebElement getAppleCinemaAddToWishList() {
        wait.until(ExpectedConditions.elementToBeClickable(appleCinemaAddToWishList));
        return appleCinemaAddToWishList;
    }

    public WebElement getAppleCinemaAddToCompare() {
        wait.until(ExpectedConditions.elementToBeClickable(appleCinemaAddToCompare));
        return appleCinemaAddToCompare;
    }

    public WebElement getAppleCinemaAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(appleCinemaAddToCart));
        return appleCinemaAddToCart;
    }

    public WebElement getSuccessfulAddToCartAlert() {
        wait.until(ExpectedConditions.visibilityOf(successfulAddToCartAlert));
        return successfulAddToCartAlert;
    }

    public WebElement getUnsuccessfulAddToWishListAlert() {
        wait.until(ExpectedConditions.visibilityOf(unsuccessfulAddToWishListAlert));
        return unsuccessfulAddToWishListAlert;
    }

    public WebElement getSuccessfulAddToWishListAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(successfulAddToWishListAlert));
        return successfulAddToWishListAlert;
    }

    public WebElement getSuccessfulAddToCompareAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(successfulAddToCompareAlert));
        return successfulAddToCompareAlert;
    }
}
