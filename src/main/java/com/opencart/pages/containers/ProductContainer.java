package com.opencart.pages.containers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductContainer {

    private WebElement rootElement;

    public ProductContainer(WebElement element){ this.rootElement = element; }

    public WebElement productAddToCart(){
       return rootElement.findElement(By.xpath("//div[@id = 'content']//button[@type ]/i[@class = 'fa fa-shopping-cart']/.."));
    }

    public WebElement productAddToWishList(){
        return rootElement.findElement(By.xpath("//div[@id = 'content']//button[@type ]/i[@class = 'fa fa-heart']/.."));
    }

    public WebElement productAddToCompare(){
        return rootElement.findElement(By.xpath("//div[@id = 'content']//button[@type ]/i[@class = 'fa fa-exchange']/.."));
    }

    public String productGetPrice(){
        return rootElement.findElement(By.xpath("//div[@id = 'content']//p[@class = 'price']")).getText();
    }

    public String productGetName(){
        return rootElement.findElement(By.xpath(".//h4/a")).getText();
    }

    public WebElement clickOnProduct(){
        return rootElement.findElement(By.xpath("//h4/a"));
    }

}
