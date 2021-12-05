package com.opencart.steps.AdminSteps;

import com.opencart.pages.containers.AdminGiftVoucherSettings;

import javax.sound.midi.ShortMessage;

public class AdminNewGiftVouchersPageBL {
    private AdminGiftVoucherSettings adminGiftVoucherSettings;
    public AdminNewGiftVouchersPageBL() { adminGiftVoucherSettings = new AdminGiftVoucherSettings(); }

    public AdminNewGiftVouchersPageBL SetGiftVoucherCode(String title) {
        adminGiftVoucherSettings.getGiftVoucherCode().clear();
        adminGiftVoucherSettings.getGiftVoucherCode().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherFromName(String title) {
        adminGiftVoucherSettings.getGiftVoucherFromName().clear();
        adminGiftVoucherSettings.getGiftVoucherFromName().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherFromEMail(String title) {
        adminGiftVoucherSettings. getGiftVoucherFromEMail().clear();
        adminGiftVoucherSettings.getGiftVoucherFromEMail().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherToName(String title) {
        adminGiftVoucherSettings.getGiftVoucherToName().clear();
        adminGiftVoucherSettings.getGiftVoucherToName().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherToEMail(String title) {
        adminGiftVoucherSettings.getGiftVoucherToEMail().clear();
        adminGiftVoucherSettings.getGiftVoucherToEMail().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherThemeBirthday() {
        adminGiftVoucherSettings.getGiftVoucherThemeBirthday().click();
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherThemeChristmas() {
        adminGiftVoucherSettings.getGiftVoucherThemeChristmas().click();
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherThemeGeneral() {
        adminGiftVoucherSettings.getGiftVoucherThemeGeneral().click();
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherMessage(String title) {
        adminGiftVoucherSettings.getGiftVoucherMessage().clear();
        adminGiftVoucherSettings.getGiftVoucherMessage().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherAmmount(String title) {
        adminGiftVoucherSettings.getGiftVoucherAmount().clear();
        adminGiftVoucherSettings.getGiftVoucherAmount().sendKeys(title);
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherStatusEnabled() {
        adminGiftVoucherSettings.getGiftVoucherStatusEnabled().click();
        return this;
    }

    public AdminNewGiftVouchersPageBL SetGiftVoucherStatusDisabled() {
        adminGiftVoucherSettings.getGiftVoucherStatusDisabled().click();
        return this;
    }

    public AdminNewGiftVouchersPageBL clickButtonSaveNewCoupon() {
        adminGiftVoucherSettings.getGiftVoucherSaveButton().click();
        return this;
    }

    public AdminGiftVouchersPageBL createNew0001GiftVouchers() {
        SetGiftVoucherCode("0001");
        SetGiftVoucherFromName("Shop`s Admin");
        SetGiftVoucherFromEMail("opencarta@gmail.com");
        SetGiftVoucherToName("Anna");
        SetGiftVoucherToEMail("acc@gmail.com");
        SetGiftVoucherThemeBirthday();
        SetGiftVoucherMessage("Happy BD! ");
        SetGiftVoucherAmmount("10");
        SetGiftVoucherStatusEnabled();
        clickButtonSaveNewCoupon();

        return new AdminGiftVouchersPageBL();
    }
}
