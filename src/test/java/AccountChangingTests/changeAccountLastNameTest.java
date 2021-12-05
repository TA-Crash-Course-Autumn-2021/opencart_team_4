package AccountChangingTests;

import TestConfigs.loggedUserTest;
import com.opencart.testListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;



public class changeAccountLastNameTest extends loggedUserTest {

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
