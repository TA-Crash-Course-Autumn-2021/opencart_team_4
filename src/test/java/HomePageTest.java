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
    public void fourProductsAddingToCartTest() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.appleAddToCart()
                  .hardFormTemplate();
        mainPageBL.getHeaderPageBL()
                  .headerClickOnHomeButton()
                  .canonAddToCart()
                  .mediumFormTemplate();
        mainPageBL.getHeaderPageBL()
                  .headerClickOnHomeButton()
                  .macbookAddToCart()
                  .successProductAddToCartCheck();
        mainPageBL.getHeaderPageBL()
                  .headerClickOnHomeButton()
                  .iphoneAddToCart()
                  .successProductAddToCartCheck();
    }

    @Test
    public void oneProductAddingToCartUsingSearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("iPhone")
                .searchAddToCart("iPhone")
                .successSearchAddToCartCheck();
    }

    @Test
    public void twoProductsAddingToCartUsingSearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("macbook")
                .searchAddToCart("macbook")
                .successSearchAddToCartCheck()
                .useSearch("iphone")
                .searchAddToCart("iphone")
                .successSearchAddToCartCheck();
    }

    @Test
    public void fourProductsAddingToCartUsingSearch() throws InterruptedException, AWTException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .useSearch("macbook")
                .searchAddToCart("macbook")
                .successSearchAddToCartCheck()
                .useSearch("iPhone")
                .searchAddToCart("iPhone")
                .successSearchAddToCartCheck()
                .useSearch("canon")
                .searchAddToCart("Canon EOS 5D")
                .getMediumForm()
                .mediumFormTemplate();
        mainPageBL.getHeaderPageBL()
                .useSearch("cinema")
                .searchAddToCart("Apple Cinema 30\"")
                .getHardForm()
                .hardFormTemplate();
    }

    @Test
    public void logoutUserAddToWishListNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.iphoneAddToWishList().unsuccessfulAddToWishListAlert();
    }

    @Test void loggedUserAddOneProductsToWishListValidTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }

    @Test void loggedUserAddTwoProductsToWishListValidTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .macbookAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }

    @Test
    public void loginUserFourProductAddToWishList() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .iphoneAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .macbookAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .canonAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton()
                .appleAddToWishList()
                .successfulAddToWishListAlert();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton();
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
        MainPageBL mainPageBL = new MainPageBL();
        HomePageBL homePageBL = new HomePageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton();
        homePageBL.appleAddToCompare()
                .successfulAddToCompareAlert();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton();
    }

    @Test
    public void loginUserTwoProductAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        HomePageBL homePageBL = new HomePageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton();
        homePageBL
                .appleAddToCompare()
                .successfulAddToCompareAlert()
                .macbookAddToCompare()
                .successfulAddToCompareAlert();
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }

    @Test
    public void loginUserSixProductsAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successLoginCheck();
        mainPageBL.getHeaderPageBL()
                .headerClickOnHomeButton();
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
        mainPageBL.getHeaderPageBL().clickOnMyAccountButton().clickOnLogoutButton();
    }
}