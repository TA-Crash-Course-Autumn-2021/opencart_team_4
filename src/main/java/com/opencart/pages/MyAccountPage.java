package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @Getter
    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Edit your account information']")
    WebElement myAccountEdit;

    @Getter
    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Change your password']")
    WebElement myAccountPassChange;

    @Getter
    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Modify your address book entries']")
    WebElement myAccountAddressBook;

    @Getter
    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Modify your wish list']")
    WebElement myAccountWishList;
}
