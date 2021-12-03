package com.opencart.steps.AdminSteps;

import com.opencart.enums.Currencies;
import com.opencart.pages.AdminPages.AdminNewCurrencyPage;

public class AdminNewCurrencyBL {

    private AdminNewCurrencyPage adminNewCurrencyPage;

    public AdminNewCurrencyBL() { adminNewCurrencyPage = new AdminNewCurrencyPage(); }

    public AdminNewCurrencyBL currencySetTitle(String title) {
        adminNewCurrencyPage.getNewCurrencyTitle().clear();
        adminNewCurrencyPage.getNewCurrencyTitle().sendKeys(title);
        return this;
    }

    public AdminNewCurrencyBL currencySetCode(String code) {
        adminNewCurrencyPage.getNewCurrencyCode().clear();
        adminNewCurrencyPage.getNewCurrencyCode().sendKeys(code);
        return this;
    }

    public AdminNewCurrencyBL currencySetSymbolLeft(String symbolLeft) {
        adminNewCurrencyPage.getNewCurrencySymbolLeft().clear();
        adminNewCurrencyPage.getNewCurrencySymbolLeft().sendKeys(symbolLeft);
        return this;
    }

    public AdminNewCurrencyBL currencySetSymbolRight(String symbolRight) {
        adminNewCurrencyPage.getNewCurrencySymbolRight().clear();
        adminNewCurrencyPage.getNewCurrencySymbolRight().sendKeys(symbolRight);
        return this;
    }

    public AdminNewCurrencyBL currencySetDecimalPlaces(String decimalPlaces) {
        adminNewCurrencyPage.getNewCurrencyDecimalPlaces().clear();
        adminNewCurrencyPage.getNewCurrencyDecimalPlaces().sendKeys(decimalPlaces);
        return this;
    }

    public AdminNewCurrencyBL currencySetValue(String value) {
        adminNewCurrencyPage.getNewCurrencyValue().clear();
        adminNewCurrencyPage.getNewCurrencyValue().sendKeys(value);
        return this;
    }

    public AdminNewCurrencyBL selectCurrencyEnabledStatus() {
        adminNewCurrencyPage.getNewCurrencySelectStatus().click();
        adminNewCurrencyPage.getSelectEnabled().click();
        return this;
    }

    public AdminNewCurrencyBL selectCurrencyDisabledStatus() {
        adminNewCurrencyPage.getNewCurrencySelectStatus().click();
        adminNewCurrencyPage.getSelectDisabled().click();
        return this;
    }

    public AdminNewCurrencyBL clickOnCurrencySaveButton() {
        adminNewCurrencyPage.getSaveCurrencyButton().click();
        return this;
    }

    public AdminNewCurrencyBL createHryvniaCurrency() {
        currencySetTitle("Ukraine Hryvnia");
        currencySetCode(Currencies.HRYVNIA.getCurrency());
        currencySetSymbolLeft("₴");
        currencySetSymbolRight("");
        currencySetDecimalPlaces("2");
        currencySetValue("27.026526");
        selectCurrencyEnabledStatus();
        clickOnCurrencySaveButton();
        return this;
    }
}
