package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(xpath = "//div[@class = 'container']//div[contains( .,'Your password')]")
    private WebElement successLoginAlert;

    @FindBy(xpath = "//div[@class = 'text-danger']")
    private WebElement passMatchError;

    public WebElement getChangePasswordString() {
        wait.until(ExpectedConditions.visibilityOf(changePasswordString));
        return changePasswordString;
    }

    public WebElement getPassMatchError() {
        wait.until(ExpectedConditions.elementToBeClickable(passMatchError));
        return passMatchError;
    }
}
