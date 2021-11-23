package com.opencart.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//div[@id = 'content']//h1")
    private WebElement productName;

    @FindBy(xpath = "//button[@data-original-title = 'Add to Wish List']")
    private WebElement addToWishList;

    @FindBy(xpath = "//button[@data-original-title = 'Compare this Product']")
    private WebElement compareThisProduct;

    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-lg btn-block']")
    private WebElement addToCart;

    @FindBy(xpath = "//div[@id = 'product-product']//ul[@class = 'list-unstyled']//h2")
    private WebElement productPrice;

    @FindBy(xpath = "//div[@id = 'product-product']//ul[@class = 'list-unstyled']//li[4]")
    private WebElement availability;

    @FindBy(xpath = "//input[@name = 'quantity']")
    private WebElement quantity;

    @FindBy(xpath = "//select['input-option226']")
    private WebElement selectForm;

    @FindBy(xpath = "//option[contains(.,'Red')]")
    private WebElement selectRed;

    @FindBy(xpath = "//option[contains(.,'Blue')]")
    private WebElement selectBlue;

    @FindBy(xpath = "//option[contains(.,'Green')]")
    private WebElement selectGreen;

    @FindBy(xpath = "//option[contains(.,'Yellow')]")
    private WebElement selectYellow;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement mediumFormAlert;

    @FindBy(xpath = "//div[@id = 'input-option218']//input[@value = '5']")
    private WebElement radioSmall;

    @FindBy(xpath = "//div[@id = 'input-option218']//input[@value = '6']")
    private WebElement radioMedium;

    @FindBy(xpath = "//div[@id = 'input-option218']//input[@value = '7']")
    private WebElement radioLarge;

    @FindBy(xpath = "//input[@value = '8']")
    private WebElement checkBoxSelectFirst;

    @FindBy(xpath = "//input[@value = '9']")
    private WebElement checkBoxSelectSecond;

    @FindBy(xpath = "//input[@value = '10']")
    private WebElement checkBoxSelectThird;

    @FindBy(xpath = "//input[@value = '11']")
    private WebElement checkBoxSelectForth;

    @FindBy(xpath = "//input[@id = 'input-option208']")
    private WebElement productHardFormText;

    @FindBy(xpath = "//div[@class = 'text-danger']")
    private WebElement requiredFieldAlert;

    @FindBy(xpath = "//textarea[@id = 'input-option209']")
    private WebElement productHardFormTextArea;

    @FindBy(xpath = "//input[@id = 'input-option219']")
    private WebElement productHardFormDate;

    @FindBy(xpath = "//input[@id = 'input-option221']")
    private WebElement productHardFormHour;

    @FindBy(xpath = "//input[@id = 'input-option220']")
    private WebElement productHardFormDateAndHour;

    @FindBy(xpath = "//button[@id = 'button-upload222']")
    private WebElement productHardFormUploadButton;

    public WebElement getProductName() { return productName;}

    public WebElement getAddToCart() {
        wait.until(ExpectedConditions.visibilityOf(addToCart));
        return addToCart; }

    public WebElement getAddToWishList() { return addToWishList; }

    public WebElement getCompareThisProduct() { return compareThisProduct; }

    public WebElement getProductPrice() { return productPrice; }

    public WebElement getAvailability() { return availability; }

    public WebElement getQuantity() {
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(quantity));
        return quantity; }

    public WebElement getSelectForm() {
        wait.until(ExpectedConditions.elementToBeClickable(selectForm));
        return selectForm;
    }

    public WebElement getSelectBlue() {
        wait.until(ExpectedConditions.elementToBeClickable(selectBlue));
        return selectBlue;
    }

    public WebElement getSelectRed() {
        wait.until(ExpectedConditions.elementToBeClickable(selectRed));
        return selectRed;
    }

    public WebElement getMediumFormAlert() {
        wait.until(ExpectedConditions.visibilityOf(mediumFormAlert));
        return mediumFormAlert;
    }

    public WebElement getRadioLarge() {
        wait.until(ExpectedConditions.elementToBeClickable(radioLarge));
        return radioLarge;
    }

    public WebElement getRadioMedium() {
        wait.until(ExpectedConditions.elementToBeClickable(radioMedium));
        return radioMedium;
    }

    public WebElement getRadioSmall() {
        wait.until(ExpectedConditions.elementToBeClickable(radioSmall));
        return radioSmall;
    }

    public WebElement getProductHardFormText() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormText));
        return productHardFormText;
    }

    public WebElement getCheckBoxSelectFirst() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxSelectFirst));
        return checkBoxSelectFirst;
    }

    public WebElement getCheckBoxSelectSecond() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxSelectSecond));
        return checkBoxSelectSecond;
    }

    public WebElement getCheckBoxSelectThird() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxSelectThird));
        return checkBoxSelectThird;
    }

    public WebElement getCheckBoxSelectForth() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxSelectForth));
        return checkBoxSelectForth;
    }

    public WebElement getRequiredFieldAlert() {
        wait.until(ExpectedConditions.visibilityOfAllElements(requiredFieldAlert));
        return requiredFieldAlert;
    }

    public WebElement getSelectGreen() {
        wait.until(ExpectedConditions.elementToBeClickable(selectGreen));
        return selectGreen;
    }

    public WebElement getSelectYellow() {
        wait.until(ExpectedConditions.elementToBeClickable(selectYellow));
        return selectYellow;
    }

    public WebElement getProductHardFormTextArea() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormTextArea));
        return productHardFormTextArea;
    }

    public WebElement getProductHardFormDate() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormDate));
        return productHardFormDate;
    }

    public WebElement getProductHardFormHour() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormHour));
        return productHardFormHour;
    }

    public WebElement getProductHardFormDateAndHour() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormDateAndHour));
        return productHardFormDateAndHour;
    }

    public WebElement getProductHardFormUploadButton() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormUploadButton));
        return productHardFormUploadButton;
    }
}
