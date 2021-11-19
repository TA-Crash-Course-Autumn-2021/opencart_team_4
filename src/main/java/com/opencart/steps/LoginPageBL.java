package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.driver.DriverRepository;
import com.opencart.pages.LoginPage;
import com.opencart.repository.RegisterModelRepository;
import org.testng.Assert;


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

    public LoginPageBL loginValidUser() {
       RegisterModel loginModel = RegisterModelRepository.getValidModel();
        loginPageSetEmail(loginModel.getEmail());
        loginPageSetPass(loginModel.getPassword());
        loginPageLoginButtonClick();
        return this;
    }

    public LoginPageBL loginInvalidUser() {
       RegisterModel loginModel = RegisterModelRepository.getInvalidRegisterModel();
        loginPageSetEmail(loginModel.getEmail());
        loginPageSetPass(loginModel.getPassword());
        loginPageLoginButtonClick();
        return this;
    }

    public MyAccountPageBL successLoginCheck() {
        String expected = "https://demo.opencart.com/index.php?route=account/account";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
        return new MyAccountPageBL();
    }

    public LoginPageBL unsuccessLoginCheck() {
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = loginPage.getUnsuccessfulLoginAlert().getText();
        Assert.assertEquals(expected, actual);
        return this;
    }
}
