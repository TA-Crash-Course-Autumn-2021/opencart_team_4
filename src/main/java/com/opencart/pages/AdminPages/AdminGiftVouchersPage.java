package com.opencart.pages.AdminPages;

import com.opencart.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminGiftVouchersPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a/i")
    private WebElement addNewGiftVoucher;

    @FindBy( xpath = "//*[@id=\"content\"]/div[1]/div/div/button[2]")
    private WebElement deleteGiftVoucher;

    @FindBy( xpath = "//*[@id=\"button-send\"]")
    private WebElement sendGiftVoucher;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Succes')]")
    private WebElement allertChangeGiftVoucher;

    public WebElement getAddNewGiftVoucher() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewGiftVoucher));
        return addNewGiftVoucher;
    }

    public WebElement getDeleteGiftVoucher() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteGiftVoucher));
        return deleteGiftVoucher;
    }

    public WebElement getSendGiftVoucher() {
        wait.until(ExpectedConditions.elementToBeClickable(sendGiftVoucher));
        return sendGiftVoucher;
    }

    public WebElement getGiftVoucherChangeSuccess() {
        wait.until(ExpectedConditions.elementToBeClickable(allertChangeGiftVoucher));
        return allertChangeGiftVoucher;
    }

    public String getPathCode(int value) {
        return driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr[" + value + "]/td[2]")).getText();
    }

    public void giftVoucherAllertDeleteAccept() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
