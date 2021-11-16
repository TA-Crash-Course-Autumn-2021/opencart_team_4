package com.opencart.pages;

import com.opencart.pages.containers.CartProductContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends BasePage {

    @FindBy(xpath = "//form//table[@class = 'table table-bordered']//tbody/tr")
    private List<WebElement> cartProducts;

    public List<CartProductContainer> getProducts() {
        return cartProducts.stream().map(CartProductContainer::new).collect(Collectors.toList());
    }
}
