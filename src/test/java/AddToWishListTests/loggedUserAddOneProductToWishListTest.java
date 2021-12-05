package AddToWishListTests;

import TestConfigs.loggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class loggedUserAddOneProductToWishListTest extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loggedUserAddOneProductsToWishListValidTest() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList();
    }
}
