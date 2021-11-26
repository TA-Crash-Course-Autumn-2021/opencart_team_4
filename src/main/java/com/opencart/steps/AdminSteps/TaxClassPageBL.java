package com.opencart.steps.AdminSteps;


import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.TaxClassPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class TaxClassPageBL {

    private TaxClassPage taxClassPage;

    public TaxClassPageBL() { taxClassPage = new TaxClassPage(); }

    public TaxAddClassPageBL clickOnAddNew() {
        taxClassPage.getAddNew().click();
        return new TaxAddClassPageBL();
    }

    public TaxClassPageBL deleteTestTax() {
        taxClassPage.getSelectTestTaxClass().click();
        taxClassPage.getDelete().click();
        Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 10).until(ExpectedConditions.alertIsPresent()));
        DriverRepository.DRIVERS.get().switchTo().alert().accept();
        return this;
    }

    public TaxEditClassPageBL clickOnTestEdit() {
        taxClassPage.getEditTestClassTax().click();
        return new TaxEditClassPageBL();
    }

    public TaxClassPageBL taxClassChangesCheck() {
        TaxAddClassPageBL taxAddClassPageBL = new TaxAddClassPageBL();
        taxAddClassPageBL.taxClassChangesCheck();
        return this;
    }
}
