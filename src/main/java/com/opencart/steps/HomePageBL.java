package com.opencart.steps;

import com.opencart.pages.HomePage;
import com.opencart.pages.containers.ProductContainer;


public class HomePageBL {

   private HomePage homePage;
   public HomePageBL(){ homePage = new HomePage();}


   public HomePageBL homeAddToCart(String productName){
      ProductContainer product = homePage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
      product.productAddToCart().click();
      return this;
   }

   public HomePageBL homeAddToWishList(String productName){
       ProductContainer product = homePage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
       product.productAddToWishList().click();
       return this;
   }

   public HomePageBL homeAddToCompare(String productName){
       ProductContainer product = homePage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
       product.productAddToCompare().click();
       return this;
   }

   public ProductPageBL homeClickOnProduct(String productName){
       ProductContainer product = homePage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
       product.clickOnProduct().click();
       return new ProductPageBL();
   }
}
