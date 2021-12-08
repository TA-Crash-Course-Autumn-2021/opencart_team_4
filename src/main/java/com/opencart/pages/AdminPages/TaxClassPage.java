package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TaxClassPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNew;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement delete;

    @FindBy(xpath = "//input[@id = 'input-title']")
    private WebElement taxClassTitle;

    @FindBy(xpath = "//input[@id = 'input-description']")
    private WebElement taxClassDescription;

    @FindBy(xpath = "//i[@class = 'fa fa-plus-circle']/..")
    private WebElement addNewRule;

    @FindBy(xpath = "//i[@class = 'fa fa-save']/..")
    private WebElement saveNewTax;

    @FindBy(xpath = "//input[@placeholder = 'Priority']")
    private WebElement priority;

    @FindBy(xpath = "//option[@value = 'shipping']/..")
    private WebElement basedOnForm;

    @FindBy(xpath = "//option[@value = 'shipping']")
    private WebElement selectBasedOnShipping;

    @FindBy(xpath = "//option[@value = 'payment']")
    private WebElement selectBasedOnPayment;

    @FindBy(xpath = "//option[@value = 'store']")
    private WebElement selectBasedOnStoreAddress;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//input")
    private WebElement selectTestTaxClass;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Succes')]")
    private WebElement taxClassAlert;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editTestClassTax;

    public WebElement getAddNew() {
        wait.until(ExpectedConditions.elementToBeClickable(addNew));
        return addNew;
    }

    public WebElement getDelete() {
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        return delete;
    }

    public WebElement getTaxClassDescription() {
        wait.until(ExpectedConditions.elementToBeClickable(taxClassDescription));
        return taxClassDescription;
    }

    public WebElement getAddNewRule() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewRule));
        return addNewRule;
    }

    public WebElement getBasedOnForm() {
        wait.until(ExpectedConditions.elementToBeClickable(basedOnForm));
        return basedOnForm;
    }

    public WebElement getPriority() {
        wait.until(ExpectedConditions.elementToBeClickable(priority));
        return priority;
    }

    public WebElement getSaveNewTax() {
        wait.until(ExpectedConditions.elementToBeClickable(saveNewTax));
        return saveNewTax;
    }

    public WebElement getSelectBasedOnPayment() {
        wait.until(ExpectedConditions.elementToBeClickable(selectBasedOnPayment));
        return selectBasedOnPayment;
    }

    public WebElement getSelectBasedOnShipping() {
        wait.until(ExpectedConditions.elementToBeClickable(selectBasedOnShipping));
        return selectBasedOnShipping;
    }

    public WebElement getSelectBasedOnStoreAddress() {
        wait.until(ExpectedConditions.elementToBeClickable(selectBasedOnStoreAddress));
        return selectBasedOnStoreAddress;
    }

    public WebElement getTaxClassTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(taxClassTitle));
        return taxClassTitle;
    }

    public WebElement getSelectTestTaxClass() {
        wait.until(ExpectedConditions.elementToBeClickable(selectTestTaxClass));
        return selectTestTaxClass;
    }

    public WebElement getTaxClassAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(taxClassAlert));
        return taxClassAlert;
    }

    public WebElement getEditTestClassTax() {
        wait.until(ExpectedConditions.elementToBeClickable(editTestClassTax));
        return editTestClassTax;
    }
}
