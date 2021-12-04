package addToWishListTests;

import testConfigs.LoggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class LoggedUserAddFourProductsToWishListTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginUserFourProductAddToWishList() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .canonAddToWishList()
                .iphoneAddToWishList()
                .appleAddToWishList()
                .macbookAddToWishList();
    }
}
