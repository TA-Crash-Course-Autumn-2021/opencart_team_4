package com.opencart.steps.AdminSteps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.AdminCouponsPage;
import com.opencart.pages.AdminPages.AdminCurrenciesPage;
import com.opencart.pages.BasePage;
import com.opencart.steps.CartPageBL;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminCouponsPageBL extends BasePage {
    private AdminCouponsPage adminCouponsPage;

    public AdminCouponsPageBL() { adminCouponsPage = new AdminCouponsPage(); }



    public AdminEditCouponsBL clickOnEditCouponsButton(String codeEdit) {

        int i=1;
        while(true)
        {
            var name= adminCouponsPage.getPathCode(i);
            if(name.contains(codeEdit))
            {
                driver.findElement(By.xpath(" //*[@id=\"form-coupon\"]/div/table/tbody/tr["+i+"]/td[8]/a")).click();
                break;
            }
            else {
                i++;
            }
        }

        return new AdminEditCouponsBL();
    }
    public AdminCouponsPageBL clickOnDeleteCoupons(String codeDelete){
        int i=1;
        while(true)
        {
           var name= adminCouponsPage.getPathCode(i);
           if(name.contains(codeDelete))
            {

                driver.findElement(By.xpath(" //*[@id=\"form-coupon\"]/div/table/tbody/tr["+i+"]/td[1]/input")).click();
                break;

            }else {
               i++;
           }
        }
        adminCouponsPage.getDeleteCoupons().click();
        adminCouponsPage.couponAllertDeleteAccept();
        return new AdminCouponsPageBL();

    }
    public AdminNewCouponsBL clickOnAddNewCouponsButton() {
        adminCouponsPage.getAddNewCoupons().click();
        return new AdminNewCouponsBL();
    }
    public AdminCouponsPageBL couponDeleteSuccessCheck() {
        String expected = "Success: You have modified coupons!";
        String actual = adminCouponsPage.getCouponDeleteSuccess().getText().trim();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expected), "Error: coupons are not modified");
        return new AdminCouponsPageBL();
    }
    public AdminCouponsPageBL couponEditSuccessCheck() {
        String expected = "Success: You have modified coupons!";
        String actual = adminCouponsPage.getCouponAlertEditSuccess().getText().trim();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expected), "Error: coupons are not modified");
        return new AdminCouponsPageBL();
    }








}
