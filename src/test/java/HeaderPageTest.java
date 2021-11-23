import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;
import static com.opencart.enums.URLs.BASE_URL;

public class HeaderPageTest extends BaseTest{

    @Test
    public void currencyChoosingTest(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().headerCurrencyCaretDownClick()
                .headerCurrencyChoose(Currencies.POUND.getCurrency());
    }

    @Test
    public void headerLoginPageClickTest(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton();
    }

    @Test
    public void clickOnHeaderUpperCartTest(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .clickOnHeaderUpperCartButton();
    }

    @Test
    public void clickOnHeaderUpperCartTester() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL().getHeaderCart();
    }
}
