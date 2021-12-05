package AddToCartTests;

import TestConfigs.baseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class twoProductsAddToCartUsingSearchTest extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void twoProductsAddingToCartUsingSearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("")
                .searchAddToCart("macbook")
                .searchAddToCart("iphone");
    }
}
