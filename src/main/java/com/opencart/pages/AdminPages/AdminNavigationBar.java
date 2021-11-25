package com.opencart.pages.AdminPages;


import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminNavigationBar extends BasePage {

    @FindBy(xpath = "//li[@id = 'menu-system']")
    private WebElement menuSystem;

    @FindBy(xpath = "//a[contains(.,'Localisa')]")
    private WebElement localisationSubCategory;

    @FindBy(xpath = "//a[contains(.,'Currenc')]")
    private WebElement currecncies;

    @FindBy(xpath = "//ul[@id = 'collapse-7-2-9']/../a")
    private WebElement taxesSubCategory;

    @FindBy(xpath = "//ul[@id = 'collapse-7-2-9']//a[text() = 'Tax Classes']")
    private WebElement taxClasses;

    @FindBy(xpath = "//ul[@id = 'collapse-7-2-9']//a[text() = 'Tax Rates']")
    private WebElement taxRates;

    public WebElement getMenuSystem() {
        wait.until(ExpectedConditions.visibilityOfAllElements(menuSystem));
        return menuSystem;
    }

    public WebElement getLocalisationSubCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(localisationSubCategory));
        return localisationSubCategory;
    }

    public WebElement getCurrecncies() {
        wait.until(ExpectedConditions.elementToBeClickable(currecncies));
        return currecncies;
    }

    public WebElement getTaxesSubCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(taxesSubCategory));
        return taxesSubCategory;
    }

    public WebElement getTaxClasses() {
        wait.until(ExpectedConditions.elementToBeClickable(taxClasses));
        return taxClasses;
    }

    public WebElement getTaxRates() {
        wait.until(ExpectedConditions.elementToBeClickable(taxRates));
        return taxRates;
    }
}
