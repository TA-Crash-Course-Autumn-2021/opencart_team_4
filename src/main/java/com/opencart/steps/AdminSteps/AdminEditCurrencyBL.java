package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminNewCurrencyPage;

public class AdminEditCurrencyBL {

    private AdminNewCurrencyPage adminNewCurrencyPage;

    public AdminEditCurrencyBL() { adminNewCurrencyPage = new AdminNewCurrencyPage(); }

    public AdminEditCurrencyBL currencyEditTitle(String newTitle) {
        adminNewCurrencyPage.getNewCurrencyTitle().clear();
        adminNewCurrencyPage.getNewCurrencyTitle().sendKeys(newTitle);
        return this;
    }

     public AdminEditCurrencyBL currencyEditCode(String newCode) {
        adminNewCurrencyPage.getNewCurrencyCode().clear();
        adminNewCurrencyPage.getNewCurrencyCode().sendKeys(newCode);
        return this;
    }

     public AdminEditCurrencyBL currencyEditSymbolLeft(String newSymbolLeft) {
        adminNewCurrencyPage.getNewCurrencySymbolLeft().clear();
        adminNewCurrencyPage.getNewCurrencySymbolLeft().sendKeys(newSymbolLeft);
        return this;
    }

     public AdminEditCurrencyBL currencyEditSymbolRight(String newSymbolRight) {
        adminNewCurrencyPage.getNewCurrencySymbolRight().clear();
        adminNewCurrencyPage.getNewCurrencySymbolRight().sendKeys(newSymbolRight);
        return this;
    }

     public AdminEditCurrencyBL currencyEditDecimalPlaces(String newDecimalPlaces) {
        adminNewCurrencyPage.getNewCurrencyDecimalPlaces().clear();
        adminNewCurrencyPage.getNewCurrencyDecimalPlaces().sendKeys(newDecimalPlaces);
        return this;
    }

     public AdminEditCurrencyBL currencyEditValue(String newValue) {
         adminNewCurrencyPage.getNewCurrencyValue().clear();
         adminNewCurrencyPage.getNewCurrencyValue().sendKeys(newValue);
        return this;
    }

     public AdminEditCurrencyBL currencyEditSetEnabled() {
        adminNewCurrencyPage.getNewCurrencySelectStatus().click();
        adminNewCurrencyPage.getSelectEnabled().click();
        return this;
    }

    public AdminEditCurrencyBL currencyEditSetDisabled() {
        adminNewCurrencyPage.getNewCurrencySelectStatus().click();
        adminNewCurrencyPage.getSelectDisabled().click();
        return this;
    }


}
