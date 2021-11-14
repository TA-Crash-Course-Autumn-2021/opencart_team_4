package com.opencart.steps;

import com.opencart.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPageBL {

    private CartPage cartPage;
    public CartPageBL(){
        cartPage = new CartPage();
    }

    public ProductPageBL cartClickOnProduct(String product){
        for(WebElement current : cartPage.getCartProductsName()){
            if(current != null & current.getText().contains(product)){
                current.click();
            }
        }
        return new ProductPageBL();
    }

    public WebElement product(String product){
        WebElement choosen = null;
        for(WebElement prod : cartPage.getCartProducts()){
            if(prod.findElement(By.xpath("//h4/a")).getText().equalsIgnoreCase(product))
                choosen = prod;
        }
        return choosen;
    }

    public CartPageBL cartRemove(WebElement product){
        cartPage.getCartRemove().click();
        return this;
    }

    public CartPageBL cartSetProductQuantity(WebElement product, int quantity){
        cartPage.getCartPageQuantity().clear();
        cartPage.getCartPageQuantity().sendKeys(Integer.toString(quantity));
        cartPage.getCartUpdate().click();
    return this;
    }
}
