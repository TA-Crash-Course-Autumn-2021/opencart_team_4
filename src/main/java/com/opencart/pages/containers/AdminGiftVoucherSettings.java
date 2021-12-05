package com.opencart.pages.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminGiftVoucherSettings extends BasePage {

    @FindBy(xpath =  "//*[@id=\"input-code\"]")
    private WebElement giftVoucherCode;

    @FindBy(xpath =  "//*[@id=\"input-from-name\"]")
    private WebElement giftVoucherFromName;

    @FindBy(xpath =  "//*[@id=\"input-from-email\"]")
    private WebElement giftVoucherFromEMail;

    @FindBy(xpath =  "//*[@id=\"input-to-name\"]")
    private WebElement giftVoucherToName;

    @FindBy(xpath =  "//*[@id=\"input-to-email\"]")
    private WebElement giftVoucherToEMail;

    @FindBy(xpath =  "//*[@id=\"input-theme\"]/option[1]")
    private WebElement giftVoucherThemeBirthday;

    @FindBy(xpath =  "//*[@id=\"input-theme\"]/option[2]")
    private WebElement giftVoucherThemeChristmas;

    @FindBy(xpath =  "//*[@id=\"input-theme\"]/option[3]")
    private WebElement giftVoucherThemeGeneral;

    @FindBy(xpath =  "//*[@id=\"input-message\"]")
    private WebElement giftVoucherMessage;

    @FindBy(xpath =  "//*[@id=\"input-amount\"]")
    private WebElement giftVoucherAmount;

    @FindBy(xpath =  "//*[@id=\"input-status\"]/option[1]")
    private WebElement giftVoucherStatusEnabled;

    @FindBy(xpath =  "//*[@id=\"input-status\"]/option[2]")
    private WebElement giftVoucherStatusDisabled;

    @FindBy(xpath =  "//*[@id=\"content\"]/div[1]/div/div/button[2]/i")
    private WebElement giftVoucherSaveButton;


    public WebElement getGiftVoucherCode() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherCode));
        return giftVoucherCode;
    }

    public WebElement getGiftVoucherFromName() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherFromName));
        return giftVoucherFromName;
    }

    public WebElement getGiftVoucherFromEMail() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherFromEMail));
        return giftVoucherFromEMail;
    }

    public WebElement getGiftVoucherToName() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherToName));
        return giftVoucherToName;
    }

    public WebElement getGiftVoucherToEMail() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherToEMail));
        return giftVoucherToEMail;
    }

    public WebElement getGiftVoucherThemeBirthday() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherThemeBirthday));
        return giftVoucherThemeBirthday;
    }

    public WebElement getGiftVoucherThemeChristmas() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherThemeChristmas));
        return giftVoucherThemeChristmas;
    }

    public WebElement getGiftVoucherThemeGeneral() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherThemeGeneral));
        return giftVoucherThemeGeneral;
    }

    public WebElement getGiftVoucherMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherMessage));
        return giftVoucherMessage;
    }

    public WebElement getGiftVoucherAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherAmount));
        return giftVoucherAmount;
    }

    public WebElement getGiftVoucherStatusEnabled() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherStatusEnabled));
        return giftVoucherStatusEnabled;
    }

    public WebElement getGiftVoucherStatusDisabled() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherStatusDisabled));
        return giftVoucherStatusDisabled;
    }

    public WebElement getGiftVoucherSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(giftVoucherSaveButton));
        return giftVoucherSaveButton;
    }





}
