package userStories;

import testConfigs.LoggedUserTest;
import com.opencart.steps.HomePageBL;;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class LoginValidUserPassChangeStory extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void userLoginStoryTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .myAccount()
                  .myAccountPassChangeClick()
                  .validPasswordChange("6655566");
    }
}
