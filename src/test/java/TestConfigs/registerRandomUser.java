package TestConfigs;

import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.BeforeMethod;

import static com.opencart.enums.URLs.BASE_URL;

public class registerRandomUser extends baseTest{

    @BeforeMethod
    public void registerRandomUser() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                  .clickOnMyAccountButton()
                  .clickOnRegisterButton()
                  .registerNewRandomPerson()
                  .getRegisterVerify();
        homePageBL.getHeaderPageBL()
                  .clickOnMyAccountButton()
                  .clickOnLogoutButton();
    }
}
