package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeoAddProduct extends AddNewProductPage {

    @FindBy(xpath = "//input[@name='product_seo_url[0][1]']")
    private WebElement productSeoKeyword;
}
