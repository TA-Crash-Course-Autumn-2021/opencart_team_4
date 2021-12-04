package com.opencart.steps.AdminSteps;


import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.Categories.SystemCategories;


public class AdminNavigationBarBL {

    private AdminNavigationBar adminNavigationBar;

    public AdminNavigationBarBL() { adminNavigationBar = new AdminNavigationBar(); }

    public SystemCategories categorySystemClick() {
        adminNavigationBar.getMenuSystem().click();
        return new SystemCategories();
    }
    
     public MarketingCategory categoryMarketingClick() {
        adminNavigationBar.getMenuMarketing().click();
        return new MarketingCategory();
    }
}
