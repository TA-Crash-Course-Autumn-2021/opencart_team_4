package loginTests;

import testConfigs.LoggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class InvalidPasswordChangingTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidPasswordChanging() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .myAccount()
                .myAccountPassChangeClick()
                .invalidPasswordChange();
    }
}
