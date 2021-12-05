package CurencyChangingTest;

import TestConfigs.baseTest;
import com.opencart.enums.Currencies;
import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.testListener.TestRetry;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class userCurrencyChangingTest extends baseTest {

    @Test(retryAnalyzer = TestRetry.class)
    public void currencyChangingTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageBL()
                .headerCurrencyCaretDownClick()
                .headerCurrencyChoose(Currencies.EURO.getCurrency())
                .checkCurrencySymbol(Currencies.EURO.getSymbol());
    }
}
