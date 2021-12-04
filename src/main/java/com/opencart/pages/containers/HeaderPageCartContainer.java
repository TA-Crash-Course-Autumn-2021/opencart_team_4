package com.opencart.pages.containers;

import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class HeaderPageCartContainer  extends BasePage  {

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
