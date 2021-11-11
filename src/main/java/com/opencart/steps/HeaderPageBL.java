package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.pages.SearchPage;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public SearchPage useSearch(String product){
        headerPage.getSearch().click();
        headerPage.getSearch().clear();
        headerPage.getSearch().sendKeys(product);
        headerPage.getSearchStringSubmit().click();
        return new SearchPage();
    }
}
