package com.opencart.pages;

import com.opencart.pages.containers.WishListContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class WishList {

    @FindBy(xpath = "//div[@id = 'content']//tbody/tr")
    private List<WebElement> products;

    public List<WishListContainer> getProducts() {
        return products.stream().map(WishListContainer::new).collect(Collectors.toList());
    }

}
