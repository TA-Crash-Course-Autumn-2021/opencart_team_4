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
}
