package AddToWishListTests;

import TestConfigs.loggedUserTest;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class loggedUserAddFourProductsToWishListTest extends loggedUserTest {

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
