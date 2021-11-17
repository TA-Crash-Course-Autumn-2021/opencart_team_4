package com.opencart.steps;


import com.opencart.pages.RightMenu;

public class RightMenuBL {

    private RightMenu rightMenu;

    public RightMenuBL(){ rightMenu = new RightMenu(); }

    public void loginClick(){ rightMenu.getLogin().click(); }

    public void addressBookClick(){ rightMenu.getAddressBook().click(); }

    public void downloadsClick(){ rightMenu.getDownloads().click(); }

    public void forgottenPassClick(){ rightMenu.getForgottenPass().click(); }

    public void myAccountClick(){ rightMenu.getMyAccount().click(); }

    public void newsLetterClick(){ rightMenu.getNewsLetter().click(); }

    public void orderHistoryClick(){ rightMenu.getOrderHistory().click(); }

    public void recurringPaymentClick(){ rightMenu.getRecurringPayments().click(); }

    public void returnsClick(){ rightMenu.getReturns().click(); }

    public void rewardPointsClick(){ rightMenu.getRewardPoints().click(); }

    public void transactionClick(){ rightMenu.getTransactions().click(); }

    public void wishListClick(){ rightMenu.getWishList().click(); }

    public void registerClick(){ rightMenu.getRegister().click(); }

}
