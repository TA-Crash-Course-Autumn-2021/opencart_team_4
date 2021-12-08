package loginTests;

import testConfigs.LoggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class ValidPasswordChangingTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void validPasswordChanging() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .myAccount()
                .myAccountPassChangeClick()
                .validPasswordChange("6655566");
    }
}
