package com.opencart.steps.AdminSteps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.TaxRatesPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Driver;


public class TaxRatePageBL {

    private TaxRatesPage taxRatesPage;

    public TaxRatePageBL() { taxRatesPage = new TaxRatesPage(); }

    public TaxAddRatesPageBL addNewTaxClass() {
        taxRatesPage.getAddNew().click();
        return new TaxAddRatesPageBL();
    }

    public TaxEditRatesBL clickOnTaxEdit() {
        taxRatesPage.getEditTestTax().click();
        return new TaxEditRatesBL();
    }

    public TaxRatePageBL taxRateChangesCheck() {
        String expected = "Success: You have modified tax rates!";
        String actual = taxRatesPage.getTaxRateAlert().getText();
        Assert.assertTrue(actual.contains(expected), "Error: tax rates are not modified");
        return this;
    }
    public TaxRatePageBL deleteTestTax() {
        taxRatesPage.getSelectTestCheckbox().click();
        taxRatesPage.getDelete().click();
        Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 10).until(ExpectedConditions.alertIsPresent()));
        DriverRepository.DRIVERS.get().switchTo().alert().accept();
        return this;
    }
}
