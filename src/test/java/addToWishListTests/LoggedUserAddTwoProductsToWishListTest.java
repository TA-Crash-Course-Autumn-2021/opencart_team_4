package addToWishListTests;


import testConfigs.LoggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
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
