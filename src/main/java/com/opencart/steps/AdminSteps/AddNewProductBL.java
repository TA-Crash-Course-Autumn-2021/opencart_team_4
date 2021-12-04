package com.opencart.steps.AdminSteps;

import com.opencart.pages.AdminPages.AdminProductsPage.GeneralAddProduct;
import com.opencart.pages.AdminPages.AdminProductsPage.ImageAddProduct;
import org.testng.Assert;

public class AddNewProductBL {

    private ImageAddProduct adminProductPage;

    public AddNewProductBL() { adminProductPage = new ImageAddProduct();}

    public AddNewProductBL clickOnGeneral() {
        adminProductPage.getGeneralButton().click();
        return this;
    }

    public AddNewProductBL clickOnData() {
        adminProductPage.getDataButton().click();
        return this;
    }

    public AddNewProductBL clickOnImage() {
        adminProductPage.getImageButton().click();
        return this;
    }

    public AddNewProductBL setProductName(String productName) {
        adminProductPage.getProductName().clear();
        adminProductPage.getProductName().sendKeys(productName);
        return this;
    }

    public AddNewProductBL setProductMetaTagTitle(String productMetaTagTitle) {
        adminProductPage.getProductMetaTagTitle().clear();
        adminProductPage.getProductMetaTagTitle().sendKeys(productMetaTagTitle);
        return this;
    }

    public AddNewProductBL setProductModel(String productModel) {
        adminProductPage.getProductModel().clear();
        adminProductPage.getProductModel().sendKeys(productModel);
        return this;
    }

    public AddNewProductBL setImage() {
        adminProductPage.getImageProduct().click();
        adminProductPage.getEditImageProduct().click();
        adminProductPage.getDemoFolderProduct().click();
        adminProductPage.getSelectTestImageProduct().click();
        return this;
    }

    public AddNewProductBL clickOnSaveButton() {
        adminProductPage.getSaveProductButton().click();
        return this;
    }

    public AddNewProductBL addTestProduct() {
        setProductName("Test Asus Laptop 15.6'' ");
        setProductMetaTagTitle("Test Asus Laptop 15.6");
        clickOnData();
        setProductModel("Product 7");
        clickOnImage();
        setImage();
        clickOnSaveButton();
        return new AddNewProductBL();
    }

    public ProductsPageBL productsChangesCheck() {
        String expected = "Success: You have modified products!";
        String actual = adminProductPage.getProductAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected), "Error: products are not modified");
        return new ProductsPageBL();
    }

    public AddNewProductBL editTestProduct() {
        setProductName("Edited Test Asus Laptop 14'' ");
        setProductMetaTagTitle("Edited Test Asus Laptop 14");
        clickOnData();
        setProductModel("Edited Product 77");
        clickOnSaveButton();
        return new AddNewProductBL();
    }


}
