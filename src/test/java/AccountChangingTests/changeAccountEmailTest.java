package AccountChangingTests;


import TestConfigs.loggedUserTest;
import com.opencart.testListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class changeAccountEmailTest extends loggedUserTest {

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
