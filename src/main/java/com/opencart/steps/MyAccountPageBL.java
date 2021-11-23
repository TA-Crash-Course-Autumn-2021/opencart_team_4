package com.opencart.steps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.MyAccountPage;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL(){ myAccountPage = new MyAccountPage(); }

    // TODO: 18.11.2021 Поки що воід, ПЕРЕПИСАТИ!!!

    public EditAccountPageBL myAccountEditClick(){
        myAccountPage.getMyAccountEdit().click();
        return new EditAccountPageBL();
    }

    public PasswordChangingBL myAccountPassChangeClick(){
        Actions builder = new Actions(DriverRepository.DRIVERS.get());
        myAccountPage.getMyAccountPassChange().click();
        return new PasswordChangingBL();
    }

    public void myAccountAddressBookModifyClick(){ myAccountPage.getMyAccountAddressBook().click(); }

    public void myAccountWishListModifyClick(){ myAccountPage.getMyAccountWishList().click(); }

    public RightMenuBL getRightMenuBL() {
        return new RightMenuBL();
    }
}
