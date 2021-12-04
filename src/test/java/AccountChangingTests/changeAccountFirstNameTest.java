package AccountChangingTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class changeAccountFirstNameTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void changeAccountFirstName() {
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                  .myAccount()
                  .myAccountEditClick()
                  .setFirstName("Petro")
                  .editAccountPageContinueButtonClick();
    }
}
