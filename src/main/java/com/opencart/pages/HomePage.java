package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h4/a")
    private List<WebElement> productName;

    @FindBy(xpath = "//div[@class = 'product-thumb transition']//i[@class = 'fa fa-shopping-cart']")
    private WebElement homeClickOnCart;

    @FindBy(xpath = "//div[@class = 'product-thumb transition']")
    private List<WebElement> products;

    public List<WebElement> getProductName() {
        return productName;
    }

    public WebElement getHomeClickOnCart() { return homeClickOnCart; }

    public List<WebElement> getProducts() { return products; }
}
