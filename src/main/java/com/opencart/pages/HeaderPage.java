package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//input[@class = 'form-control input-lg']")
    WebElement searchString;

    @FindBy(xpath = "//button[@class = 'btn btn-default btn-lg']")
    WebElement searchStringSubmit;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getSearch() { return searchString; }

    public WebElement getSearchStringSubmit() {
        return searchStringSubmit;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }
}
