package com.opencart.steps;


import com.opencart.pages.ProductPage;
import org.testng.Assert;

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

    public ProductPageBL successfulProductAdding() {
        String expected = "Success: You have added ";
        String actual = productPage.getMediumFormAlert().getText();
        Assert.assertTrue(actual.contains(expected), "Product not added to cart");
        return this;
    }

    public ProductPageBL fieldRequiredCheck() {
        String expected = "required";
        String actual = productPage.getRequiredFieldAlert().getText();
        Assert.assertTrue(actual.contains(expected));
        return this;
    }

    public void addProductToWishList(){
        productPage.getAddToWishList().click();
    }
}
