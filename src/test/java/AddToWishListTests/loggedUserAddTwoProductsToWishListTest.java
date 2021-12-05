package AddToWishListTests;


import TestConfigs.loggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class loggedUserAddTwoProductsToWishListTest extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loggedUserAddTwoProductsToWishListValidTest() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList()
                .macbookAddToWishList();
    }
}
