import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.steps.HomePageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;


import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class HomePageTest extends BaseTest{


    @Test
    public void currencyChangingTest() {
    new Navigation().navigateToUrl(BASE_URL.getValue());
    MainPageBL mainPageBL = new MainPageBL();
    mainPageBL.getHeaderPageBL()
            .headerCurrencyCaretDownClick()
            .headerCurrencyChoose(Currencies.EURO.getCurrency())
            .checkCurrencySymbol("€");
    }


    @Test
    public void oneProductAddingToCartWitQuantityChangingTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.canonAddToCart().productOptionSelectBlue().setQuantity(2).addToCart().successfulProductAdding();
    }

    @Test
    public void twoProductAddingToCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.macbookAddToCart().successProductAddToCartCheck()
                  .iphoneAddToCart().successProductAddToCartCheck();
    }

    @Test
    public void productAddToCartNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart()
                .radioSelectLarge()
                .checkboxSelectSecond()
                .hardFormSetText("Test text")
                .addToCart()
                .fieldRequiredCheck();
    }

    @Test
    public void appleCinemaAddToCartTest() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart()
                .radioSelectMedium()
                .checkboxSelectForth()
                .hardFormSetText("Text field testing")
                .selectYellow().hardFormSetTextArea("Valid add to cart test")
                .hardFormSetDate()
                .hardFormSetHour()
                .hardFormSetDateAndHour()
                .hardFormUploadFile()
                .cartHardFormAlertAccept()
                .addToCart()
                .successfulProductAdding();
    }

    @Test
    public void logoutUserAddToWishListNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.iphoneAddToWishList().unsuccessfulAddToWishListAlert();
    }

    @Test void loggedUserAddTwoProductsToWishListValidTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList()
                .productAddAlertAccept()
                .appleAddToWishList()
                .productAddAlertAccept();
    }

    @Test
    public void logoutUserProductAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCompare()
                .productAddAlertAccept();
    }
}