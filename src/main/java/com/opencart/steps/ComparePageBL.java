package com.opencart.steps;

import com.opencart.navigation.Navigation;
import com.opencart.pages.ComparePage;
import org.testng.Assert;

import static com.opencart.enums.URLs.COMPARE_URL;

public class ComparePageBL {

    private ComparePage comparePage;

    private static int counter = 0;

    public ComparePageBL(){ comparePage = new ComparePage(); }

    public ComparePageBL compareAddToCart(String product){
        comparePage.getCompareAddToCart().get(comparePage.getIndex(product)).click();
        return this;
    }

    public ComparePageBL compareRemove(String product){
        comparePage.getCompareRemove().get(comparePage.getIndex(product)).click();
        return this;
    }

    public ProductPageBL compareClickOnProduct(String product){
        comparePage.getProducts().get(comparePage.getIndex(product)).click();
        return new ProductPageBL();
    }

    public void productsCheck(){
        new Navigation().navigateToUrl(COMPARE_URL.getValue());
        counter++;
        Assert.assertEquals(counter, comparePage.getProducts().size(), "The number of products does not correspond to the specified quantity");
    }
}
