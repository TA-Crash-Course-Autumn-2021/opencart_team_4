package accountChangingTests;

import testConfigs.LoggedUserTest;
import com.opencart.testListener.TestRetry;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;


public class ChangeAccountFirstNameTest extends LoggedUserTest {

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
