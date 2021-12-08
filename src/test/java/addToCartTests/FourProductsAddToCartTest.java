package addToCartTests;

import testConfigs.BaseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class FourProductsAddToCartTest extends BaseTest {

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
