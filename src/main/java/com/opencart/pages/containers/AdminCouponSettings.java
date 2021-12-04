package com.opencart.pages.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminCouponSettings extends BasePage {
    private WebElement category;



    @FindBy(xpath =  "//*[@id=\"input-name\"]")
    private WebElement couponsAddCouponsName;

    @FindBy(xpath = "//*[@id=\"input-code\"]")
    private WebElement couponsAddCode;

    @FindBy(xpath = "//*[@id=\"input-type\"]")
    private WebElement couponsAddType;

    @FindBy(xpath = "//*[@id=\"input-type\"]/option[1]")
    private WebElement couponsAddTypePercentage;

    @FindBy(xpath = "//*[@id=\"input-type\"]/option[2]")
    private WebElement couponsAddTypeFixedAmount;

    @FindBy(xpath = "//*[@id=\"input-discount\"]")
    private WebElement couponsAddDiscount;

    @FindBy(xpath = "//*[@id=\"input-total\"]")
    private WebElement couponsAddTotalAmount;

    @FindBy(xpath = "//*[@id=\"tab-general\"]/div[6]/div/label[1]/input")
    private WebElement couponsAddCustomerLoginYes;

    @FindBy(xpath = "//*[@id=\"tab-general\"]/div[6]/div/label[2]/input")
    private WebElement couponsAddCustomerLoginNo;

    @FindBy(xpath = "//*[@id=\"tab-general\"]/div[7]/div/label[1]/input")
    private WebElement couponsAddFreeShippingYes;

    @FindBy(xpath = "//*[@id=\"tab-general\"]/div[7]/div/label[2]/input")
    private WebElement couponsAddFreeShippingNo;

    @FindBy(xpath = "//*[@id=\"input-product\"]")
    private WebElement couponsAddProducts;

    @FindBy(xpath = "//*[@id=\"input-category\"]")
    private WebElement couponsAddCategory;

    @FindBy(xpath = "//*[@id=\"input-date-start\"]")
    private WebElement couponsAddDateStart;

    @FindBy(xpath = "//*[@id=\"input-date-end\"]")
    private WebElement couponsAddDateEnd;

    @FindBy(xpath = "//*[@id=\"input-uses-total\"]")
    private WebElement couponsAddUsesPerCoupon;

    @FindBy(xpath = "//*[@id=\"input-uses-customer\"]")
    private WebElement couponsAddUsesPerCustomer;

    @FindBy(xpath = "//*[@id=\"input-status\"]/option[1]")
    private WebElement couponsAddStatusEnabled;

    @FindBy(xpath = "//*[@id=\"input-status\"]/option[2]")
    private WebElement couponsAddStatusDisabled;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
    private WebElement buttonSaveNewCoupon;


    public WebElement getCouponsAddCouponsName() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddCouponsName));
        return couponsAddCouponsName;
    }
    public WebElement getCouponsAddCode() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddCode));
        return couponsAddCode;
    }
    public WebElement getCouponsAddType() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddType));
        return couponsAddType;
    }
    public WebElement getCouponsAddTypePercentage() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddTypePercentage));
        return couponsAddTypePercentage;
    }
    public WebElement getCouponsAddTypeFixedAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddTypeFixedAmount));
        return couponsAddTypeFixedAmount;
    }

    public WebElement getCouponsAddDiscount() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddDiscount));
        return couponsAddDiscount;
    }
    public WebElement getCouponsAddTotalAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddTotalAmount));
        return couponsAddTotalAmount;
    }
    public WebElement getCouponsAddCustomerLoginYes() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddCustomerLoginYes));
        return couponsAddCustomerLoginYes;
    }
    public WebElement getCouponsAddCustomerLoginNo() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddCustomerLoginNo));
        return couponsAddCustomerLoginNo;
    }

    public WebElement getCouponsAddFreeShippingYes() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddFreeShippingYes));
        return couponsAddFreeShippingYes;
    }
    public WebElement getCouponsAddFreeShippingNo() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddFreeShippingNo));
        return couponsAddFreeShippingNo;
    }
    public WebElement getCouponsAddProducts() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddProducts));
        return couponsAddProducts;
    }
    public WebElement getCouponsAddCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddCategory));
        return couponsAddCategory;
    }
    public WebElement getCouponsAddDateStart() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddDateStart));
        return couponsAddDateStart;
    }
    public WebElement getCouponsAddDateEnd() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddDateEnd));
        return couponsAddDateEnd;
    }
    public WebElement getCouponsAddUsesPerCoupon() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddUsesPerCoupon));
        return couponsAddUsesPerCoupon;
    }
    public WebElement getCouponsAddUsesPerCustomer() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddUsesPerCustomer));
        return couponsAddUsesPerCustomer;
    }
    public WebElement getCouponsAddStatusEnabled() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddStatusEnabled));
        return couponsAddStatusEnabled;
    }
    public WebElement getCouponsAddStatusDisabled() {
        wait.until(ExpectedConditions.elementToBeClickable(couponsAddStatusDisabled));
        return couponsAddStatusDisabled;
    }

    public WebElement getButtonSaveNewCoupon() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonSaveNewCoupon));
        return buttonSaveNewCoupon;
    }
}
