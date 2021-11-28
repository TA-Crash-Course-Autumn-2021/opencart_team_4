package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LogoutPage extends BasePage{

    @FindBy(xpath = "//a[text() = 'Continue']")
    private WebElement logoutPageContinueButton;

    public WebElement getLogoutPageContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutPageContinueButton));
        return logoutPageContinueButton;
    }
}
