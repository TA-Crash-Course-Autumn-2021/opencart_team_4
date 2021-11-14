package com.opencart.steps;

import com.opencart.pages.ProductPage;

public class ProductPageBL {

    private ProductPage productPage;
    public ProductPageBL(){ productPage = new ProductPage(); }

    public ProductPageBL setQuantity(int quantity){
        productPage.getQuantity().clear();
        productPage.getQuantity().sendKeys(Integer.toString(quantity));
        return this;
    }

    public ProductPageBL addToCart(){
        productPage.getAddToCart().click();
        return this;
    }

    public ProductPageBL getProductName(){
        productPage.getProductName().getText();
        return this;
    }

    public ProductPageBL addProductToCompare(){
        productPage.getCompareThisProduct().click();
        return this;
    }

    public void addProductToWishList(){
        productPage.getAddToWishList().click();
    }


}
