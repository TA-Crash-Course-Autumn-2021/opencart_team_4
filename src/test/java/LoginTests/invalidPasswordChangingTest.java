package LoginTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;
import static com.opencart.enums.URLs.BASE_URL;

public class invalidPasswordChangingTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void invalidPasswordChanging() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .myAccount()
                .myAccountPassChangeClick()
                .invalidPasswordChange();
    }
}
