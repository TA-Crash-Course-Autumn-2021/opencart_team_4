package com.opencart.pages.AdminPages;


import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminDashboardPage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement adminDashboardTitle;

    public WebElement getAdminDashboardTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboardTitle));
        return adminDashboardTitle;
    }
}
