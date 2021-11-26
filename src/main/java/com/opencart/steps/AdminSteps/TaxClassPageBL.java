package com.opencart.steps.AdminSteps;


import com.opencart.pages.AdminPages.TaxClassPage;

public class TaxClassPageBL {

    private TaxClassPage taxClassPage;

    public TaxClassPageBL() { taxClassPage = new TaxClassPage(); }

    public TaxAddClassPageBL clickOnAddNew() {
        taxClassPage.getAddNew().click();
        return new TaxAddClassPageBL();
    }

    public TaxEditClassPageBL deleteTestTax() {
        taxClassPage.getSelectTestTaxClass().click();
        taxClassPage.getDelete().click();
        return new TaxEditClassPageBL();
    }

    public TaxEditClassPageBL clickOnTestEdit() {
        taxClassPage.getSelectTestTaxClass().click();
        return new TaxEditClassPageBL();
    }
}
