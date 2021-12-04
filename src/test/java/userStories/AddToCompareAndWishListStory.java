package userStories;

import testConfigs.LoggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class AddToCompareAndWishListStory extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void addToCompareAndAddToWishlist(){
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.macbookAddToCompare()
                  .iphoneAddToWishList();
    }
}
