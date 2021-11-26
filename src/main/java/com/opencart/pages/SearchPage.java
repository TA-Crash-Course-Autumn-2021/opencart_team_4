package com.opencart.pages;


import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-search']")
    private WebElement search;

    @FindBy(xpath = "//input[@id = 'button-search']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'col-sm-3']//label[@class = 'checkbox-inline']")
    private WebElement searchInSubCategories;

    @FindBy(xpath = "//input[@id= 'description']")
    private WebElement searchInDescription;

    @FindBys({
            @FindBy(className = "form-control"),
            @FindBy(tagName = "option")
    })
    private List<WebElement> searchInCategories;

    @FindBy(xpath = "//select[@class = 'form-control']")
    private WebElement searchFormButton;

    @FindBy(xpath = "//div[@class = 'product-thumb']")
    private List<WebElement> products;

    @FindBy(xpath = "//p[contains(.,'There ')]")
    private WebElement unsuccessfulSearchingResult;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']//a[contains(.,'cart')]")
    private WebElement successfulAddToCartAlert;

    public List<WebElement> getSearchInCategories() {
        return searchInCategories;
    }

    public WebElement getSearchInSubCategories() {
        return searchInSubCategories;
    }

    public WebElement getSearchInDescription() {
        return searchInDescription;
    }

    public WebElement getSearchFormButton() {
        return searchFormButton;
    }

    public List<ProductContainer> getProducts() {
        return products.stream().map(ProductContainer::new).collect(Collectors.toList());
    }

    public WebElement getUnsuccessfulSearchingResult() {
        wait.until(ExpectedConditions.visibilityOf(unsuccessfulSearchingResult));
        return unsuccessfulSearchingResult;
    }

    public WebElement getSuccessfulAddToCartAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(successfulAddToCartAlert));
        return successfulAddToCartAlert;
    }

    public WebElement getSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(search));
        return search;
    }

    public WebElement getSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        return searchButton;
    }
}