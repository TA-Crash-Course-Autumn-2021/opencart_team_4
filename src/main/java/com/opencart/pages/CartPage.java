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

    @FindBy(xpath = "//*[@id=\"input-coupon\"]")
    private WebElement dataUseCouponCode;

    @FindBy(xpath = "//*[@id=\"button-coupon\"]")
    private WebElement buttonApplyCoupon;


    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Succes')]")
    private WebElement couponApplyAlert;


    public WebElement getUseCouponCode() {
        wait.until(ExpectedConditions.elementToBeClickable(useCouponCode));
        return useCouponCode;
    }

    public WebElement getDataUseCouponCode() {
        wait.until(ExpectedConditions.elementToBeClickable(dataUseCouponCode));
        return dataUseCouponCode;
    }

    public WebElement getButtonApplyCoupon() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonApplyCoupon));
        return buttonApplyCoupon;
    }

    public WebElement getCouponApplyAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(couponApplyAlert));
        return couponApplyAlert;
    }
}
