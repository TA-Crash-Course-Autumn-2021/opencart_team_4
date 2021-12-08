package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.PasswordChangingPage;
import com.opencart.repository.RegisterModelRepository;
import org.testng.Assert;

public class PasswordChangingBL {

    private PasswordChangingPage passwordChangingPage;

    public PasswordChangingBL() { passwordChangingPage = new PasswordChangingPage(); }

    public PasswordChangingBL validPasswordChange(String newPassword) {
        passwordChangingPage.getChangePasswordString().clear();
        passwordChangingPage.getChangePasswordString().sendKeys(newPassword);
        passwordChangingPage.getChangePasswordConfirmString().clear();
        passwordChangingPage.getChangePasswordConfirmString().sendKeys(newPassword);
        passwordChangingPage.getChangePasswordContinueButton().click();
        successLoginCheck();
        return this;
    }

    public PasswordChangingBL invalidPasswordChange() {
        RegisterModel model = RegisterModelRepository.getInvalidRegisterModel();
        passwordChangingPage.getChangePasswordString().clear();
        passwordChangingPage.getChangePasswordString().sendKeys(model.getPassword());
        passwordChangingPage.getChangePasswordConfirmString().clear();
        passwordChangingPage.getChangePasswordConfirmString().sendKeys(model.getPasswordConfirm());
        passwordChangingPage.getChangePasswordContinueButton().click();
        passMatchError();
        return this;
    }

    public PasswordChangingBL randomUserNewPassLogin(String newPassword) {
        validPasswordChange(newPassword);
        LoginPageBL.setNewPassword(newPassword);
        return this;
    }

    public MyAccountPageBL successLoginCheck() {
        String expectingMessage = "Success: Your password has been successfully updated.";
        String actualMessage = passwordChangingPage.getSuccessLoginAlert().getText();
        Assert.assertEquals(expectingMessage, actualMessage);
        return new MyAccountPageBL();
    }

    public PasswordChangingBL passMatchError() {
        String expected = "Password confirmation does not match password!";
        String actual = passwordChangingPage.getPassMatchError().getText();
        Assert.assertTrue(actual.contains(expected), "Error: password confirmation doesn't work");
        return this;
    }
}
