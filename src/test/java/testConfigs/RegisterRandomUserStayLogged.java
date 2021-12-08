package testConfigs;

import com.opencart.driver.DriverRepository;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import static com.opencart.enums.URLs.BASE_URL;

public class RegisterRandomUserStayLogged {


    @BeforeTest
    public void registerRandomUser() {
        DriverRepository.downloadWebDriver();
        DriverRepository.instanceWebBrowser();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewRandomPerson()
                .getRegisterVerify();
        homePageBL.getHeaderPageBL().headerClickOnHomeButton();
    }

    @BeforeMethod
    public void driverSetup() { DriverRepository.downloadWebDriver(); }

    @AfterSuite
    public void closeBrowser() {
        DriverRepository.closeBrowser();
    }
}
