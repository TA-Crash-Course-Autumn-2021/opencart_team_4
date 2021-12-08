package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.TaxClassPage;
import org.testng.Assert;

public class TaxAddClassPageBL {

    private TaxClassPage taxClassPage;

    public TaxAddClassPageBL() { taxClassPage = new TaxClassPage(); }

    public TaxAddClassPageBL addNewClass() {
        taxClassPage.getAddNew().click();
        return this;
    }

    public TaxAddClassPageBL setTaxClassName(String taxClassName) {
        taxClassPage.getTaxClassTitle().clear();
        taxClassPage.getTaxClassTitle().sendKeys(taxClassName);
        return this;
    }

    public TaxAddClassPageBL setTaxClassDescription(String taxClassDescription) {
        taxClassPage.getTaxClassDescription().clear();
        taxClassPage.getTaxClassDescription().sendKeys(taxClassDescription);
        return this;
    }

    public TaxAddClassPageBL setPriority(String priorityNumber) {
        taxClassPage.getPriority().clear();
        taxClassPage.getPriority().sendKeys(priorityNumber);
        return this;
    }

    public TaxAddClassPageBL addRuleClick() {
        taxClassPage.getAddNewRule().click();
        return this;
    }

    public TaxAddClassPageBL selectBasedOnShipping() {
        taxClassPage.getBasedOnForm().click();
        taxClassPage.getSelectBasedOnShipping().click();
        return this;
    }

    public TaxAddClassPageBL selectBasedOnPayment() {
        taxClassPage.getBasedOnForm().click();
        taxClassPage.getSelectBasedOnPayment().click();
        return this;
    }

    public TaxAddClassPageBL selectBasedOnStore() {
        taxClassPage.getBasedOnForm().click();
        taxClassPage.getSelectBasedOnStoreAddress().click();
        return this;
    }

    public TaxClassPageBL clickOnSaveButton() {
        taxClassPage.getSaveNewTax().click();
        return new TaxClassPageBL();
    }

    public TaxClassPageBL taxClassChangesCheck() {
        String expected = "Success: You have modified tax classes!";
        String actual = taxClassPage.getTaxClassAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected), "Error: tax rates are not modified");
        return new TaxClassPageBL();
    }

    public TaxAddClassPageBL createTestClassTax() {
        setTaxClassName("TestClass");
        setTaxClassDescription("TestDescription");
        addRuleClick();
        setPriority("2");
        selectBasedOnPayment();
        clickOnSaveButton();
        return this;
    }
}
