package com.opencart.steps.AdminSteps.Categories;

import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.Subcategories.GiftVouchersSubCategory;
import com.opencart.steps.AdminSteps.Subcategories.LocalisationSubcategory;

public class SalesCategory {

    private AdminNavigationBar adminNavigationBar;

    public SalesCategory() {adminNavigationBar = new AdminNavigationBar(); }

    public GiftVouchersSubCategory clickOnGiftVauchersAll(){
        adminNavigationBar.getGiftVauchersAll().click();
        return new GiftVouchersSubCategory();
    }
    public GiftVouchersSubCategory clickOnGiftVauchersSubCategory(){
        adminNavigationBar.getGiftVauchersSubCategory().click();
        return new GiftVouchersSubCategory();
    }



}
