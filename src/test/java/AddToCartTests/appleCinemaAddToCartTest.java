package AddToCartTests;

import TestConfigs.baseTest;
import com.opencart.enums.ProductForms.HardSelectForm;
import com.opencart.enums.ProductForms.RadioValues;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class appleCinemaAddToCartTest extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void appleCinemaAddToCartTest() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart();
    }
}
