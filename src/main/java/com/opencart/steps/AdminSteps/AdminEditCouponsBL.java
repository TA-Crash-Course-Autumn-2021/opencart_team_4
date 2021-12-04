package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminCouponsPage;
import com.opencart.pages.containers.AdminCouponSettings;
import com.opencart.steps.CartPageBL;
import org.testng.Assert;

public class AdminEditCouponsBL {

    private AdminCouponSettings adminEditCouponsPage;
    private AdminCouponsPage adminCouponsPage;

    public AdminEditCouponsBL() { adminEditCouponsPage = new AdminCouponSettings(); }

    public AdminEditCouponsBL clickCouponsStatusEnabled() {
        adminEditCouponsPage.getCouponsAddStatusEnabled().click();
        return this;
    }

    public AdminEditCouponsBL clickCouponsStatusDisabled() {
        adminEditCouponsPage.getCouponsAddStatusDisabled().click();
        return this;
    }
    public AdminEditCouponsBL clickButtonSaveNewCoupon() {
        adminEditCouponsPage.getButtonSaveNewCoupon().click();
        return this;
    }

    public AdminCouponsPageBL editCouponDisabled() {
        clickCouponsStatusDisabled();
        clickButtonSaveNewCoupon();
        return new AdminCouponsPageBL();
    }



}
