package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    @Getter
public class EditAccountPage {

    @FindBy(xpath = "//input[@id = 'input-firstname']")
    WebElement firstNameString;

    @FindBy(xpath = "//input[@id = 'input-lastname']")
    WebElement lastNameString;

    @FindBy(xpath = "//input[@id = 'input-email']")
    WebElement emailString;

    @FindBy(xpath = "//input[@id = 'input-telephone']")
    WebElement telephoneString;

    @FindBy(xpath = "//input[@type = 'submit']")
        WebElement editAccountContinueButton;
}
