package AccountChangingTests;


import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class changeAccountEmailTest extends LoggedUserTest {

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
