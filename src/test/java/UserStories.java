import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserStories extends BaseTest {

    @Test
    public void loggedUserOneProductOrder() {
        MainPageBL mainPageBL = new MainPageBL();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLoginButton().loginValidUser();
        mainPageBL.getHeaderPageBL().headerClickOnHomeButton().macbookAddToCart();
        mainPageBL.getHeaderPageBL().clickOnHeaderCheckoutButton().stepTwoSetTemplate();
    }
}
