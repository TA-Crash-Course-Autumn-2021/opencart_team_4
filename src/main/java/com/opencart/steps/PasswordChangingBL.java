package com.opencart.steps;

import com.opencart.pages.PasswordChangingPage;
import org.testng.Assert;

public class PasswordChangingBL {

    private PasswordChangingPage passwordChangingPage;

    public PasswordChangingBL() { passwordChangingPage = new PasswordChangingPage(); }

    public PasswordChangingBL validLoginChange(String newPassword) {
        passwordChangingPage.getChangePasswordString().clear();
        passwordChangingPage.getChangePasswordString().sendKeys(newPassword);
        passwordChangingPage.getChangePasswordConfirmString().clear();
        passwordChangingPage.getChangePasswordConfirmString().sendKeys(newPassword);
        passwordChangingPage.getChangePasswordContinueButton().click();
        return this;
    }

    public MyAccountPageBL successLoginCheck() {
        String expectingMessage = "Success: Your password has been successfully updated.";
        String actualMessage = passwordChangingPage.getSuccessLoginAlert().getText();
        Assert.assertEquals(expectingMessage, actualMessage);
        return new MyAccountPageBL();
    }
}
