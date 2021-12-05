package com.opencart.steps.AdminSteps;

import com.opencart.pages.containers.AdminGiftVoucherSettings;

public class AdminEditGiftVouchersPageBL extends AdminNewGiftVouchersPageBL{

    private AdminGiftVoucherSettings adminGiftVoucherSettings;
    public AdminEditGiftVouchersPageBL() { adminGiftVoucherSettings = new AdminGiftVoucherSettings(); }

    public AdminEditGiftVouchersPageBL SetGiftVoucherCode(String title) {
        adminGiftVoucherSettings.getGiftVoucherCode().clear();
        adminGiftVoucherSettings.getGiftVoucherCode().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherFromName(String title) {
        adminGiftVoucherSettings.getGiftVoucherFromName().clear();
        adminGiftVoucherSettings.getGiftVoucherFromName().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherFromEMail(String title) {
        adminGiftVoucherSettings. getGiftVoucherFromEMail().clear();
        adminGiftVoucherSettings.getGiftVoucherFromEMail().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherToName(String title) {
        adminGiftVoucherSettings.getGiftVoucherToName().clear();
        adminGiftVoucherSettings.getGiftVoucherToName().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherToEMail(String title) {
        adminGiftVoucherSettings.getGiftVoucherToEMail().clear();
        adminGiftVoucherSettings.getGiftVoucherToEMail().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherThemeBirthday() {
        adminGiftVoucherSettings.getGiftVoucherThemeBirthday().click();
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherThemeChristmas() {
        adminGiftVoucherSettings.getGiftVoucherThemeChristmas().click();
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherThemeGeneral() {
        adminGiftVoucherSettings.getGiftVoucherThemeGeneral().click();
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherMessage(String title) {
        adminGiftVoucherSettings.getGiftVoucherMessage().clear();
        adminGiftVoucherSettings.getGiftVoucherMessage().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherAmmount(String title) {
        adminGiftVoucherSettings.getGiftVoucherAmount().clear();
        adminGiftVoucherSettings.getGiftVoucherAmount().sendKeys(title);
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherStatusEnabled() {
        adminGiftVoucherSettings.getGiftVoucherStatusEnabled().click();
        return this;
    }

    public AdminEditGiftVouchersPageBL SetGiftVoucherStatusDisabled() {
        adminGiftVoucherSettings.getGiftVoucherStatusDisabled().click();
        return this;
    }

    public AdminEditGiftVouchersPageBL clickButtonSaveNewCoupon() {
        adminGiftVoucherSettings.getGiftVoucherSaveButton().click();
        return this;
    }

    public AdminGiftVouchersPageBL editGiftVouchers() {

        SetGiftVoucherAmmount("15");
        SetGiftVoucherStatusDisabled();
        clickButtonSaveNewCoupon();
        return new AdminGiftVouchersPageBL();
    }
}
