package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttributeAddProduct extends AddNewProductPage {

    @FindBy(xpath = "//button[@data-original-title='Add Attribute']")
    private WebElement productAddAttribute;

    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement productDeleteAttribute;

    @FindBy(xpath = "//input[@name = 'product_attribute[0][name]']")
    private WebElement productAttribute;

    @FindBy(xpath = "//textarea[@name='product_attribute[0][product_attribute_description][1][text]']")
    private WebElement productAttributeText;

}
