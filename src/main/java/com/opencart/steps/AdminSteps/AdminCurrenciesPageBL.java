package com.opencart.steps.AdminSteps;


import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.AdminCurrenciesPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class AdminCurrenciesPageBL {
    
    private AdminCurrenciesPage adminCurrenciesPage;
    
    public AdminCurrenciesPageBL() { adminCurrenciesPage = new AdminCurrenciesPage(); }
    
    public AdminCurrenciesPageBL clickOnRefreshCurrencies() {
        adminCurrenciesPage.getRefreshCurrencies().click();
        return this;
    }

    public AdminCurrenciesPageBL clickOnDeleteCurrency(){
        adminCurrenciesPage.getDeleteCurrency().click();
        return this;
    }

    public AdminNewCurrencyBL addNewCurrencyClick() {
        adminCurrenciesPage.getAddNewCurrency().click();
        return new AdminNewCurrencyBL();
    }

    public AdminEditCurrencyBL clickOnEditCurrencyButton() {
        adminCurrenciesPage.getEditCurrency().click();
        return new AdminEditCurrencyBL();
    }

    public AdminNewCurrencyBL deleteHryvniaCurrency() {
        adminCurrenciesPage.getSelectHryvnia().click();
        adminCurrenciesPage.getDeleteCurrency().click();
        Alert alert = ( new WebDriverWait(DriverRepository.DRIVERS.get(), 10).until(ExpectedConditions.alertIsPresent()));
        DriverRepository.DRIVERS.get().switchTo().alert().accept();
        return new AdminNewCurrencyBL();
    }
}
