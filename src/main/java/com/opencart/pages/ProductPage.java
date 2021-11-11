package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//div[@id = 'content']//h1")
    private WebElement productName;

    @FindBy(xpath = "//button[@data-original-title = 'Add to Wish List']")
    private WebElement addToWishList;

    @FindBy(xpath = "//button[@data-original-title = 'Compare this Product']")
    private WebElement compareThisProduct;

    @FindBy(xpath = "//button[@class = 'btn btn-primary btn-lg btn-block']")
    private WebElement addToCart;

    @FindBy(xpath = "//div[@id = 'product-product']//ul[@class = 'list-unstyled']//h2")
    private WebElement productPrice;

    @FindBy(xpath = "//div[@id = 'product-product']//ul[@class = 'list-unstyled']//li[4]")
    private WebElement availability;

    @FindBy(xpath = "//div[@id = 'product']//input[@type = 'text']")
    private WebElement quantity;

    public WebElement getProductName() { return productName;}
    public WebElement getAddToCart() { return addToCart; }
    public WebElement getAddToWishList() { return addToWishList; }
    public WebElement getCompareThisProduct() { return compareThisProduct; }
    public WebElement getProductPrice() { return productPrice; }
    public WebElement getAvailability() { return availability; }
    public WebElement getQuantity() { return quantity; }
}
