package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EditAccountPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-firstname']")
    private WebElement firstNameString;

    @FindBy(xpath = "//input[@id = 'input-lastname']")
    private WebElement lastNameString;

    @FindBy(xpath = "//input[@id = 'input-email']")
    private WebElement emailString;

    @FindBy(xpath = "//input[@id = 'input-telephone']")
    private WebElement telephoneString;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement editAccountContinueButton;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement changesConfirmMessage;

    public WebElement getChangesConfirmMessage() {
        wait.until(ExpectedConditions.visibilityOfAllElements(changesConfirmMessage));
        return changesConfirmMessage; }

    public WebElement getEditAccountContinueButton() {
        wait.until(ExpectedConditions.visibilityOfAllElements(editAccountContinueButton));
        return editAccountContinueButton; }

    public WebElement getEmailString() {
        wait.until(ExpectedConditions.visibilityOfAllElements(emailString));
        return emailString;
    }

    public WebElement getFirstNameString() {
        wait.until(ExpectedConditions.visibilityOfAllElements(firstNameString));
        return firstNameString;
    }

    public WebElement getLastNameString() {
        wait.until(ExpectedConditions.visibilityOfAllElements(lastNameString));
        return lastNameString;
    }

    public WebElement getTelephoneString() {
        wait.until(ExpectedConditions.visibilityOfAllElements(telephoneString));
        return telephoneString;
    }
}
