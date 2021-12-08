package com.opencart.steps;

import com.opencart.pages.ForgottenPassword;

public class ForgottenPasswordBL {

    // TODO: 17.11.2021  Методи поки що void, виправити!!!! прикрутити до емейлу REGEX
    private ForgottenPassword forgottenPassword;

    public ForgottenPasswordBL(){ forgottenPassword = new ForgottenPassword(); }

    public void forgottenPassSetEmail(String email){
        forgottenPassword.getEmailString().clear();
        forgottenPassword.getEmailString().sendKeys(email);
        forgottenPassword.getContinueButton().click();
    }

    public void forgottenPassBackButton(){
        forgottenPassword.getBackButton().click();
    }
}
