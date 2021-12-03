package LoginTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class validPasswordChangingTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void validPasswordChanging() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .myAccount()
                .myAccountPassChangeClick()
                .validPasswordChange("6655566");
    }
}
