package com.opencart.pages.forms;

import com.opencart.enums.ProductForms.MediumSelectForm;
import com.opencart.pages.ProductPage;
import com.opencart.steps.ProductPageBL;
import org.openqa.selenium.support.ui.Select;

public class CartMediumForm extends ProductPageBL {

    private ProductPage productPage;

    public CartMediumForm() { productPage = new ProductPage(); }

    public void selectForm(String value) {
        Select select = new Select(productPage.getSelectForm());
        select.selectByValue(value);
    }

    public CartMediumForm mediumFormTemplate() {
                selectForm(MediumSelectForm.BLUE.getValue());
                setQuantity(2);
                addToCart();
                successfulProductAdding();
        return this;
    }
}
