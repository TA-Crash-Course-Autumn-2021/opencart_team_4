package AddToCartTests;

import TestConfigs.baseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class fourProductsAddToCartTest extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void fourProductsAddingToCartTest() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart()
                  .getHeaderPageBL()
                  .headerClickOnHomeButton()
                  .canonAddToCart()
                  .getHeaderPageBL()
                  .headerClickOnHomeButton()
                  .macbookAddToCart()
                  .getHeaderPageBL()
                  .headerClickOnHomeButton()
                  .iphoneAddToCart();
    }
}
