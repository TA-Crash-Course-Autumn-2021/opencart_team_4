package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminLoginPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-username']")
    private WebElement loginString;

    @FindBy(xpath = "//input[@id = 'input-password']")
    private WebElement passwordString;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement adminLoginButton;

    public WebElement getAdminLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(adminLoginButton));
        return adminLoginButton; }

    public WebElement getLoginString() {
        wait.until(ExpectedConditions.elementToBeClickable(loginString));
        return loginString;
    }

    public WebElement getPasswordString() {
        wait.until(ExpectedConditions.elementToBeClickable(passwordString));
        return passwordString;
    }
}
