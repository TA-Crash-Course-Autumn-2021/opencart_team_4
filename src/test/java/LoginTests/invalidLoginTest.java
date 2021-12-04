package LoginTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class invalidLoginTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidLoginTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .logoutUser()
                  .getHeaderPageBL()
                  .loginInvalidUser();
    }
}
