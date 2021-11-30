package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminManufacturerPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement manufacturerName;

    @FindBy(xpath = "//input[@name = 'manufacturer_store[]']")
    private WebElement storesCheckBox;

    @FindBy(xpath = "//input[@id = 'input-sort-order']")
    private WebElement sortOrder;

    @FindBy(xpath = "//a[@href='#tab-seo'][text()='SEO']")
    private WebElement seoButton;

    @FindBy(xpath = "//input[@name= 'manufacturer_seo_url[0][1]']")
    private WebElement keyword;

    @FindBy(xpath = "//i[@class = 'fa fa-save']/..")
    private WebElement saveManufacturerButton;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Success')]")
    private WebElement manufacturerAlert;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editManufacturer;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//input")
    private WebElement selectTestManufacture;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement deleteManufacturer;

    public WebElement getManufacturerName() {
        wait.until(ExpectedConditions.elementToBeClickable(manufacturerName));
        return manufacturerName;
    }

    public WebElement getStoresCheckBox() {
        wait.until(ExpectedConditions.elementToBeClickable(storesCheckBox));
        return storesCheckBox;
    }

    public WebElement getSortOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(sortOrder));
        return sortOrder;
    }

    public WebElement getSeoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(seoButton));
        return seoButton;
    }

    public WebElement getKeyword() {
        wait.until(ExpectedConditions.elementToBeClickable(keyword));
        return keyword;
    }

    public WebElement getSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveManufacturerButton));
        return saveManufacturerButton;
    }

    public WebElement getManufacturerAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(manufacturerAlert));
        return manufacturerAlert;
    }

    public WebElement getEditManufacturerButton() {
        wait.until(ExpectedConditions.elementToBeClickable(editManufacturer));
        return editManufacturer;
    }

    public WebElement getSelectTestManufacture() {
        wait.until(ExpectedConditions.elementToBeClickable(selectTestManufacture));
        return selectTestManufacture;
    }

    public WebElement getDeleteManufacturerButton() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteManufacturer));
        return deleteManufacturer;
    }
}
