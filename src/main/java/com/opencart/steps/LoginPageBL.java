package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.driver.DriverRepository;
import com.opencart.pages.LoginPage;
import com.opencart.repository.RegisterModelRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class LoginPageBL {

    private String loginEmail;
    private String loginPassword;
    private LoginPage loginPage;
    private static String newPassword;
    private static String randomPassword;
    private static String randomEmail;

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

    public LoginPageBL loginRandomChangedUser() {
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.loginPageSetEmail(getRandomEmail());
        loginPageBL.loginPageSetPass(getNewPassword());
        loginPageBL.loginPageLoginButtonClick();
        return new LoginPageBL();
    }

    public LoginPageBL loginInvalidUser() {
       RegisterModel loginModel = RegisterModelRepository.getInvalidRegisterModel();
        loginPageSetEmail(loginModel.getEmail());
        loginPageSetPass(loginModel.getPassword());
        loginPageLoginButtonClick();
        return this;
    }

    public LoginPageBL randomUserInvalidLogin() {
        int count = 0;
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPageSetPass("45464646")
                .loginPageSetEmail(LoginPageBL.getRandomEmail());
        do{
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.loginPageLoginButtonClick();
        count++;
        }while(count<6);
        loginRandom();
        String expected = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        String actual = loginPage.getUnsuccessfulLoginAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected));
        return this;
    }

    public LoginPageBL loginRandom() {
        loginPageSetEmail(LoginPageBL.getRandomEmail());
        loginPageSetPass(LoginPageBL.getRandomPassword());
        loginPageLoginButtonClick();
        return this;
    }

    public MyAccountPageBL successLoginCheck() {
        String expected = "http://localhost/opencart/upload/index.php?route=account/account";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
        return new MyAccountPageBL();
    }

    public LoginPageBL unsuccessLoginCheck() {
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = loginPage.getUnsuccessfulLoginAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected));
        return this;
    }

    public static String getNewPassword() { return newPassword; }

    public static String getRandomEmail() { return randomEmail; }

    public static String getRandomPassword() { return randomPassword; }

    public static void setRandomPassword(String randomPassword) { LoginPageBL.randomPassword = randomPassword; }

    public static void setRandomEmail(String randomEmail) { LoginPageBL.randomEmail = randomEmail; }

    public static void setNewPassword(String newPassword) { LoginPageBL.newPassword = newPassword;}
}
