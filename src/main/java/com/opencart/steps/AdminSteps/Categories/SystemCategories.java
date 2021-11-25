package com.opencart.steps.AdminSteps.Categories;

import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.Subcategories.LocalisationSubcategory;

public class SystemCategories {

    private AdminNavigationBar adminNavigationBar;

    public SystemCategories() {adminNavigationBar = new AdminNavigationBar(); }

    public LocalisationSubcategory clickOnLocalisation() {
        adminNavigationBar.getLocalisationSubCategory().click();
        return new LocalisationSubcategory();
    }
}
