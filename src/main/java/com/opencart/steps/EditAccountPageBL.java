package com.opencart.steps;

import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.EditAccountPage;
import com.opencart.repository.RegisterModelRepository;
import org.testng.Assert;

public class EditAccountPageBL {

    private EditAccountPage editAccountPage;

    public EditAccountPageBL(){ editAccountPage = new EditAccountPage(); }

    public EditAccountPageBL setFirstName(String firstName){
        editAccountPage.getFirstNameString().clear();
        editAccountPage.getFirstNameString().sendKeys(firstName);
        return this;
    }

    public EditAccountPageBL setLastName(String lastName){
        editAccountPage.getLastNameString().clear();
        editAccountPage.getLastNameString().sendKeys(lastName);
        return this;
    }

    public EditAccountPageBL setEmail(String email){
        editAccountPage.getEmailString().clear();
        editAccountPage.getEmailString().sendKeys(email);
        return this;
    }

    public EditAccountPageBL setTelephone(String telephone){
        editAccountPage.getTelephoneString().clear();
        editAccountPage.getTelephoneString().sendKeys(telephone);
        return this;
    }

    public EditAccountPageBL editAccountPageContinueButtonClick(){
        editAccountPage.getEditAccountContinueButton().click();
        confirmAccountChanging();
        return this;
    }

    public MyAccountPageBL confirmAccountChanging() {
       String actual =  editAccountPage.getChangesConfirmMessage().getText();
       String expected = "Success: Your account has been successfully updated.";
       Assert.assertTrue(actual.contains(expected), "Changes are not success");
       return new MyAccountPageBL();
    }
}
