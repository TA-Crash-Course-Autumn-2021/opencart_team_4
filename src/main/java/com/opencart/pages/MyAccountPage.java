package com.opencart.pages;

import com.opencart.driver.DriverRepository;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class MyAccountPage extends BasePage{


    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Edit your account information']")
    private WebElement myAccountEdit;

    @FindBy(xpath = "//a[contains(.,'Change')]")
    private WebElement myAccountPassChange;

    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Modify your address book entries']")
    private WebElement myAccountAddressBook;

    @FindBy(xpath = "//div[@id = 'content']/ul//a[text() = 'Modify your wish list']")
    private WebElement myAccountWishList;

    public WebElement getMyAccountAddressBook() {return myAccountAddressBook;}

    public WebElement getMyAccountEdit() {
        DriverRepository.DRIVERS.get().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        return myAccountEdit;}

    public WebElement getMyAccountPassChange() {
        DriverRepository.DRIVERS.get().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        return myAccountPassChange;}

    public WebElement getMyAccountWishList() {return myAccountWishList;}
}
