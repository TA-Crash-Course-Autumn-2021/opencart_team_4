package com.opencart.steps;

import com.opencart.pages.LogoutPage;

public class LogoutPageBL {

    private LogoutPage logoutPage;

    public LogoutPageBL() { logoutPage = new LogoutPage(); }

    public HomePageBL clickOnContinueButton() {
        logoutPage.getLogoutPageContinueButton().click();
        return new HomePageBL();
    }
}
