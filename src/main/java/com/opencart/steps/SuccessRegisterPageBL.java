package com.opencart.steps;


import com.opencart.pages.SuccessRegisterPage;
import org.testng.Assert;

public class SuccessRegisterPageBL {
    private SuccessRegisterPage successRegisterPage;

    public SuccessRegisterPageBL() { successRegisterPage = new SuccessRegisterPage(); }

    public void getRegisterVerify() {
      String expected = successRegisterPage.getSuccessTitle().getText();
      String actual = "Your Account Has Been Created!";
        Assert.assertEquals(expected, actual, "Registration was not verified");
    }
}
