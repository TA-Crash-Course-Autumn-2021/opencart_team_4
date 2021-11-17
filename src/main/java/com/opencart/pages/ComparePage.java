package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage  extends BasePage{

    @FindBy(xpath = "//td//a[@class = 'btn btn-danger btn-block']/.")
    List<WebElement> compareRemove;

    @FindBy(xpath = "//td//input[@value = 'Add to Cart']")
    List<WebElement> compareAddToCart;

    @FindBy(xpath = "//td//a/strong")
    List<WebElement> products;

    public int getIndex(String productName){
       int index = 0;
        for(WebElement product : getProducts()){
            index++;
            if(product.getText().contains(productName)){
                break;
            }
        }
        return index;
    }

    public List<WebElement> getProducts() { return products; }

    public List<WebElement> getCompareAddToCart() { return compareAddToCart; }

    public List<WebElement> getCompareRemove() { return compareRemove; }
}

