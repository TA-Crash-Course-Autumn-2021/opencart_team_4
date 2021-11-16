package com.opencart.steps;

import com.opencart.pages.WishList;
import com.opencart.pages.containers.WishListContainer;

public class WishListBL {

    private WishList wishList;

    public WishListBL wishListProductAddToCart(String productName){
        WishListContainer product = wishList.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.wishListAddToCart().click();
        return this;
    }
    public WishListBL wishListProductRemove(String productName){
        WishListContainer product = wishList.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.wishListRemove().click();
        return this;
    }
}
