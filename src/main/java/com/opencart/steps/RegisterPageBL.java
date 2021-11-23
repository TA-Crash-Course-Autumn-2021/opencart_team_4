package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.RegisterPage;
import com.opencart.pages.SuccessRegisterPage;
import com.opencart.repository.RegisterModelRepository;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class RegisterPageBL {

    private RegisterPage registerPage;
    private SuccessRegisterPage successRegisterPage;

    public RegisterPageBL() {
        registerPage = new RegisterPage();
    }

    public RegisterPageBL registerNewInvalidPerson() {
        RegisterModel registerModel = RegisterModelRepository.getInvalidRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputInvalidPassword(registerModel.getPassword());
        inputInvalidPasswordConfirm(registerModel.getPasswordConfirm());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();
        return this;
    }

    public RegisterPageBL registerNewValidPerson() {
        RegisterModel registerModel = RegisterModelRepository.getValidModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        registerPage.getFirstNameInput().clear();
        registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputInvalidPasswordConfirm(String passwordConfirm) {
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(passwordConfirm);
    }

    private void inputInvalidPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
    }

    private void inputPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void chooseSubscribe(int value) {
        new DriverUtils().clickOnElementJS(registerPage.getSubscribeRadioButton(value));
    }

    private void clickPolicyCheckbox() {
        new DriverUtils().clickOnElementJS(registerPage.getPolicy());
    }

    private void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }

    public void verifyUserRegistration() {
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successRegisterPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void passwordNotMatchCheck() {
        String expectedError = "Password confirmation does not match password!";
        Assert.assertTrue(registerPage.getUnsuccessPasswordMatch().contains(expectedError));
    }
}
