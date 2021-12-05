import com.opencart.navigation.Navigation;
import com.opencart.pages.HeaderPage;
import com.opencart.steps.AdminSteps.AdminLoginPageBL;
import com.opencart.steps.CartPageBL;
import com.opencart.steps.HomePageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;
import static com.opencart.enums.URLs.BASE_URL;

public class AdminAddEditDeleteGiftVouchersTest extends BaseTest{

    @Test
    public void adminAddEditSendDeleteGiftVouchersTest(){

        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categorySalesClick()
                .clickOnGiftVauchersAll()
                .clickOnGiftVauchersSubCategory()
                .clickOnAddNewGiftVouchersButton()
                .createNew0001GiftVouchers()
                .giftVouchersChangeSuccessCheck()
                .clickOnEditCouponsButton("0001")
                .editGiftVouchers()
                .giftVouchersChangeSuccessCheck()
                .clickOnSendCouponsButton("0001")
                .giftVouchersSendSuccess();


         new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.macbookAddToCart().successProductAddToCartCheck();

        HeaderPage header = new HeaderPage();
        header.getHeaderUpperCart().click();

        CartPageBL page = new CartPageBL();
        page.cartClickOnGiftCertificate()
                .cartClickOnAddGiftCertificate("0001")
                .cartClickOnApplyGiftCertificate()
                .giftCertificateApplyCheck();

        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL2 = new AdminLoginPageBL();
        adminLoginPageBL2.loginAdmin().loginAdminCheck()
                .getNavigationBar()
                .categorySalesClick()
                .clickOnGiftVauchersAll()
                .clickOnGiftVauchersSubCategory()
                .clickOnDeleteGiftVoucher("0001")
                .giftVouchersChangeSuccessCheck();

    }

}



