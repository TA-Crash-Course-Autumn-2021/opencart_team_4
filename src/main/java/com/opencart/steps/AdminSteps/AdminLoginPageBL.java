package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminLoginPage;
import com.opencart.repository.Admin;
import org.testng.Assert;

public class AdminLoginPageBL {

    private AdminLoginPage adminLoginPage;

    public AdminLoginPageBL() { adminLoginPage = new AdminLoginPage(); }

    public AdminDashboardPageBL loginAdmin() {
        adminLoginPage.getLoginString().clear();
        adminLoginPage.getLoginString().sendKeys(Admin.getLogin());
        adminLoginPage.getPasswordString().clear();
        adminLoginPage.getPasswordString().sendKeys(Admin.getPassword());
        adminLoginPage.getAdminLoginButton().click();
        loginAdminCheck();
        return new AdminDashboardPageBL();
    }


    public AdminDashboardPageBL loginAdminCheck() {
        AdminDashboardPageBL adminDashboardPageBL = new AdminDashboardPageBL();
        String expected = "Dashboard";
        String actual = adminDashboardPageBL.adminDashboardGetTitle();
        Assert.assertTrue(actual.contains(expected), "Error: admin hasn't been logged in");
        return new AdminDashboardPageBL();
    }
}
