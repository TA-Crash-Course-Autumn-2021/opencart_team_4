package accountBlockTest;

import testConfigs.RegisterRandomUser;
import com.opencart.steps.LoginPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class invalidLoginAccountBlockTest extends RegisterRandomUser {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidLoginAccountBlockTest() {
        LoginPageBL loginPageBL = new LoginPageBL();
        loginPageBL.randomUserInvalidLogin();
    }
}
