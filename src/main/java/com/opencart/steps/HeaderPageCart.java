package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.pages.containers.HeaderPageCartContainer;
import com.opencart.steps.AdminSteps.AdminCouponsPageBL;

public class HeaderPageCart {

    private HeaderPage headerPage;

    public HeaderPageCart(){ headerPage = new HeaderPage(); }

        public HeaderPageCart cartRemoveProduct(String productName){
            HeaderPageCartContainer product = headerPage.getProducts().stream().filter(e -> e.headerCartGetProductName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
            product.headerCartRemoveProduct().click();
            return this;
        }
        public HeaderPageCart cartClickOnProduct(String productName){
            HeaderPageCartContainer product = headerPage.getProducts().stream().filter(e -> e.headerCartGetProductName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
            product.headerCartClickOnProduct().click();
            return this;
        }








}
