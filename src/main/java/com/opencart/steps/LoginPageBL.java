package com.opencart.steps;

import com.opencart.pages.LoginPage;


public class LoginPageBL {

    private LoginPage loginPage;

    public LoginPageBL() { loginPage = new LoginPage(); }

    public LoginPageBL loginPageSetPass(String password){
        loginPage.getLoginPageSetPassword().clear();
        loginPage.getLoginPageSetPassword().sendKeys(password);
        return this;
    }

    public LoginPageBL loginPageSetEmail(String email) {
        loginPage.getLoginPageSetEmail().clear();
        loginPage.getLoginPageSetEmail().sendKeys(email);
        return this;
    }

    public RegisterPageBL loginPageCreateAccount() {
        loginPage.getLoginPageContinueCreateAccount().click();
        return new RegisterPageBL();
    }

    public MyAccountPageBL loginPageLoginButtonClick() {
        loginPage.getLoginPageLoginButton().click();
        return new MyAccountPageBL();
    }

    public ForgottenPasswordBL loginPageForgottenPass() {
        loginPage.getLoginPageForgottenPass().click();
        return new ForgottenPasswordBL();
    }
}
