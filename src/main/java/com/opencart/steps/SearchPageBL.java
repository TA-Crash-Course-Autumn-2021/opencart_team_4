package com.opencart.steps;

import com.opencart.pages.SearchPage;
import org.openqa.selenium.WebElement;

public class SearchPageBL {

    SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public void setSearchCategory(String category) {
        searchPage.getSearchFormButton().click();
        for (WebElement target : searchPage.getSearchInCategories()) {
            if(target != null & target.getText().equalsIgnoreCase(category)){
                target.click();
                break;
            }
            }
        }
}