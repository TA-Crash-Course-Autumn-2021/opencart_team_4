package loginTests;

import testConfigs.LoggedUserTest;
import com.opencart.steps.HomePageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;


public class InvalidLoginTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidLoginTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .logoutUser()
                  .getHeaderPageBL()
                  .loginInvalidUser();
    }
}
