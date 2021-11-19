package com.opencart.pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MenuContainer {

    private WebElement category;

    public MenuContainer(WebElement category){
        this.category = category;
    }

    public String getCategoryName(){
        return category.findElement(By.tagName("a")).getText();
    }

    public WebElement clickOnCategory(){
        return category.findElement(By.tagName("a"));
    }
}
