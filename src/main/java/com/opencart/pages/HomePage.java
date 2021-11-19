package com.opencart.pages;

import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class = 'product-thumb transition']")
    private List<WebElement> products;

    public List<ProductContainer> getProducts() {
        wait.until(ExpectedConditions.visibilityOfAllElements(products));
        return products.stream().map(ProductContainer::new).collect(Collectors.toList());
    }
}
