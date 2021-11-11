package com.opencart.steps;

import com.opencart.pages.ProductPage;

public class ProductPageBL {

    private ProductPage productPage;
    public ProductPageBL(){ productPage = new ProductPage(); }

    public void setQuantity(int quantity){
        productPage.getQuantity().clear();
        productPage.getQuantity().sendKeys(Integer.toString(quantity));
        productPage.getQuantity().submit();
    }
    public String getAvailabilityStatus(){
        return productPage.getAvailability().getText();
    }

    public int getProductPrice(){
        return Integer.getInteger(productPage.getProductPrice().getText());
    }

    public void addToCart(){
        productPage.getAddToCart().click();
    }

    public String getProductName(){
        return productPage.getProductName().getText();
    }

    public void addProductToCompare(){
        productPage.getCompareThisProduct().click();
    }

    public void addProductToWishList(){
        productPage.getAddToWishList().click();
    }

}
