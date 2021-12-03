package AddToWishListTests;

import TestConfigs.BaseTest;
import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

public class loggedUserAddFourProductsToWishListTest extends LoggedUserTest {

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
