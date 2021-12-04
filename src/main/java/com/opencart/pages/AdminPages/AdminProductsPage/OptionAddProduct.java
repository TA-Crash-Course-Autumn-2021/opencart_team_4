package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OptionAddProduct extends AddNewProductPage{

    @FindBy(xpath = "//input[@id= 'input-option']")
    private WebElement productOption;

}
