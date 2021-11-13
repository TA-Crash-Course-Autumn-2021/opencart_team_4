package com.opencart.steps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.ProductPage;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPageBL {

    private ProductPage productPage;
    public ProductPageBL(){ productPage = new ProductPage(); }

    public ProductPageBL setQuantity(int quantity){
        productPage.getQuantity().clear();
        productPage.getQuantity().sendKeys(Integer.toString(quantity));
        return this;
    }
    public String getAvailabilityStatus(){
        return productPage.getAvailability().getText();
    }

    public int getProductPrice(){
        return Integer.getInteger(productPage.getProductPrice().getText());
    }

    public ProductPageBL addToCart(){
        productPage.getAddToCart().click();
        return this;
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
