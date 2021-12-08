package com.opencart.pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CartProductContainer {

    private WebElement rootElement;

    public CartProductContainer(WebElement product){ this.rootElement = product; }

    public WebElement cartProductUpdate(){
        return cartProductUpdate().findElement(By.xpath("//button[@type = 'submit']"));
    }

    public WebElement cartProductRemove(){
        return cartProductRemove().findElement(By.xpath("//button[@class = 'btn btn-danger']"));
    }

    public WebElement cartProductClick(){
        return cartProductUpdate().findElement(By.xpath("//table[@class = 'table table-bordered']//tbody//td[@class = 'text-left']//a"));
    }

    public String cartProductGetName(){
        return rootElement.findElement(By.xpath("//table[@class = 'table table-bordered']//tbody//td[@class = 'text-left']//a")).getText();
    }

    public WebElement cartProductQuantity(){
        return rootElement.findElement(By.xpath("//div[@class = 'input-group btn-block']//input[@value]"));
    }
}
