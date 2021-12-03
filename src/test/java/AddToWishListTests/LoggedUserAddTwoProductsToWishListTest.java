package AddToWishListTests;


import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

public class LoggedUserAddTwoProductsToWishListTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loggedUserAddTwoProductsToWishListValidTest() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList()
                .macbookAddToWishList();
    }
}
