package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'input-search']")
    private WebElement search;

    @FindBy(xpath = "//input[@id = 'button-search']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'col-sm-3']//label[@class = 'checkbox-inline']")
    private WebElement searchInSubCategories;

    @FindBy(xpath = "//input[@id= 'description']")
    private WebElement searchInDescription;

    @FindBys( {
            @FindBy(className = "form-control"),
            @FindBy(tagName = "option")
    } )
    private List<WebElement> searchInCategories;

    @FindBy(xpath = "//select[@class = 'form-control']")
    WebElement searchFormButton;

    public List<WebElement> getSearchInCategories() {
        return searchInCategories;
    }

    public WebElement getSearchFormButton() {
        return searchFormButton;
    }
}
