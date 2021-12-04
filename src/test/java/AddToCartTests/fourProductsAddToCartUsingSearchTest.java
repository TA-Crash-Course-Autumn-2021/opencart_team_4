package AddToCartTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class fourProductsAddToCartUsingSearchTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void fourProductsAddingToCartUsingSearch() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("")
                .searchAddToCart("macbook")
                .searchAddToCart("iPhone")
                .searchAddToCart("macbook air")
                .searchAddToCart("Samsung SyncMaster 941BW");

    }
}
