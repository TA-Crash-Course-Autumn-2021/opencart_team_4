package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    @Getter
public class LoginPage {

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
}