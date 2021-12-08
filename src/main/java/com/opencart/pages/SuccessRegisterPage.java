package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessRegisterPage extends BasePage {

    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        wait.until(ExpectedConditions.visibilityOf(successTitle));
        return successTitle;
    }
}
