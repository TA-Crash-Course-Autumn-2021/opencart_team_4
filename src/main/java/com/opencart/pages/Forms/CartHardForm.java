package com.opencart.pages.Forms;


import com.opencart.pages.ProductPage;
import com.opencart.steps.ProductPageBL;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CartHardForm extends ProductPageBL {

    private ProductPage productPage;

    public CartHardForm() { productPage = new ProductPage(); }

    public CartHardForm radioSelectSmall() {
        productPage.getRadioSmall().click();
        return this;
    }

    public CartHardForm radioSelectMedium() {
        productPage.getRadioMedium().click();
        return this;
    }

    public CartHardForm radioSelectLarge() {
        productPage.getRadioLarge().click();
        return this;
    }

    public CartHardForm hardFormSetText(String text) {
        productPage.getProductHardFormText().clear();
        productPage.getProductHardFormText().sendKeys(text);
        return this;
    }

    public CartHardForm checkboxSelectFirst() {
        productPage.getCheckBoxSelectFirst().click();
        return this;
    }

     public CartHardForm checkboxSelectSecond() {
        productPage.getCheckBoxSelectSecond().click();
        return this;
    }

     public CartHardForm checkboxSelectThird() {
        productPage.getCheckBoxSelectThird().click();
        return this;
    }

     public CartHardForm checkboxSelectForth() {
        productPage.getCheckBoxSelectForth().click();
        return this;
    }

    public CartHardForm selectRed() {
        productPage.getSelectForm().click();
        productPage.getSelectRed().click();
        return this;
    }

    public CartHardForm selectBlue() {
        productPage.getSelectForm().click();
        productPage.getSelectBlue().click();
        return this;
    }

    public CartHardForm selectGreen() {
        productPage.getSelectForm().click();
        productPage.getSelectGreen().click();
        return this;
    }

    public CartHardForm selectYellow() {
        productPage.getSelectForm().click();
        productPage.getSelectYellow().click();
        return this;
    }

    public CartHardForm hardFormSetTextArea(String text) {
        productPage.getProductHardFormTextArea().clear();
        productPage.getProductHardFormTextArea().sendKeys(text);
        return this;
    }

    public CartHardForm hardFormSetDate() {
        productPage.getProductHardFormDate().clear();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String currentDate = format.format(date);
        productPage.getProductHardFormDate().sendKeys(currentDate);
        return this;
    }

    public CartHardForm hardFormSetHour() {
        productPage.getProductHardFormHour().clear();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String currentHour = format.format(date);
        productPage.getProductHardFormHour().sendKeys(currentHour);
        return this;
    }

    public CartHardForm hardFormSetDateAndHour() {
        productPage.getProductHardFormDateAndHour().clear();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String dateAndHour = format.format(date);
        productPage.getProductHardFormDateAndHour().sendKeys(dateAndHour);
        return this;
    }
}
