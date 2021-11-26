package com.opencart.steps;


import com.opencart.pages.Forms.CartHardForm;
import com.opencart.pages.Forms.CartMediumForm;
import com.opencart.pages.SearchPage;
import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


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

    public SearchPageBL successSearchResult() {
        int result = searchPage.getProducts().size();
        Assert.assertTrue(result > 0, "Search string error");
        return this;
    }

    public SearchPageBL unsuccessfulSearchResult() {
        String expected = "There is no product that matches the search criteria.";
        String actual = searchPage.getUnsuccessfulSearchingResult().getText();
        Assert.assertEquals(actual, expected, "Search error");
        return this;
    }

    public SearchPageBL useSearch(String product) {
        searchPage.getSearch().clear();
        searchPage.getSearch().sendKeys(product);
        searchPage.getSearchButton().click();
        return this;
    }
    public SearchPageBL successSearchAddToCartCheck() {
        String expected = "shopping cart";
        String actual = searchPage.getSuccessfulAddToCartAlert().getText();
        Assert.assertTrue(actual.contains(expected), "Error: product didn't added to shopping cart");
        return this;
    }

    public CartHardForm getHardForm() { return new CartHardForm(); }

    public CartMediumForm getMediumForm() { return new CartMediumForm(); }
}