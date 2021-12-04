package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;
import java.util.List;

public class AdminCouponsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a/i")
    private WebElement addNewCoupons;

    @FindBy( xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    private WebElement deleteCoupons;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Succes')]")
    private WebElement couponAlertEditSuccess;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Succes')]")
    private WebElement couponDeleteSuccess;

    public WebElement getAddNewCoupons() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewCoupons));
        return addNewCoupons;
    }
    public WebElement getDeleteCoupons() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteCoupons));
        return deleteCoupons;
    }

    public String getPathCode(int value) {
        return driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[" + value + "]/td[3]")).getText();
    }

    public void couponAllertDeleteAccept()
    {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public WebElement getCouponAlertEditSuccess() {
        wait.until(ExpectedConditions.elementToBeClickable(couponAlertEditSuccess));
        return couponAlertEditSuccess;
    }
    public WebElement getCouponDeleteSuccess() {
        wait.until(ExpectedConditions.elementToBeClickable(couponDeleteSuccess));
        return couponDeleteSuccess;
    }




}
