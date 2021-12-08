package loginTests;

import testConfigs.LoggedUserTest;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class ValidLoginTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void validLoginTest() {
    }
}
