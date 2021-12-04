package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminNewCouponsPage;
import com.opencart.pages.AdminPages.AdminNewCurrencyPage;
import com.opencart.pages.containers.AdminCouponSettings;
import org.testng.Assert;

public class AdminNewCouponsBL {
    private AdminCouponSettings adminNewCouponsPage;
    public AdminNewCouponsBL() { adminNewCouponsPage = new AdminCouponSettings(); }


    public AdminNewCouponsBL SetCouponName(String title) {
        adminNewCouponsPage.getCouponsAddCouponsName().clear();
        adminNewCouponsPage.getCouponsAddCouponsName().sendKeys(title);
        return this;
    }

    public AdminNewCouponsBL SetCouponCode(String code) {
        adminNewCouponsPage.getCouponsAddCode().clear();
        adminNewCouponsPage.getCouponsAddCode().sendKeys(code);
        return this;
    }
    public AdminNewCouponsBL selectCouponTypePercentage() {
        adminNewCouponsPage.getCouponsAddType().click();
        adminNewCouponsPage.getCouponsAddTypePercentage().click();
        return this;
    }

    public AdminNewCouponsBL selectCouponTypeFixedAmount() {
        adminNewCouponsPage.getCouponsAddType().click();
        adminNewCouponsPage.getCouponsAddTypeFixedAmount().click();
        return this;
    }

    public AdminNewCouponsBL SetCouponDiscount(String code) {
        adminNewCouponsPage.getCouponsAddDiscount().clear();
        adminNewCouponsPage.getCouponsAddDiscount().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL SetCouponTotalAmount(String code) {
        adminNewCouponsPage.getCouponsAddTotalAmount().clear();
        adminNewCouponsPage.getCouponsAddTotalAmount().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL clickCouponsCustomerLoginYes() {
        adminNewCouponsPage.getCouponsAddCustomerLoginYes().click();
        return this;
    }
    public AdminNewCouponsBL clickCouponsCustomerLoginNo() {
        adminNewCouponsPage.getCouponsAddCustomerLoginNo().click();
        return this;
    }
    public AdminNewCouponsBL clickCouponsFreeShippingYes() {
        adminNewCouponsPage.getCouponsAddFreeShippingYes().click();
        return this;
    }

    public AdminNewCouponsBL clickCouponsFreeShippingNo() {
        adminNewCouponsPage.getCouponsAddFreeShippingNo().click();
        return this;
    }

    public AdminNewCouponsBL SetCouponProducts(String code) {
        adminNewCouponsPage.getCouponsAddProducts().clear();
        adminNewCouponsPage.getCouponsAddProducts().sendKeys(code);
        return this;
    }
    public AdminNewCouponsBL SetCouponCategory(String code) {
        adminNewCouponsPage.getCouponsAddCategory().clear();
        adminNewCouponsPage.getCouponsAddCategory().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL SetCouponDateStart(String code) {
        adminNewCouponsPage.getCouponsAddDateStart().clear();
        adminNewCouponsPage.getCouponsAddDateStart().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL SetCouponDateEnd(String code) {
        adminNewCouponsPage.getCouponsAddDateEnd().clear();
        adminNewCouponsPage.getCouponsAddDateEnd().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL SetCouponUserPerCoupon(String code) {
        adminNewCouponsPage.getCouponsAddUsesPerCoupon().clear();
        adminNewCouponsPage.getCouponsAddUsesPerCoupon().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL SetCouponUserPerCustomer(String code) {
        adminNewCouponsPage.getCouponsAddUsesPerCustomer().clear();
        adminNewCouponsPage.getCouponsAddUsesPerCustomer().sendKeys(code);
        return this;
    }

    public AdminNewCouponsBL clickCouponsStatusEnabled() {
        adminNewCouponsPage.getCouponsAddStatusEnabled().click();
        return this;
    }

    public AdminNewCouponsBL clickCouponsStatusDisabled() {
        adminNewCouponsPage.getCouponsAddStatusDisabled().click();
        return this;
    }

    public AdminNewCouponsBL clickButtonSaveNewCoupon() {
        adminNewCouponsPage.getButtonSaveNewCoupon().click();
        return this;
    }

    public AdminNewCouponsBL createNew0001CouponForAllProducts() {
        SetCouponName("Sale. All -5%");
        SetCouponCode("0001");
        selectCouponTypePercentage();
        SetCouponDiscount("5");
        SetCouponTotalAmount("100");
        clickCouponsCustomerLoginNo();
        clickCouponsFreeShippingYes();
        SetCouponDateStart("2021-11-29");
        SetCouponDateEnd("2022-11-10");
        SetCouponUserPerCoupon("5");
        SetCouponUserPerCustomer("50");
        clickCouponsStatusEnabled();
        clickButtonSaveNewCoupon();
        return this;
    }






}
