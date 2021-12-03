package com.opencart.steps;

import com.opencart.pages.Forms.CartHardForm;
import com.opencart.pages.Forms.CartMediumForm;
import com.opencart.pages.HomePage;
import org.testng.Assert;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class HomePageBL {

   private HomePage homePage;

   public HomePageBL(){ homePage = new HomePage();}

    private static List<Integer> prices = new ArrayList<>();

    public static List<Integer> getPrices() { return prices; }

    public HeaderPageBL getHeaderPageBL() { return new HeaderPageBL(); }

   public HomePageBL macbookAddToCart() {
       homePage.getMacbookAddToCart().click();
       successProductAddToCartCheck();
       return this;
   }

   public HomePageBL macbookAddToCompare() {
       homePage.getMacbookAddToCompare().click();
       successfulAddToCompareAlert();
       return this;
   }

   public HomePageBL macbookAddToWishList() {
       homePage.getMacbookAddToWishList().click();
       successfulAddToWishListAlert();
       return this;
   }

   public HomePageBL iphoneAddToCart() {
       homePage.getIphoneAddToCart().click();
       successProductAddToCartCheck();
       return this;
   }

   public HomePageBL iphoneAddToCompare() {
       homePage.getIphoneAddToCompare().click();
       return this;
   }

   public HomePageBL iphoneAddToWishList() {
       homePage.getIphoneAddToWishList().click();
       successfulAddToWishListAlert();
       return this;
   }

   public CartHardForm appleAddToCart() throws InterruptedException, AWTException {
       homePage.getAppleCinemaAddToCart().click();
       CartHardForm cartHardForm = new CartHardForm();
       cartHardForm.hardFormTemplate();
       return new CartHardForm();
   }

   public HomePageBL appleAddToCompare() {
       homePage.getAppleCinemaAddToCompare().click();
       successfulAddToCompareAlert();
       return this;
   }

   public HomePageBL appleAddToWishList() {
       homePage.getAppleCinemaAddToWishList().click();
       successfulAddToWishListAlert();
       return this;
   }

   public CartMediumForm canonAddToCart() {
       homePage.getCanonEOSAddToCart().click();
       CartMediumForm mediumForm = new CartMediumForm();
       mediumForm.mediumFormTemplate();
       return new CartMediumForm();
   }

   public HomePageBL canonAddToCompare() {
       homePage.getCanonEOSAddToCompare().click();
       return this;
   }

   public HomePageBL canonAddToWishList() {
       homePage.getCanonEOSAddToWishList().click();
       successfulAddToWishListAlert();
       return this;
   }

   public HomePageBL successProductAddToCartCheck() {
       String expected = "shopping cart".trim().toLowerCase();
       String success = "Success: You have added".trim().toLowerCase();
       String actual = homePage.getSuccessfulAlert().getText().trim().toLowerCase();
       Assert.assertTrue(actual.contains(expected) & actual.contains(success), "Error: product not added to cart");
       return this;
   }

   public HomePageBL unsuccessfulAddToWishListAlert() {
      String expected = "login";
      String actual =  homePage.getUnsuccessfulAddToWishListAlert().getText();
      Assert.assertTrue(actual.contains(expected), "Error: logout or unregistered user can add product to \"WishList\"");
      return this;
   }

   public HomePageBL successfulAddToWishListAlert() {
       String expected = "wish list";
       String actual = homePage.getSuccessfulAlert().getText();
       Assert.assertTrue(actual.contains(expected), "Error: logout user can't add product to \"Wish List\"");
       return this;
   }

    public HomePageBL successfulAddToCompareAlert() {
               String actual = homePage.getSuccessfulAlert().getText();
               String expected = "product comparison";
               Assert.assertTrue(actual.contains(expected));
        return this;
    }

    public static void setPrices(List<Integer> prices) { HomePageBL.prices = prices; }
}