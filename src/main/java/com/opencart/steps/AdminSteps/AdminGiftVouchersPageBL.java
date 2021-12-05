package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminCouponsPage;
import com.opencart.pages.AdminPages.AdminGiftVouchersPage;
import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminGiftVouchersPageBL extends BasePage {

    private AdminGiftVouchersPage adminGiftVouchersPage;

    public AdminGiftVouchersPageBL() { adminGiftVouchersPage = new AdminGiftVouchersPage(); }

    public AdminNewGiftVouchersPageBL clickOnAddNewGiftVouchersButton() {
        adminGiftVouchersPage.getAddNewGiftVoucher().click();
        return new AdminNewGiftVouchersPageBL();
    }
    public AdminNewGiftVouchersPageBL giftVouchersChangeSuccessCheck() {
        String expected = "Success: You have modified vouchers!";
        String actual = adminGiftVouchersPage.getGiftVoucherChangeSuccess().getText().trim();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expected), "Error: vouchers are not modified");
        return new AdminNewGiftVouchersPageBL();
    }

    public AdminNewGiftVouchersPageBL giftVouchersSendSuccess() {
        String expected = "Success: Gift Voucher e-mail has been sent!";
        String actual = adminGiftVouchersPage.getGiftVoucherChangeSuccess().getText().trim();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expected), "Error: vouchers are not sent");
        return new AdminNewGiftVouchersPageBL();
    }



    public AdminGiftVouchersPageBL clickOnDeleteGiftVoucher(String codeDelete){
        int i=1;
        while(true)
        {
            var name= adminGiftVouchersPage.getPathCode(i);
            if(name.contains(codeDelete)) {
                driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr["+i+"]/td[1]")).click();
                break;
            }
            else {
                i++;
            }
        }
        adminGiftVouchersPage.getDeleteGiftVoucher().click();
        adminGiftVouchersPage.giftVoucherAllertDeleteAccept();
        return new AdminGiftVouchersPageBL();

    }

    public AdminEditGiftVouchersPageBL clickOnEditCouponsButton(String codeEdit) {

        int i=1;
        while(true)
        {
            var name= adminGiftVouchersPage.getPathCode(i);
            if(name.contains(codeEdit))
            {
                driver.findElement(By.xpath(" //*[@id=\"form-voucher\"]/div/table/tbody/tr["+i+"]/td[9]/a")).click();
                break;
            }
            else {
                i++;
            }
        }

        return new AdminEditGiftVouchersPageBL();
    }

    public AdminGiftVouchersPageBL clickOnSendCouponsButton(String codeEdit) {

        int i=1;
        while(true)
        {
            var name= adminGiftVouchersPage.getPathCode(i);
            if(name.contains(codeEdit))
            {
                driver.findElement(By.xpath(" //*[@id=\"form-voucher\"]/div/table/tbody/tr["+i+"]/td[1]/input")).click();
                break;
            }
            else {
                i++;
            }
        }
        adminGiftVouchersPage.getSendGiftVoucher().click();
        return new AdminGiftVouchersPageBL();
    }

}
