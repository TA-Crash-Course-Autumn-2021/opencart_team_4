package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeneralAddProduct extends AddNewProductPage {

    @FindBy(xpath = "//input[@id='input-name1']")
    private WebElement productName;

    @FindBy(xpath = "//div[@class='note-editable']")
    private WebElement productDescription;

    @FindBy(xpath = "//input[@id='input-meta-title1']")
    private WebElement productMetaTagTitle;

    @FindBy(xpath = "//textarea[@id='input-meta-description1']")
    private WebElement productMetaTagDescription;

    @FindBy(xpath = "//textarea[@id='input-meta-keyword1']")
    private WebElement productMetaTagKeywords;

    @FindBy(xpath = "//input[@id='input-tag1']")
    private WebElement productTags;

    public WebElement getProductName() {
        wait.until(ExpectedConditions.elementToBeClickable(productName));
        return productName;
    }

    public WebElement getProductDescription() {
        wait.until(ExpectedConditions.elementToBeClickable(productDescription));
        return productDescription;
    }

    public WebElement getProductMetaTagTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(productMetaTagTitle));
        return productMetaTagTitle;
    }

    public WebElement getProductMetaTagDescription() {
        wait.until(ExpectedConditions.elementToBeClickable(productMetaTagDescription));
        return productMetaTagDescription;
    }

    public WebElement getProductMetaTagKeywords() {
        wait.until(ExpectedConditions.elementToBeClickable(productMetaTagKeywords));
        return productMetaTagKeywords;
    }

    public WebElement getProductTags() {
        wait.until(ExpectedConditions.elementToBeClickable(productTags));
        return productTags;
    }
}
