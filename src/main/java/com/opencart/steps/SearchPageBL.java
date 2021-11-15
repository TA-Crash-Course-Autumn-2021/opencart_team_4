package com.opencart.steps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.SearchPage;
import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SearchPageBL {

   private SearchPage searchPage;

    public SearchPageBL() {
         searchPage = new SearchPage();
    }

    public SearchPageBL setSearchCategory(String category) {
        searchPage.getSearchFormButton().click();
        for (WebElement target : searchPage.getSearchInCategories()) {
            if(target != null & target.getText().equalsIgnoreCase(category)){
                target.click();
                break;
            }
            }
        return this;
        }

    public SearchPageBL searchInDescription(){
        searchPage.getSearchInDescription().click();
    return this;
    }

    public SearchPageBL searchInSubcategories(){
        searchPage.getSearchInSubCategories().click();
    return this;
    }

    public SearchPageBL searchAddToCompare(String productName){
        ProductContainer product = searchPage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.productAddToCompare().click();
        return this;
    }

    public SearchPageBL searchAddToCart(String productName){
        ProductContainer product = searchPage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.productAddToCart().click();
        return this;
    }

    public SearchPageBL searchAddToWishList(String productName){
        ProductContainer product = searchPage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.productAddToWishList().click();
        return this;
    }

    public ProductPageBL searchClickOnProduct(String productName){
        ProductContainer product = searchPage.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.clickOnProduct().click();
        return new ProductPageBL();
    }

}