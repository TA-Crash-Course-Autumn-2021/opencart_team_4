package AccountChangingTests;


import TestConfigs.loggedUserTest;
import com.opencart.testListener.TestRetry;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;


public class changeAllAccountParametersTest extends loggedUserTest {

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
