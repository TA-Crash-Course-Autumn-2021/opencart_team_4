package UserStories;

import TestConfigs.loggedUserTest;
import com.opencart.steps.HomePageBL;;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class loginValidUserPassChangeStory extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void userLoginStoryTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .myAccount()
                  .myAccountPassChangeClick()
                  .validPasswordChange("6655566");
    }
}
