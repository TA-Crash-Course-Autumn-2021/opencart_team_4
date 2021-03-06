package UserStories;

import TestConfigs.baseTest;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class newUserChangePassLoginWithNewPassStory extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void userCreateLoginChangePassLoginNewPass() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewRandomPerson().getRegisterVerify();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginRandom()
                .successLoginCheck()
                .myAccountPassChangeClick()
                .randomUserNewPassLogin("666666")
                .successLoginCheck()
                .getRightMenuBL()
                .clickOnLogoutButton();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginRandomChangedUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL().logoutUser();
    }
}
