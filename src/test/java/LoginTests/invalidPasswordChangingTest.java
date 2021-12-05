package LoginTests;

import TestConfigs.loggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class invalidPasswordChangingTest extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidPasswordChanging() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .myAccount()
                .myAccountPassChangeClick()
                .invalidPasswordChange();
    }
}
