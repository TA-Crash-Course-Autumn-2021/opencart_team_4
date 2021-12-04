package com.opencart.pages.AdminPages.AdminProductsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ImageAddProduct extends DataAddProduct{


    @FindBy(xpath = "//a[@id='thumb-image']")
    private WebElement imageProduct;

    @FindBy(xpath = "//button[@id='button-image']")
    private WebElement editImageProduct;

    @FindBy(xpath = "//button[@id='button-clear']")
    private WebElement deleteImageProduct;


    @FindBy(xpath = "//i[@class='fa fa-folder fa-5x']")
    private WebElement demoFolderProduct;

    @FindBy(xpath = "//img[@alt='asus test.jpg']")
    private WebElement selectTestImageProduct;

    public WebElement getImageProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(imageProduct));
        return imageProduct;
    }

    public WebElement getEditImageProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(editImageProduct));
        return editImageProduct;
    }

    public WebElement getDeleteImageProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteImageProduct));
        return deleteImageProduct;
    }

    public WebElement getDemoFolderProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(demoFolderProduct));
        return demoFolderProduct;
    }

    public WebElement getSelectTestImageProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(selectTestImageProduct));
        return selectTestImageProduct;
    }
}
