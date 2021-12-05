package AddToCartTests;

import TestConfigs.baseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class fourProductsAddToCartUsingSearchTest extends baseTest {

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
