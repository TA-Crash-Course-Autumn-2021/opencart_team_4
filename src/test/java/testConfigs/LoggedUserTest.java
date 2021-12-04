package testConfigs;

import com.opencart.navigation.Navigation;
import com.opencart.steps.HeaderPageBL;
import org.testng.annotations.BeforeMethod;

import static com.opencart.enums.URLs.BASE_URL;

public class LoggedUserTest extends BaseTest{

    @BeforeMethod
    public void login() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HeaderPageBL headerPageBL = new HeaderPageBL();
        headerPageBL.loginValidUser();
        headerPageBL.headerClickOnHomeButton();
    }
}
