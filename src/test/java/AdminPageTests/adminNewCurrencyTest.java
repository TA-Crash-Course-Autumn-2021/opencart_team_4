package AdminPageTests;

import TestConfigs.adminTest;
import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.steps.AdminSteps.AdminLoginPageBL;
import com.opencart.steps.AdminSteps.AdminMainPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;
import static com.opencart.enums.URLs.BASE_URL;

public class adminNewCurrencyTest extends adminTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void adminNewCurrency() {
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        AdminMainPageBL adminMainPageBL = new AdminMainPageBL();
        adminMainPageBL.getAdminNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnCurrencies()
                .addNewCurrencyClick()
                .createHryvniaCurrency();
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().headerCurrencyCaretDownClick()
                .headerCurrencyChoose(Currencies.HRYVNIA.getCurrency())
                .checkCurrencySymbol(Currencies.HRYVNIA.getSymbol());
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        adminLoginPageBL.loginAdmin()
                .getNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnCurrencies()
                .deleteHryvniaCurrency();
    }
}
