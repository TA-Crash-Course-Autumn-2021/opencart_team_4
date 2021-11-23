import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.pages.HomePage;
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
        homePageBL.canonAddToCart()
                .productOptionSelectBlue()
                .setQuantity(2)
                .addToCart()
                .successfulProductAdding();
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
                .selectYellow()
                .hardFormSetTextArea("Valid add to cart test")
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
                .successfulAddToWishListAlert()
                .macbookAddToWishList()
                .successfulAddToWishListAlert();
    }

    @Test
    public void loginUserFourProductAddToWishList() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList().successfulAddToWishListAlert()
                .macbookAddToWishList().successfulAddToWishListAlert()
                .canonAddToWishList().successfulAddToWishListAlert()
                .appleAddToWishList().successfulAddToWishListAlert();
    }

    @Test
    public void logoutUserProductAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCompare()
                .successfulAddToCompareAlert();
    }

    @Test
    public void loginUserOneProductAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL
                .appleAddToCompare()
                .successfulAddToCompareAlert();
    }

    @Test
    public void loginUserTwoProductAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL
                .appleAddToCompare()
                .successfulAddToCompareAlert()
                .macbookAddToCompare()
                .successfulAddToCompareAlert();
    }

    @Test
    public void loginUserSixProductsAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("Samsung SyncMaster 941BW")
                .searchClickOnProduct("Samsung SyncMaster 941BW")
                .addProductToCompare().successfulProductAdding();
        mainPageBL.getHeaderPageBL()
                .useSearch("Nikon D300")
                .searchClickOnProduct("Nikon D300")
                .addProductToCompare().successfulProductAdding();
        mainPageBL.getHeaderPageBL()
                .useSearch("apple")
                .searchInDescription()
                .searchClickOnProduct("Apple Cinema 30\"")
                .addProductToCompare().successfulProductAdding();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToCompare().successfulAddToCompareAlert()
                .canonAddToCompare().successfulAddToCompareAlert()
                .macbookAddToCompare().successfulAddToCompareAlert();
    }
}