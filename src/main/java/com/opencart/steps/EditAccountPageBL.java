package com.opencart.steps;

import com.opencart.pages.EditAccountPage;

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

    public MyAccountPageBL editAccountPageContinueButtonClick(){
        editAccountPage.getEditAccountContinueButton().click();
        return new MyAccountPageBL();
    }
}
