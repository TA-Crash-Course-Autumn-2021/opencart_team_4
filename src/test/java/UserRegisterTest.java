import com.opencart.navigation.Navigation;
import com.opencart.pages.SuccessRegisterPage;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RegisterPageBL;
import com.opencart.steps.SuccessRegisterPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest {

    @Test
    public void registerUserWithInvalidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewInvalidPerson();
        registerPageBL.passwordNotMatchCheck();
    }

     @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
                mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewRandomPerson().getRegisterVerify();
    }
}