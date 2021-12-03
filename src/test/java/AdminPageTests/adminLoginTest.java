package AdminPageTests;

import TestConfigs.BaseTest;
import TestListener.TestRetry;
import org.testng.annotations.Test;

public class adminLoginTest extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginAdminTest() {
    }
}
