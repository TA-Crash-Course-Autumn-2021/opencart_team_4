package LoginTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import org.testng.annotations.Test;


public class validLoginTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void validLoginTest() {
    }
}
