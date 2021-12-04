package com.opencart.steps.AdminSteps.Categories;
import com.opencart.pages.AdminPages.AdminNavigationBar;
import com.opencart.steps.AdminSteps.ManufacturerPageBL;
import com.opencart.steps.AdminSteps.ProductsPageBL;


public class CatalogCategories {
    private AdminNavigationBar adminNavigationBar;

    public CatalogCategories() {adminNavigationBar = new AdminNavigationBar(); }


    public ManufacturerPageBL clickOnManufacturers() {
        adminNavigationBar.getManufacturersCategory().click();
        return new ManufacturerPageBL();
    }

    public ProductsPageBL clickOnProducts() {
        adminNavigationBar.getProductsCategory().click();
        return new ProductsPageBL();
    }
}
