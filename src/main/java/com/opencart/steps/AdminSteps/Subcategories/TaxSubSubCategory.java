package com.opencart.steps.AdminSteps.Subcategories;

import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.TaxClassPageBL;
import com.opencart.steps.AdminSteps.TaxRatePageBL;

public class TaxSubSubCategory {

    private AdminNavigationBar adminNavigationBar;

    public TaxSubSubCategory() { adminNavigationBar = new AdminNavigationBar(); }

    public TaxClassPageBL taxClassClick() {
        adminNavigationBar.getTaxClasses().click();
        return new TaxClassPageBL();
    }

    public TaxRatePageBL taxRatesClick() {
        adminNavigationBar.getTaxRates().click();
        return new TaxRatePageBL();
    }
}
