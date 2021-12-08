package com.opencart.steps.AdminSteps;


public class TaxEditClassPageBL {

    private TaxAddClassPageBL taxAddClassPageBL;

    public TaxEditClassPageBL() { taxAddClassPageBL = new TaxAddClassPageBL(); }

    public TaxEditClassPageBL editTaxName(String newName){
        taxAddClassPageBL.setTaxClassName(newName);
        return this;
    }

    public TaxEditClassPageBL editTaxDescription(String newDescription) {
        taxAddClassPageBL.setTaxClassDescription(newDescription);
        return this;
    }

    public TaxEditClassPageBL saveChanges() {
        taxAddClassPageBL.clickOnSaveButton();
        return this;
    }

    public TaxClassPageBL editChangesCheck() {
        TaxAddClassPageBL taxAddClassPageBL = new TaxAddClassPageBL();
        taxAddClassPageBL.taxClassChangesCheck();
        return new TaxClassPageBL();
    }

    public TaxEditClassPageBL editTestTax() {
        editTaxName("NewTestName");
        editTaxDescription("Edited");
        saveChanges();
        return this;
    }
}
