package UserRegisterTests;

import TestConfigs.baseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class registerUserWithValidParameters extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewRandomPerson()
                .getRegisterVerify();
    }
}
