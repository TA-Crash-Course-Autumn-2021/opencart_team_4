package com.opencart.pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderPageCartContainer {

    private WebElement product;

    public HeaderPageCartContainer(WebElement product) { this.product = product; }

    public String headerCartGetProductName(){
       return product.findElement( By.xpath("//td[@class = 'text-left']/a")).getText();
    }

    public WebElement headerCartRemoveProduct(){
        return product.findElement(By.xpath("//button[@title = 'Remove']"));
    }

    public WebElement headerCartClickOnProduct(){
        return product.findElement( By.xpath("//td[@class = 'text-left']/a"));
    }
}
