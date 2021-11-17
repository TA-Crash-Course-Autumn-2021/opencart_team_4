package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgottenPassword extends BasePage {

    @FindBy(xpath = "//div[@class = 'col-sm-10']//input[@type = 'text']")
    WebElement emailString;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement continueButton;

    @FindBy(xpath = "//div[@id = 'content']//div[@class = 'pull-left']/a")
    WebElement backButton;

    public WebElement getContinueButton() { return continueButton; }

    public WebElement getBackButton() { return backButton; }

    public WebElement getEmailString() { return emailString; }
}
