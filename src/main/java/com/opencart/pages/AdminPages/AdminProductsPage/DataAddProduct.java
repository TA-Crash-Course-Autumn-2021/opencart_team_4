package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DataAddProduct extends GeneralAddProduct {

    @FindBy(xpath = "//input[@id='input-model']")
    private WebElement productModel;

    @FindBy(xpath = "//input[@id='input-sku']")
    private WebElement productSKU;

    @FindBy(xpath = "//input[@id='input-upc']")
    private WebElement productUPC;

    @FindBy(xpath = "//input[@id='input-ean']")
    private WebElement productEAN;

    @FindBy(xpath = "//input[@id='input-jan']")
    private WebElement productJAN;

    @FindBy(xpath = "//input[@id='input-isbn']")
    private WebElement productISBN;

    @FindBy(xpath = "//input[@id='input-mpn']")
    private WebElement productMPN;

    @FindBy(xpath = "//input[@id='input-location']")
    private WebElement productLocation;

    @FindBy(xpath = "//input[@id='input-price']")
    private WebElement productPrice;

    @FindBy(xpath = "//select[@id='input-tax-class']")
    private WebElement productTaxClass;

    @FindBy(xpath = "///input[@id='input-quantity']")
    private WebElement productQuantity;

    @FindBy(xpath = "//input[@id='input-minimum']")
    private WebElement productMinimumQuantity;

    @FindBy(xpath = "//select[@id='input-subtract']")
    private WebElement productSubtractStock;

    @FindBy(xpath = "//select[@id='input-stock-status']")
    private WebElement productOutOfStockStatus;

    @FindBy(xpath = "//input[@id='input-date-available']")
    private WebElement productDateAvailable;

    @FindBy(xpath = "//input[@id='input-length']")
    private WebElement productLength;

    @FindBy(xpath = "//input[@id='input-width']")
    private WebElement productWidth;

    @FindBy(xpath = "//input[@id='input-height']")
    private WebElement productHeight;

    @FindBy(xpath = "//select[@id='input-length-class']")
    private WebElement productLengthClass;

    @FindBy(xpath = "///input[@id='input-weight']")
    private WebElement productWeight;

    @FindBy(xpath = "//input[@id='input-sort-order']")
    private WebElement productSortOrder;

    public WebElement getProductModel() {
        wait.until(ExpectedConditions.elementToBeClickable(productModel));
        return productModel;
    }

    public WebElement getProductPrice() {
        wait.until(ExpectedConditions.elementToBeClickable(productPrice));
        return productPrice;
    }
}
