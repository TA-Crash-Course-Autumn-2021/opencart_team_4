package com.opencart.steps.AdminSteps.Subcategories;

import com.opencart.pages.AdminPages.AdminGiftVouchersPage;
import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.AdminCurrenciesPageBL;
import com.opencart.steps.AdminSteps.AdminGiftVouchersPageBL;

public class GiftVouchersSubCategory {

    private AdminNavigationBar adminNavigationBar;

    public GiftVouchersSubCategory() { adminNavigationBar = new AdminNavigationBar(); }

    
    public AdminGiftVouchersPageBL clickOnGiftVauchersSubCategory() {
        adminNavigationBar.getGiftVauchersSubCategory().click();
        return new AdminGiftVouchersPageBL();
    }

}
