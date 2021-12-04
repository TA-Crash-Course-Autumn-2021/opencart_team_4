package com.opencart.steps.AdminSteps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.AdminPages.AdminProductsPage.ProductsPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPageBL {

    private ProductsPage productsPage;

    public ProductsPageBL() { productsPage = new ProductsPage(); }

    public AddNewProductBL clickOnAddNewProductButton() {
        productsPage.getAddNewProductButton().click();
        return new AddNewProductBL();
    }

    public AddNewProductBL clickOnCopyProductButton() {
        productsPage.getCopyProductButton().click();
        return new AddNewProductBL();
    }

    public AddNewProductBL clickOnEditProductButton() {
        productsPage.getEditProductButton().click();
        return new AddNewProductBL();
    }

    public AddNewProductBL clickOnDeleteProduct() {
        productsPage.getDeleteProductButton().click();
        return new AddNewProductBL();
    }

    public AddNewProductBL clickOnSelectProduct() {
        productsPage.getSelectProductButton().click();
        return new AddNewProductBL();
    }

    public AddNewProductBL clickOnFilterProductButton() {
        productsPage.getFilterProductButton().click();
        return new AddNewProductBL();
    }

    public ProductsPageBL deleteTestProduct() {
        productsPage.getSelectProductButton().click();
        productsPage.getDeleteProductButton().click();
        Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 10).until(ExpectedConditions.alertIsPresent()));
        DriverRepository.DRIVERS.get().switchTo().alert().accept();
        return this;
    }

}
