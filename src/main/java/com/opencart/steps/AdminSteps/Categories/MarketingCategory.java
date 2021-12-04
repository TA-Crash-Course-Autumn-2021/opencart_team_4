package com.opencart.steps.AdminSteps.Categories;

import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.AdminCouponsPageBL;

public class MarketingCategory {
    private AdminNavigationBar adminNavigationBar;

    public MarketingCategory() {adminNavigationBar = new AdminNavigationBar(); }


    public AdminCouponsPageBL clickOnCoupons(){
        adminNavigationBar.getCoupons().click();
        return new AdminCouponsPageBL();
    }

}
