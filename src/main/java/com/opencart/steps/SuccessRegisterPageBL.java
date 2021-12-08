package com.opencart.steps;


import com.opencart.pages.SuccessRegisterPage;
import org.testng.Assert;

public class SuccessRegisterPageBL {
    private SuccessRegisterPage successRegisterPage;

    public SuccessRegisterPageBL() { successRegisterPage = new SuccessRegisterPage(); }

    public SuccessRegisterPageBL getRegisterVerify() {
      String actual = successRegisterPage.getSuccessTitle().getText();
      String expected = "Your Account Has Been Created!";
        Assert.assertTrue(actual.contains(expected), "Registration was not verified");
        return this;
    }
}
