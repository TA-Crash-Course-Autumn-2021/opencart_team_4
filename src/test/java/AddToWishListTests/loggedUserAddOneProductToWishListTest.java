package AddToWishListTests;

import TestConfigs.BaseTest;
import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

public class loggedUserAddOneProductToWishListTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loggedUserAddOneProductsToWishListValidTest() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList();
    }
}
