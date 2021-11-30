import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.steps.AdminSteps.AdminLoginPageBL;
import com.opencart.steps.AdminSteps.AdminMainPageBL;
import com.opencart.steps.AdminSteps.AdminNavigationBarBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;
import static com.opencart.enums.URLs.BASE_URL;

public class AdminPageTest extends BaseTest {

    @Test
    public void loginAdminTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck();
    }

    @Test
    public void adminNewCurrency() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin()
                .loginAdminCheck();
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
                .checkCurrencySymbol("₴");
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        adminLoginPageBL.loginAdmin()
                .loginAdminCheck();
        adminMainPageBL.getAdminNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnCurrencies()
                .deleteHryvniaCurrency();
    }

    @Test
    public void adminAddEditDeleteTaxRates() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnTaxes()
                .taxRatesClick()
                .addNewTaxClass()
                .newTestTaxRate()
                .taxRateChangesCheck()
                .clickOnTaxEdit()
                .changeTestTaxRate()
                .deleteTestTax()
                .taxRateChangesCheck();
    }

    @Test
    public void adminAddEditDeleteTaxClass() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck().getNavigationBar()
                .categorySystemClick()
                .clickOnLocalisation()
                .clickOnTaxes()
                .taxClassClick()
                .clickOnAddNew()
                .createTestClassTax()
                .taxClassChangesCheck()
                .clickOnTestEdit()
                .editTestTax()
                .editChangesCheck()
                .taxClassChangesCheck()
                .deleteTestTax()
                .taxClassChangesCheck();
    }

    @Test
    public void adminAddEditDeleteManufacturer() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck().getNavigationBar()
                .categoryCatalogClick()
                .clickOnManufacturers()
                .addNewManufacturer()
                .newTestManufacturer()
                .manufacturerChangesCheck()
                .editManufacturer()
                .editTestManufacturer()
                .manufacturerChangesCheck()
                .deleteManufacture()
                .manufacturerChangesCheck();
    }

}