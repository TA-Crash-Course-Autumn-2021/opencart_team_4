package adminPageTests;

import testConfigs.AdminTest;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class AdminLoginTest extends AdminTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginAdminTest() {
    }
}
