package LoginTests;

import TestConfigs.loggedUserTest;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class validLoginTest extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void validLoginTest() {
    }
}
