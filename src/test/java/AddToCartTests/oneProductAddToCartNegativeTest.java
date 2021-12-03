package AddToCartTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class oneProductAddToCartNegativeTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void productAddToCartNegativeTest() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart()
                .radioSelectLarge()
                .checkboxSelectSecond()
                .hardFormSetText("Test text")
                .addToCart()
                .fieldRequiredCheck();
    }
}
