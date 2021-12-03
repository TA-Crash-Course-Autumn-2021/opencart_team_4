import com.opencart.driver.DriverRepository;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.opencart.enums.URLs.BASE_URL;

public class AccountTest extends BaseTest {

    @Test
    public void changeAccountFirstName() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountEditClick()
                .setFirstName("Petro")
                .editAccountPageContinueButtonClick()
                .confirmAccountChanging();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }


    @Test
    public void changeAccountLastName() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountEditClick()
                .setLastName("Schur")
                .editAccountPageContinueButtonClick()
                .confirmAccountChanging();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }

    @Test
    public void changeAccountTelephone() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountEditClick()
                .setTelephone("+380974554572")
                .editAccountPageContinueButtonClick()
                .confirmAccountChanging();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }

    @Test
    public void changeAccountEmail() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountEditClick()
                .setEmail("pupkin@gmail.com")
                .editAccountPageContinueButtonClick()
                .confirmAccountChanging();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }

    @Test
    public void changeAllAccountParameters() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck()
                .myAccountEditClick()
                .setEmail("pupkin@gmail.com")
                .setLastName("Doe")
                .setFirstName("Crash")
                .setTelephone("+38045731558")
                .editAccountPageContinueButtonClick()
                .confirmAccountChanging();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }
}
