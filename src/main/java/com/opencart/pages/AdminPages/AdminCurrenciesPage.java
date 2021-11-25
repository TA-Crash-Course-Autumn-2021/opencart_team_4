package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminCurrenciesPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNewCurrency;

    @FindBy(xpath = "//i[@class = 'fa fa fa-refresh']/..")
    private WebElement refreshCurrencies;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement deleteCurrency;

    @FindBy(xpath = "//td[contains(.,'Hry')]/..//input")
    private WebElement selectHryvnia;

    public WebElement getSelectHryvnia() {
        wait.until(ExpectedConditions.elementToBeClickable(selectHryvnia));
        return selectHryvnia;
    }

    public WebElement getAddNewCurrency() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewCurrency));
        return addNewCurrency;
    }

    public WebElement getRefreshCurrencies() {
        wait.until(ExpectedConditions.elementToBeClickable(refreshCurrencies));
        return refreshCurrencies;
    }

    public WebElement getDeleteCurrency() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteCurrency));
        return deleteCurrency;
    }
}
