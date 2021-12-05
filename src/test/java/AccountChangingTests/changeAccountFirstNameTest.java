package AccountChangingTests;

import TestConfigs.loggedUserTest;
import com.opencart.testListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;


public class changeAccountFirstNameTest extends loggedUserTest {

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
