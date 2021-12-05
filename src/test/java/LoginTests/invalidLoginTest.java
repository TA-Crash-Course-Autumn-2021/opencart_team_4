package LoginTests;

import TestConfigs.loggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class invalidLoginTest extends loggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidLoginTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .logoutUser()
                  .getHeaderPageBL()
                  .loginInvalidUser();
    }
}
