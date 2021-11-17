package com.opencart.pages;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RightMenu {
    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Login']")
    private WebElement login;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Register']")
    private WebElement register;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Forgotten Password']")
    private WebElement forgottenPass;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'My Account']")
    private WebElement myAccount;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Address Book']")
    private WebElement addressBook;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Wish List']")
    private WebElement wishList;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Order History']")
    private WebElement orderHistory;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Downloads']")
    private WebElement downloads;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Recurring payments']")
    private WebElement recurringPayments;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Reward Points']")
    private WebElement rewardPoints;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Returns']")
    private WebElement returns;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Transactions']")
    private WebElement transactions;

    @Getter
    @FindBy(xpath = "//aside[@id = 'column-right']/div/a[text() = 'Newsletter']")
    private WebElement newsLetter;
}
