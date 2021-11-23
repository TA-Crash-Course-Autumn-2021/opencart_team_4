import com.opencart.navigation.Navigation;
import com.opencart.pages.RightMenu;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RightMenuBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .getRightMenuBL()
                .clickOnLogoutButton();
    }

    @Test
    public void invalidLoginTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginInvalidUser()
                .unsuccessLoginCheck();
    }


    @Test
    public void validPasswordChanging() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountPassChangeClick()
                .validLoginChange("6655566")
                .successLoginCheck()
                .getRightMenuBL()
                .clickOnLogoutButton();
    }

    @Test
    public void userLoginStoryTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountPassChangeClick()
                .validLoginChange("6655566")
                .successLoginCheck()
                .getRightMenuBL()
                .clickOnLogoutButton();
    }
}