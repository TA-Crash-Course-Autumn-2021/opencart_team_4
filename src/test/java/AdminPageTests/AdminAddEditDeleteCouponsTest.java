import com.opencart.navigation.Navigation;
import com.opencart.pages.HeaderPage;
import com.opencart.steps.AdminSteps.AdminLoginPageBL;
import com.opencart.steps.CartPageBL;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;
import static com.opencart.enums.URLs.BASE_URL;

public class AdminAddEditDeleteCouponsTest extends BaseTest {

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
