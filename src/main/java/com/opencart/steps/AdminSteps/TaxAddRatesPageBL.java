package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.TaxRatesPage;
import org.testng.Assert;

public class TaxAddRatesPageBL {

    private TaxRatesPage taxRatesPage;

    public TaxAddRatesPageBL() { taxRatesPage = new TaxRatesPage(); }

    public TaxAddRatesPageBL setTaxName(String taxName){
        taxRatesPage.getAddTaxName().clear();
        taxRatesPage.getAddTaxName().sendKeys(taxName);
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL setTaxRate(String taxRate){
        taxRatesPage.getAddTaxRate().clear();
        taxRatesPage.getAddTaxRate().sendKeys(taxRate);
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL selectPercentageType() {
        taxRatesPage.getTypeForm().click();
        taxRatesPage.getTypePercentage().click();
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL selectFixedAmountType() {
        taxRatesPage.getTypeForm().click();
        taxRatesPage.getTypeFixedAmount().click();
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL selectDefault() {
        taxRatesPage.getCheckboxDefault().click();
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL selectUKShipping() {
        taxRatesPage.getGeoZoneForm().click();
        taxRatesPage.getUkShipping().click();
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL selectVATZone() {
        taxRatesPage.getGeoZoneForm().click();
        taxRatesPage.getUkVATZone().click();
        return new TaxAddRatesPageBL();
    }

    public TaxAddRatesPageBL clickOnSaveButton() {
        taxRatesPage.getSaveNewRateTax().click();
        return this;
    }

    public TaxRatePageBL newTestTaxRate() {
        setTaxName("Testtax");
        setTaxRate("6666");
        selectPercentageType();
        selectDefault();
        selectUKShipping();
        clickOnSaveButton();
        return new TaxRatePageBL();
    }
}
