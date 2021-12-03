package UserStories;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;;
import org.testng.annotations.Test;

public class loginValidUserPassChangeStory extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void userLoginStoryTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .myAccount()
                  .myAccountPassChangeClick()
                  .validPasswordChange("6655566");
    }
}
