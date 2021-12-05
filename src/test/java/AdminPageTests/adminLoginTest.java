package AdminPageTests;

import TestConfigs.adminTest;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

public class adminLoginTest extends adminTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void loginAdminTest() {
    }
}
