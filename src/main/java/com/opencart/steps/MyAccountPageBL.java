package com.opencart.steps;

import com.opencart.pages.MyAccountPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL(){ myAccountPage = new MyAccountPage(); }

    // TODO: 18.11.2021 Поки що воід, ПЕРЕПИСАТИ!!!

    public void myAccountEditClick(){ myAccountPage.getMyAccountEdit().click(); }

    public void myAccountPassChangeClick(){ myAccountPage.getMyAccountPassChange().click(); }

    public void myAccountAddressBookModifyClick(){ myAccountPage.getMyAccountAddressBook().click(); }

    public void myAccountWishListModifyClick(){ myAccountPage.getMyAccountWishList().click(); }
}
