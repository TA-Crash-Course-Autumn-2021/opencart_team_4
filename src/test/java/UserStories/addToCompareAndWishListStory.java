package UserStories;

import TestConfigs.loggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class addToCompareAndWishListStory extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void addToCompareAndAddToWishlist(){
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.macbookAddToCompare()
                  .iphoneAddToWishList();
    }
}
