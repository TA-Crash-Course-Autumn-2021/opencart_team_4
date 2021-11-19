package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    @Getter
public class LogoutPage extends BasePage{

    @FindBy(xpath = "//a[text() = 'Continue']")
    WebElement logoutPageContinueButton;
}
