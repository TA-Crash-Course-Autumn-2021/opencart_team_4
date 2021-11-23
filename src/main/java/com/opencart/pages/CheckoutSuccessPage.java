package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutSuccessPage extends BasePage{

    @FindBy(xpath = "//a[@class = 'btn btn-primary']")
    private WebElement checkoutSuccessContinueButton;

    public WebElement getCheckoutSuccessContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutSuccessContinueButton));
        return checkoutSuccessContinueButton;
    }
}
