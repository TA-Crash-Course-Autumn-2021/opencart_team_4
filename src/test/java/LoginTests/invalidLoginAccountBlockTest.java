package LoginTests;

import TestConfigs.registerRandomUser;
import com.opencart.steps.LoginPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class invalidLoginAccountBlockTest extends registerRandomUser {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidLoginAccountBlockTest() {
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.randomUserInvalidLogin();
    }
}
