import com.opencart.datamodel.RegisterModel;
import com.opencart.navigation.Navigation;
import com.opencart.repository.RegisterModelRepository;
import com.opencart.steps.HomePageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserStories extends BaseTest {

    @Test
    public void addToCompareAndAddToWishlist(){
        HomePageBL homePageBL = new HomePageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        homePageBL.macbookAddToCompare().successfulAddToCompareAlert()
                  .iphoneAddToWishList().successfulAddToWishListAlert();
    }

    @Test
    public void loggedUserOneProductOrder() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLoginButton().loginValidUser();
        mainPageBL.getHeaderPageBL().headerClickOnHomeButton().iphoneAddToCart();
        mainPageBL.getHeaderPageBL().clickOnHeaderCheckoutButton().checkoutStandardTemplate("Comment textarea test!!!1234567890");
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
                .validPasswordChange("6655566")
                .successLoginCheck()
                .getRightMenuBL()
                .clickOnLogoutButton();
    }

    @Test
    public void userCreateLoginChangePassLoginNewPass() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewRandomPerson().getRegisterVerify();
        RegisterModel model = RegisterModelRepository.getNewRandomRegisterModel();
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
    }
}
