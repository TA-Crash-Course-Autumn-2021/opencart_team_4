package accountChangingTests;


import testConfigs.LoggedUserTest;
import com.opencart.testListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class ChangeAccountEmailTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void changeAccountEmail() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .myAccount()
                  .myAccountEditClick()
                  .setEmail("pupkin@gmail.com")
                  .editAccountPageContinueButtonClick();
    }
}
