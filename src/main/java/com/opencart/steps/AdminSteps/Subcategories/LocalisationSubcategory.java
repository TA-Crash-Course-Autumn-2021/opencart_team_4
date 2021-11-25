package com.opencart.steps.AdminSteps.Subcategories;

import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.AdminCurrenciesPageBL;
import com.opencart.steps.AdminSteps.AdminLoginPageBL;

public class LocalisationSubcategory {

    private AdminNavigationBar adminNavigationBar;

    public LocalisationSubcategory() { adminNavigationBar = new AdminNavigationBar(); }

    public AdminCurrenciesPageBL clickOnCurrencies() {
        adminNavigationBar.getCurrecncies().click();
        return new AdminCurrenciesPageBL();
    }
}
