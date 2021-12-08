package userRegisterTests;

import testConfigs.BaseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RegisterPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class RegisterUserWithInvalidParameters extends BaseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void registerUserWithInvalidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewInvalidPerson();
        registerPageBL.passwordNotMatchCheck();
    }
}
