package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.CheckoutPage;
import com.opencart.repository.RegisterModelRepository;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;

    public CheckoutPageBL() { checkoutPage = new CheckoutPage(); }

    public CheckoutPageBL setCountry() {
        checkoutPage.getCheckoutCountryForm().click();
        checkoutPage.getSelectUkraine().click();
        return this;
    }

    public CheckoutPageBL setRegion() {
        checkoutPage.getCheckoutRegion().click();
        checkoutPage.getSelectRegionLviv().click();
        return this;
    }

    public CheckoutPageBL checkoutSetStandardUserVars() {
        RegisterModel validModel = RegisterModelRepository.getValidModel();
        checkoutPage.getCheckoutFirstName().clear();
        checkoutPage.getCheckoutFirstName().sendKeys(validModel.getFirstName());
        checkoutPage.getCheckoutLastName().clear();
        checkoutPage.getCheckoutLastName().sendKeys(validModel.getLastName());
        checkoutPage.getCheckoutCompany().clear();
        checkoutPage.getCheckoutCompany().sendKeys("Test COMPANY");
        checkoutPage.getCheckoutAddress1().clear();
        checkoutPage.getCheckoutAddress1().sendKeys("Bug str. number 5");
        checkoutPage.getCheckoutAddress2().clear();
        checkoutPage.getCheckoutAddress2().sendKeys("house number 6");
        checkoutPage.getCheckoutCity().clear();
        checkoutPage.getCheckoutCity().sendKeys("Lviv");
        checkoutPage.getCheckoutPostCode().clear();
        checkoutPage.getCheckoutPostCode().sendKeys("79060");
        return this;
    }

    public CheckoutPageBL checkoutStandardTemplate(String commentText) {
        checkoutPage.getStepTwoNewAddress().click();
        checkoutSetStandardUserVars();
        setCountry();
        setRegion();
        checkoutPage.getStepTwoContinueButton().click();
        checkoutPage.getCheckoutStep3Open().click();
        checkoutPage.getStepThreeContinueButton().click();
        stepFourSelectFlatRate(commentText);
        stepFiveSelectCashOnDelivery(commentText);
        checkoutPage.getStepSixOrderConfirmButton().click();
        return this;
    }

    public CheckoutPageBL stepThreeClick() {
        checkoutPage.getCheckoutStep3Open().click();
        return this;
    }

    public CheckoutPageBL stepFourSelectFlatRate(String orderComment) {
        checkoutPage.getCheckoutStep4Open().click();
        checkoutPage.getRadioFlatShipping().click();
        checkoutPage.getTextArea().clear();
        checkoutPage.getTextArea().sendKeys(orderComment);
        checkoutPage.getStepFourContinueButton().click();
        return this;
    }

    public CheckoutPageBL stepFiveSelectCashOnDelivery(String commentOrder) {
        checkoutPage.getCheckoutStep5Open().click();
        checkoutPage.getRadioPaymentMethod().click();
        checkoutPage.getTextArea().clear();
        checkoutPage.getTextArea().sendKeys(commentOrder);
        checkoutPage.getCheckBoxTermsAndConditions().click();
        checkoutPage.getStepFiveContinueButton().click();
        return this;
    }
}
