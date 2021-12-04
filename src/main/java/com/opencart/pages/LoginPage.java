package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage{

    @FindBy(xpath = "//a[text() = 'Continue']")
    private WebElement loginPageContinueCreateAccount;

    @FindBy(xpath = "//input[@id = 'input-email']")
    private WebElement loginPageSetEmail;

    @FindBy(xpath = "//input[@id = 'input-password']")
    private WebElement loginPageSetPassword;

    @FindBy(xpath = "//div[@class = 'form-group']/a")
    private WebElement loginPageForgottenPass;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement loginPageLoginButton;

    @FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible']")
    private WebElement unsuccessfulLoginAlert;

    public WebElement getLoginPageContinueCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPageContinueCreateAccount));
        return loginPageContinueCreateAccount;
    }

    public WebElement getLoginPageLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPageLoginButton));
        return loginPageLoginButton;
    }

    public WebElement getLoginPageForgottenPass() {
        return loginPageForgottenPass;
    }

    public WebElement getLoginPageSetEmail() {
        return loginPageSetEmail;
    }

    public WebElement getLoginPageSetPassword() {
        return loginPageSetPassword;
    }

    public WebElement getUnsuccessfulLoginAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(unsuccessfulLoginAlert));
        return unsuccessfulLoginAlert;
    }
}