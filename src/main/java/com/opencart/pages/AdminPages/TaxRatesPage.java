package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TaxRatesPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNew;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement delete;

    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement addTaxName;

    @FindBy(xpath = "//input[@id = 'input-rate']")
    private WebElement addTaxRate;

    @FindBy(xpath = "//select[@id = 'input-type']")
    private WebElement typeForm;

    @FindBy(xpath = "//option[@value = 'P']")
    private WebElement typePercentage;

    @FindBy(xpath = "//option[@value = 'F']")
    private WebElement typeFixedAmount;

    @FindBy(xpath = "//input[@value = '1']")
    private WebElement checkboxDefault;

    @FindBy(xpath = "//select[@name = 'geo_zone_id']")
    private WebElement geoZoneForm;

    @FindBy(xpath = "//option[@value = '4']")
    private WebElement ukShipping;

    @FindBy(xpath = "//option[@value = '3']")
    private WebElement ukVATZone;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement taxRateAlert;

    @FindBy(xpath = "//button[@form = 'form-tax-rate']")
    private WebElement saveNewRateTax;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editTestTax;

    @FindBy(xpath = "//td[contains(.,'EditedTaxName')]/..//input")
    private WebElement selectTestCheckbox;

    public WebElement getAddNew() {
        wait.until(ExpectedConditions.elementToBeClickable(addNew));
        return addNew;
    }

    public WebElement getDelete() {
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        return delete;
    }

    public WebElement getAddTaxName() {
        wait.until(ExpectedConditions.elementToBeClickable(addTaxName));
        return addTaxName;
    }

    public WebElement getAddTaxRate() {
        wait.until(ExpectedConditions.elementToBeClickable(addTaxRate));
        return addTaxRate;
    }

    public WebElement getTypeForm() {
        wait.until(ExpectedConditions.elementToBeClickable(typeForm));
        return typeForm;
    }

    public WebElement getTypeFixedAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(typeFixedAmount));
        return typeFixedAmount;
    }

    public WebElement getCheckboxDefault() {
        wait.until(ExpectedConditions.elementToBeClickable(checkboxDefault));
        return checkboxDefault;
    }

    public WebElement getGeoZoneForm() {
        wait.until(ExpectedConditions.elementToBeClickable(geoZoneForm));
        return geoZoneForm;
    }

    public WebElement getTypePercentage() {
        wait.until(ExpectedConditions.elementToBeClickable(typePercentage));
        return typePercentage;
    }

    public WebElement getUkShipping() {
        wait.until(ExpectedConditions.elementToBeClickable(ukShipping));
        return ukShipping;
    }

    public WebElement getUkVATZone() {
        wait.until(ExpectedConditions.elementToBeClickable(ukVATZone));
        return ukVATZone;
    }

    public WebElement getTaxRateAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(taxRateAlert));
        return taxRateAlert;
    }

    public WebElement getSaveNewRateTax() {
        wait.until(ExpectedConditions.elementToBeClickable(saveNewRateTax));
        return saveNewRateTax;
    }

    public WebElement getEditTestTax() {
        wait.until(ExpectedConditions.elementToBeClickable(editTestTax));
        return editTestTax;
    }

    public WebElement getSelectTestCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(selectTestCheckbox));
        return selectTestCheckbox;
    }
}