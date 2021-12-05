package com.opencart.steps;

import com.opencart.pages.CartPage;
import com.opencart.pages.containers.CartProductContainer;
import org.openqa.selenium.WebElement;

public class CartPageBL {

    private CartPage cartPage;

    public CartPageBL(){
        cartPage = new CartPage();
    }

    public CartPageBL cartUpdateProduct(String productName){
        CartProductContainer product = cartPage.getProducts().stream().filter(e -> e.cartProductGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.cartProductUpdate().click();
        return this;
    }

    public CartPageBL cartRemoveProduct(String productName){
        CartProductContainer product = cartPage.getProducts().stream().filter(e -> e.cartProductGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.cartProductRemove().click();
        return this;
    }

    public CartPageBL cartSetQuantityProduct(String productName, int quantity){
        CartProductContainer product = cartPage.getProducts().stream().filter(e -> e.cartProductGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        WebElement productQuantity;
        productQuantity = product.cartProductQuantity();
        productQuantity.clear();
        productQuantity.sendKeys(Integer.toString(quantity));
        return this;
    }
    
     public CartPageBL cartClickOnCodeCoupon(){
        CartPage page = new CartPage();
        page.getUseCouponCode().click();
        return this;
    }

    public CartPageBL cartClickOnGiftCertificate (){
        CartPage page = new CartPage();
        page.getUseGiftCertificate().click();
        return this;
    }

    public CartPageBL cartClickOnAddGiftCertificate(String code){
        CartPage page = new CartPage();
        page.getDataGiftCertificate().sendKeys(code);
        return this;
    }

    public CartPageBL cartClickOnApplyGiftCertificate(){
        CartPage page = new CartPage();
        page.getButtonApplyGiftCertificate().click();
        return this;
    }

    public CartPageBL cartClickOnAddCodeCoupon(String code){
        CartPage page = new CartPage();
        page.getDataUseCouponCode().sendKeys(code);
        return this;
    }
    public CartPageBL cartClickOnApplyCodeCoupon(){
        CartPage page = new CartPage();
        page.getButtonApplyCoupon().click();
        return this;
    }

    public CartPageBL couponApplyCheck() {
        String expected = "Success: Your coupon discount has been applied!";
        String actual = cartPage.getApplyAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected), "Error: tax rates are not modified");
        return new CartPageBL();
    }

    public CartPageBL giftCertificateApplyCheck() {
        String expected = "Success: Your gift certificate discount has been applied!";
        String actual = cartPage.getApplyAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected), "Error: tax rates are not modified");
        return new CartPageBL();
    }

}
