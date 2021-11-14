package com.opencart.steps;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.SearchPage;
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

    public ProductPageBL searchPageProductClick(String product) throws Exception {
        DriverRepository.DRIVERS.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        for(WebElement current : searchPage.getSearchedProducts()){
            if(current != null & current.getText().equalsIgnoreCase(product)){
                current.click();
                break;
            }
        }
    return new ProductPageBL();
    }
}