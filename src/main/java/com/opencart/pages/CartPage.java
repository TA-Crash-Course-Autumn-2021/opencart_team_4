package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//form//table[@class = 'table table-bordered']//tbody/tr")
    private List<WebElement> cartProducts;

    @FindBy(xpath = "//div[@class = 'input-group btn-block']//input[@value]")
    private WebElement cartPageProductQuantity;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement cartUpdate;

    @FindBy(xpath = "//table[@class = 'table table-bordered']//tbody//td[@class = 'text-left']//a")
    private List<WebElement> cartProductsName;

    @FindBy(xpath = "//button[@class = 'btn btn-danger']")
    private WebElement cartRemove;

    public List<WebElement> getCartProductsName() {
        wait.until(ExpectedConditions.visibilityOfAllElements(cartProductsName));
        return cartProductsName;
    }

    public WebElement getCartRemove() { return cartRemove; }

    public List<WebElement> getCartProducts() { return cartProducts; }

    public WebElement getCartPageQuantity(){ return cartPageProductQuantity; }

    public WebElement getCartUpdate() { return cartUpdate; }
}
