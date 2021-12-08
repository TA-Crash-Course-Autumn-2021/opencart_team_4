package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminDashboardPage;

public class AdminDashboardPageBL {

    private AdminDashboardPage adminDashboardPage;

    public AdminDashboardPageBL() {adminDashboardPage = new AdminDashboardPage(); }

    public String adminDashboardGetTitle() {
       return adminDashboardPage.getAdminDashboardTitle().getText();
    }

    public AdminNavigationBarBL getNavigationBar() { return new AdminNavigationBarBL(); }
}
