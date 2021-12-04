package UserStories;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class addToCompareAndWishListStory extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void addToCompareAndAddToWishlist(){
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.macbookAddToCompare()
                  .iphoneAddToWishList();
    }
}
