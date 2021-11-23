package com.opencart.steps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.Forms.CartHardForm;
import com.opencart.pages.Forms.CartMediumForm;
import com.opencart.pages.HomePage;
import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePageBL {

   private HomePage homePage;

   public HomePageBL(){ homePage = new HomePage();}

   public HomePageBL productAddToCart(WebElement chooseProduct) {
       chooseProduct.findElement(By.xpath("//div[@id = 'content']//*[contains(@class, 'shopping-cart')]/..")).click();
       return this;
   }

   public HomePageBL clickOnProduct(WebElement choosenProduct) {
       choosenProduct.findElement(By.xpath("./h4/a")).click();
       return this;
   }

   public HomePageBL macbookAddToCart() {
       homePage.getMacbookAddToCart().click();
       return this;
   }

   public HomePageBL macbookAddToCompare() {
       homePage.getMacbookAddToCompare().click();
       return this;
   }

   public HomePageBL macbookAddToWishList() {
       homePage.getMacbookAddToWishList().click();
       return this;
   }

   public HomePageBL iphoneAddToCart() {
       homePage.getIphoneAddToCart().click();
       return this;
   }

   public HomePageBL iphoneAddToCompare() {
       homePage.getIphoneAddToCompare().click();
       return this;
   }

   public HomePageBL iphoneAddToWishList() {
       homePage.getIphoneAddToWishList().click();
       return this;
   }

   public CartHardForm appleAddToCart() {
       homePage.getAppleCinemaAddToCart().click();
       return new CartHardForm();
   }

   public HomePageBL appleAddToCompare() {
       homePage.getAppleCinemaAddToCompare().click();
       return this;
   }

   public HomePageBL appleAddToWishList() {
       homePage.getAppleCinemaAddToWishList().click();
       return this;
   }

   public CartMediumForm canonAddToCart() {
       homePage.getCanonEOSAddToCart().click();
       return new CartMediumForm();
   }

   public HomePageBL canonAddToCompare() {
       homePage.getCanonEOSAddToCompare().click();
       return this;
   }

   public HomePageBL canonAddToWishList() {
       homePage.getCanonEOSAddToWishList().click();
       return this;
   }

   public HomePageBL successProductAddToCartCheck() {
       String expected = "shopping cart";
       String actual = homePage.getSuccessfulAddToCartAlert().getText();
       Assert.assertTrue(actual.contains(expected), "Error: product not added to cart");
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
       String actual = homePage.getSuccessfulAddToWishListAlert().getText();
       Assert.assertTrue(actual.contains(expected), "Error: logged user can't add product to \"Wish List\"");
       return this;
   }

    public HomePageBL successfulAddToCompareAlert() {
        String expected = "product comparison";
        String actual = homePage.getSuccessfulAddToCompareAlert().getText();
        Assert.assertTrue(actual.contains(expected));
        return this;
    }
}