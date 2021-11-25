package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminNewCurrencyPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-title']")
    private WebElement newCurrencyTitle;

    @FindBy(xpath = "//input[@id = 'input-code']")
    private WebElement newCurrencyCode;

    @FindBy(xpath = "//input[@id = 'input-symbol-left']")
    private WebElement newCurrencySymbolLeft;

    @FindBy(xpath = "//input[@id = 'input-symbol-right']")
    private WebElement newCurrencySymbolRight;

    @FindBy(xpath = "//input[@id = 'input-decimal-place']")
    private WebElement newCurrencyDecimalPlaces;

    @FindBy(xpath = "//input[@id = 'input-value']")
    private WebElement newCurrencyValue;

    @FindBy(xpath = "//select[@id = 'input-status']")
    private WebElement newCurrencySelectStatus;

    @FindBy(xpath = "//option[contains(.,'Enabled')]")
    private WebElement selectEnabled;

    @FindBy(xpath = "//option[contains(.,'Disa')]")
    private WebElement selectDisabled;

    @FindBy(xpath = "//button[@class = 'btn btn-primary']")
    private WebElement saveCurrencyButton;

    public WebElement getSaveCurrencyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveCurrencyButton));
        return saveCurrencyButton;
    }

    public WebElement getNewCurrencyCode() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencyCode));
        return newCurrencyCode;
    }

    public WebElement getNewCurrencyDecimalPlaces() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencyDecimalPlaces));
        return newCurrencyDecimalPlaces;
    }

    public WebElement getNewCurrencySelectStatus() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencySelectStatus));
        return newCurrencySelectStatus;
    }

    public WebElement getNewCurrencySymbolLeft() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencySymbolLeft));
        return newCurrencySymbolLeft;
    }

    public WebElement getNewCurrencySymbolRight() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencySymbolRight));
        return newCurrencySymbolRight;
    }

    public WebElement getNewCurrencyTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencyTitle));
        return newCurrencyTitle;
    }

    public WebElement getNewCurrencyValue() {
        wait.until(ExpectedConditions.elementToBeClickable(newCurrencyValue));
        return newCurrencyValue;
    }

    public WebElement getSelectDisabled() {
        wait.until(ExpectedConditions.elementToBeClickable(selectDisabled));
        return selectDisabled;
    }

    public WebElement getSelectEnabled() {
        wait.until(ExpectedConditions.elementToBeClickable(selectEnabled));
        return selectEnabled;
    }
}
