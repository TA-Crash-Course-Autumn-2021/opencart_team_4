package AccountChangingTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;



public class changeAccountLastNameTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void changeAccountLastName() {
      HomePageBL homePageBL = new HomePageBL();
      homePageBL.getHeaderPageBL()
                .myAccount()
                .myAccountEditClick()
                .setLastName("Schur")
                .editAccountPageContinueButtonClick()
                .confirmAccountChanging();
    }
}
