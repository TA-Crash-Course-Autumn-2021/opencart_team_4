package com.opencart.steps;

import com.opencart.pages.HomePage;
import org.openqa.selenium.WebElement;

public class HomePageBL {

   private HomePage homePage;
   public HomePageBL(){ homePage = new HomePage();}

    public ProductPageBL clickOnProduct(String product){
      for(WebElement current : homePage.getProductName()){
         if(current.getText().equalsIgnoreCase(product)){
            current.click();
         }
      }
    return new ProductPageBL();
   }
}
