package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.TaxRatesPage;

public class TaxEditRatesBL {

    private TaxAddRatesPageBL taxAddRatesPageBL;

    public TaxEditRatesBL() { taxAddRatesPageBL = new TaxAddRatesPageBL(); }

    public TaxEditRatesBL editTaxName(String newTaxName) {
        taxAddRatesPageBL.setTaxName(newTaxName);
        return this;
    }

     public TaxEditRatesBL editTaxRate(String newTaxRate) {
        taxAddRatesPageBL.setTaxRate(newTaxRate);
        return this;
    }

    public TaxEditRatesBL saveEditedChanges() {
        taxAddRatesPageBL.clickOnSaveButton();
        return this;
    }

    public TaxRatePageBL changeTestTaxRate() {
        editTaxName("EditedTaxName");
        editTaxRate("666");
        saveEditedChanges();
        return new TaxRatePageBL();
    }
}
