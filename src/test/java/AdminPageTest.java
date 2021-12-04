import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.pages.HeaderPage;
import com.opencart.pages.containers.CartOrderingResultPrice;
import com.opencart.steps.AdminSteps.*;

import com.opencart.steps.CartPageBL;
import com.opencart.steps.HeaderPageCart;
import com.opencart.steps.HomePageBL;
import com.opencart.steps.MainPageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

import java.util.List;

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
    public void adminAddNewCoupons() {
       new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categoryMarketingClick()
                .clickOnCoupons()
                .clickOnAddNewCouponsButton()
                .createNew0001CouponForAllProducts();

        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.macbookAddToCart().successProductAddToCartCheck();

        HeaderPage header = new HeaderPage();
        header.getHeaderUpperCart().click();

        CartPageBL page = new CartPageBL();
        page.cartClickOnCodeCoupon()
                .cartClickOnAddCodeCoupon("0001")
                .cartClickOnApplyCodeCoupon()
                .couponApplyCheck();

    }

    @Test
    public void adminEditCoupons() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categoryMarketingClick()
                .clickOnCoupons()
                .clickOnEditCouponsButton("22222")
                .editCouponDisabled()
                .couponEditSuccessCheck();

    }

    @Test
    public void adminDeleteCoupons() {
       new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categoryMarketingClick()
                .clickOnCoupons()
                .clickOnAddNewCouponsButton()
                .createNew0001CouponForAllProducts();

        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL2 = new AdminLoginPageBL();
        adminLoginPageBL2.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categoryMarketingClick()
                .clickOnCoupons()
                .clickOnDeleteCoupons("0001")
                .couponDeleteSuccessCheck();
    }
}



