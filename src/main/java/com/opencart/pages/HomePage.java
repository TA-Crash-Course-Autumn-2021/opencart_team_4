package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h4/a")
    List<WebElement> productName;

    public List<WebElement> getProductName() {
        return productName;
    }
}
