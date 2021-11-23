package com.opencart.pages.Forms;

import com.opencart.pages.ProductPage;
import com.opencart.steps.ProductPageBL;
import org.testng.Assert;

public class CartMediumForm extends ProductPageBL {

    private ProductPage productPage;

    public CartMediumForm() { productPage = new ProductPage(); }

    public CartMediumForm productOptionSelectRed() {
        productPage.getSelectForm().click();
        productPage.getSelectRed().click();
        return this;
    }

    public CartMediumForm productOptionSelectBlue() {
        productPage.getSelectForm().click();
        productPage.getSelectBlue().click();
        return this;
    }
}