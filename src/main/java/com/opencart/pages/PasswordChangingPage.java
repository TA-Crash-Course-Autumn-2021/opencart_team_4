package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    @Getter
public class PasswordChangingPage extends BasePage {

    @FindBy(id = "input-password")
    private WebElement changePasswordString;

    @FindBy(id = "input-confirm")
    private WebElement changePasswordConfirmString;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement changePasswordContinueButton;

    @FindBy(xpath = "//div/a[text() = 'Back']")
    private WebElement changePasswordBackButton;

    @FindBy(xpath = "//i[@class = 'fa fa-check-circle']")
    private WebElement successLoginAlert;
}
