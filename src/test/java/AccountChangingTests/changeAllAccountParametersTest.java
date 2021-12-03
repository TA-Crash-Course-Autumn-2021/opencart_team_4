package AccountChangingTests;

import TestConfigs.LoggedUserTest;
import TestListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class changeAllAccountParametersTest extends LoggedUserTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void changeAllAccountParameters() {
       HomePageBL homePageBL = new HomePageBL();
       homePageBL.getHeaderPageBL()
                 .myAccount()
                 .myAccountEditClick()
                 .setEmail("pupkin@gmail.com")
                 .setLastName("Doe")
                 .setFirstName("Crash")
                 .setTelephone("+38045731558")
                 .editAccountPageContinueButtonClick();
    }
}
