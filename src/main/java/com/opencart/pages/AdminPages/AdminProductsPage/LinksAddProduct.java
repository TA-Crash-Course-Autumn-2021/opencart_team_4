package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksAddProduct extends AddNewProductPage{

    @FindBy(xpath = "//input[@id='input-manufacturer']")
    private WebElement productManufacturer;

    @FindBy(xpath = "//input[@id='input-category']")
    private WebElement productCategories;

    @FindBy(xpath = "//input[@id='input-filter']")
    private WebElement productFilters;

    @FindBy(xpath = "//input[@name='product_store[]']")
    private WebElement productStores;

    @FindBy(xpath = "//input[@id='input-download']")
    private WebElement productDownloads;

    @FindBy(xpath = "//input[@id='input-related']")
    private WebElement productRelatedProducts;

}
