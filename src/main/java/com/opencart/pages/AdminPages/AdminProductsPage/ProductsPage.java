package com.opencart.pages.AdminPages.AdminProductsPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']/..")
    private WebElement addNewProductButton;

    @FindBy(xpath = "//i[@class = 'fa fa-copy']/..")
    private WebElement copyProductButton;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//input")
    private WebElement selectProductButton;

    @FindBy(xpath = "//i[@class = 'fa fa-trash-o']/..")
    private WebElement deleteProductButton;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editProduct;


    //FilterForm
    @FindBy(xpath = "//input[@placeholder = 'Product Name']")
    private WebElement filterProductName;

    @FindBy(xpath = "//input[@placeholder = 'Model']")
    private WebElement filterModel;

    @FindBy(xpath = "//input[@placeholder = 'Price']")
    private WebElement filterPrice;

    @FindBy(xpath = "//input[@placeholder = 'Quantity']")
    private WebElement filterQuantity;

    @FindBy(xpath = "//select[@id = 'input-status']")
    private WebElement filterStatus;

    @FindBy(xpath = "//i[@class = 'fa fa-filter']/..")
    private WebElement filterProductButton;

    public WebElement getAddNewProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addNewProductButton));
        return addNewProductButton;
    }

    public WebElement getCopyProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(copyProductButton));
        return copyProductButton;
    }

    public WebElement getDeleteProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteProductButton));
        return deleteProductButton;
    }

    public WebElement getEditProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(editProduct));
        return editProduct;
    }

    public WebElement getSelectProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(selectProductButton));
        return selectProductButton;
    }

    //FilterForm
    public WebElement getFilterProductName() {
        wait.until(ExpectedConditions.elementToBeClickable(filterProductName));
        return filterProductName;
    }

    public WebElement getFilterModel() {
        wait.until(ExpectedConditions.elementToBeClickable(filterModel));
        return filterModel;
    }

    public WebElement getFilterPrice() {
        wait.until(ExpectedConditions.elementToBeClickable(filterPrice));
        return filterPrice;
    }

    public WebElement getFilterQuantity() {
        wait.until(ExpectedConditions.elementToBeClickable(filterQuantity));
        return filterQuantity;
    }

    public WebElement getFilterStatus() {
        wait.until(ExpectedConditions.elementToBeClickable(filterStatus));
        return filterStatus;
    }

    public WebElement getFilterProductButton() {
        wait.until(ExpectedConditions.elementToBeClickable(filterProductButton));
        return filterProductButton;
    }
}
