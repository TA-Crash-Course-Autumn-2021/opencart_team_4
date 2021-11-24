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
}
