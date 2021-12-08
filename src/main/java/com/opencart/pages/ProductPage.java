package com.opencart.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//div[@id = 'content']//h1")
    private WebElement productName;

    @FindBy(xpath = "//button[@data-original-title = 'Add to Wish List']")
    private WebElement addToWishList;

    @FindBy(xpath = "//button[@data-original-title = 'Compare this Product']")
    private WebElement compareThisProduct;

    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-lg btn-block']")
    private WebElement addToCart;

    @FindBy(xpath = "//input[@name = 'quantity']")
    private WebElement quantity;

    @FindBy(xpath = "//select[@id = 'input-option226']")
    private WebElement selectForm;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement mediumFormAlert;

    @FindBy(xpath = "//div[@class = 'checkbox']//input")
    private List<WebElement> checkboxOptions;

    @FindBy(id = "input-option208")
    private WebElement productHardFormText;

    @FindBy(xpath = "//div[@class = 'text-danger']")
    private WebElement requiredFieldAlert;

    @FindBy(xpath = "//textarea[@id = 'input-option209']")
    private WebElement productHardFormTextArea;

    @FindBy(xpath = "//input[@name = 'option[219]']")
    private WebElement productHardFormDate;

    @FindBy(xpath = "//input[@name = 'option[221]']")
    private WebElement productHardFormHour;

    @FindBy(xpath = "//input[@name = 'option[220]']")
    private WebElement productHardFormDateAndHour;

    @FindBy(xpath = "//button[@id = 'button-upload222']")
    private WebElement productHardFormUploadButton;

    @FindBy(xpath = "//select")
    private WebElement selectOptions;

    @FindBy(xpath = "//div[@class= 'radio']//input")
    private List<WebElement> radioValues;

    public WebElement getProductName() { return productName;}

    public WebElement getAddToCart() {
        wait.until(ExpectedConditions.visibilityOf(addToCart));
        return addToCart; }

    public WebElement getAddToWishList() { return addToWishList; }

    public WebElement getCompareThisProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(compareThisProduct));
        return compareThisProduct; }

    public WebElement getQuantity() {
        wait.until(ExpectedConditions.elementToBeClickable(quantity));
        return quantity; }

    public WebElement getSelectForm() {
        wait.until(ExpectedConditions.elementToBeClickable(selectForm));
        return selectForm;
    }

    public WebElement getMediumFormAlert() {
        wait.until(ExpectedConditions.visibilityOf(mediumFormAlert));
        return mediumFormAlert;
    }

    public WebElement getProductHardFormText() {
        wait.until(ExpectedConditions.elementToBeClickable(productHardFormText));
        return productHardFormText;
    }

    public WebElement getRequiredFieldAlert() {
        wait.until(ExpectedConditions.visibilityOf(requiredFieldAlert));
        return requiredFieldAlert;
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

    public WebElement getSelectOptions() {
        wait.until(ExpectedConditions.elementToBeClickable(selectOptions));
        return selectOptions;
    }

    public List<WebElement> getRadioValues() {
        wait.until(ExpectedConditions.visibilityOfAllElements(radioValues));
        return radioValues;
    }

    public List<WebElement> getCheckboxOptions() {
        wait.until(ExpectedConditions.visibilityOfAllElements(checkboxOptions));
        return checkboxOptions;
    }
}
