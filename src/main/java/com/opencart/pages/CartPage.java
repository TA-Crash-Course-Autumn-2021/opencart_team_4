package com.opencart.pages;

import com.opencart.pages.containers.CartProductContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends BasePage {

    @FindBy(xpath = "//form//table[@class = 'table table-bordered']//tbody/tr")
    private List<WebElement> cartProducts;

    public List<CartProductContainer> getProducts() {
        return cartProducts.stream().map(CartProductContainer::new).collect(Collectors.toList());
    }
    
    

    @FindBy(xpath = "//a[contains(.,'Use Coupon Code ')]")
    private WebElement useCouponCode;

    @FindBy(xpath = "//a[contains(.,'Use Gift Certificate')]")
    private WebElement useGiftCertificate ;

    @FindBy(xpath = "//*[@id=\"input-voucher\"]")
    private WebElement dataGiftCertificate ;

    @FindBy(xpath = "//*[@id=\"input-coupon\"]")
    private WebElement dataUseCouponCode;

    @FindBy(xpath = "//*[@id=\"button-coupon\"]")
    private WebElement buttonApplyCoupon;

    @FindBy(xpath = "//*[@id=\"button-voucher\"]")
    private WebElement buttonApplyGiftCertificate;


    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Succes')]")
    private WebElement applyAlert;


    public WebElement getUseCouponCode() {
        wait.until(ExpectedConditions.elementToBeClickable(useCouponCode));
        return useCouponCode;
    }

    public WebElement getUseGiftCertificate() {
        wait.until(ExpectedConditions.elementToBeClickable(useGiftCertificate));
        return useGiftCertificate;
    }

    public WebElement getDataUseCouponCode() {
        wait.until(ExpectedConditions.elementToBeClickable(dataUseCouponCode));
        return dataUseCouponCode;
    }

    public WebElement getDataGiftCertificate() {
        wait.until(ExpectedConditions.elementToBeClickable(dataGiftCertificate));
        return dataGiftCertificate;
    }

    public WebElement getButtonApplyCoupon() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonApplyCoupon));
        return buttonApplyCoupon;
    }

    public WebElement getButtonApplyGiftCertificate() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonApplyGiftCertificate));
        return buttonApplyGiftCertificate;
    }

    public WebElement getApplyAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(applyAlert));
        return applyAlert;
    }





}
