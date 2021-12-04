package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecurringAddProduct extends AddNewProductPage{

    @FindBy(xpath = "//button[@data-original-title='Add Recurring']")
    private WebElement productAddRecurring;

    @FindBy(xpath = "//a[@title='Remove']")
    private WebElement productDeleteRecurring;

    @FindBy(xpath = "//select[@name='product_recurring[1][recurring_id]']")
    private WebElement productRecurring;

    @FindBy(xpath = "//select[@name='product_recurring[1][customer_group_id]']")
    private WebElement productAttributeText;

}
